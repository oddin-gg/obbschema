FROM --platform=$BUILDPLATFORM alpine:3.22.0 AS runner

RUN apk add --update --no-cache nodejs

ENV PATH="${PATH}:/buf/plugin/js/node_modules/.bin:/buf/plugin/js/node_modules/grpc-tools/bin"

FROM node:24.2-alpine3.22 AS node

WORKDIR /js

COPY package.json .
COPY package-lock.json .

RUN npm ci

FROM bufbuild/buf:1.54.0 AS buf

FROM runner

COPY --from=buf /usr/local/bin/buf /usr/local/bin/buf
COPY --from=node /js/node_modules /buf/plugin/js/node_modules

ENTRYPOINT ["/usr/local/bin/buf"]
