FROM eclipse-temurin:17-jre-alpine

COPY local local

LABEL version="@version@"

WORKDIR /local/vite-kotlin-js-test

ENTRYPOINT [\
    "java",\
    "-Duser.timezone=UTC",\
    "-jar",\
    "/local/vite-kotlin-js-test/lib/vite-kotlin-js-test-@version@-all.jar",\
    "--settings",\
    "/local/vite-kotlin-js-test/etc/stack.server-docker.yaml"\
]

EXPOSE 8080
