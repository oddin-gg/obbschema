docker-build:
	docker build . -t "oddin/buf"

ifeq ($(shell uname),Linux)
    DOCKER_USER=-u $$(id -u):$$(id -g)
    DOCKER_ENV=-e HOME=/tmp
    SED_INPLACE=sed -i -E
else
    DOCKER_USER=
    DOCKER_ENV=
    SED_INPLACE=sed -i '' -E
endif

gen:
	docker run --rm $(DOCKER_USER) $(DOCKER_ENV) -v "$(PWD):/def" -w /def oddin/buf generate
	bash ./scripts/python_fix_imports.sh "$(SED_INPLACE)"
	./scripts/python_packages.sh

lint:
	docker run --rm $(DOCKER_USER) $(DOCKER_ENV) -v "$(PWD):/def" -w /def oddin/buf lint
