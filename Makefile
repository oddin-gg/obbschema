docker-build:
	docker build . -t "oddin/buf"

gen:
	docker run --rm -v "$(PWD):/def" -w /def oddin/buf generate
	./scripts/python_fix_imports.sh
	./scripts/python_packages.sh

lint:
	docker run --rm -v "$(PWD):/def" -w /def oddin/buf lint
