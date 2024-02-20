# Backend Test

> Acceptance test suite for the REST API provided by the [backend](https://github.com/ksch-workflows/backend) service

## Dependencies

- Java17+
- Maven
- Docker

## Usage

### Run tests

```sh
mvn test
```

### Write new tests

**Also see**

- https://cucumber.io/
- https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-spring
- [Integrating Cucumber into a Spring Boot Project: A Step-by-Step Guide | medium.com/@francislainy.campos](https://medium.com/@francislainy.campos/integrating-cucumber-into-a-spring-boot-project-a-step-by-step-guide-f899c04bf81f)

## Maintenance

### Re-generate Java SDK

```sh
TEMP_DIR=$(mktemp -d)

# Generate code
docker run --rm -v "${TEMP_DIR}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/ksch-workflows/backend/main/docs/openapi.yml \
    -g java \
    --additional-properties=library=native,apiPackage=ksch,invokerPackage=ksch,modelPackage=ksch.model \
    -o /local
    
# Adopt generated code
rm -rf src/main/java && mkdir -p src/main && cp -r $TEMP_DIR/src/main/java src/main/

# Normalize generated code
find . -name "*.java" | xargs -I{} perl -pi -e 's/.*javax.*//g;' {}
```

**Also see**

- https://github.com/OpenAPITools/openapi-generator
- https://openapi-generator.tech/docs/generators/java/
- https://openapi-generator.tech/docs/configuration/

## References

- https://api.experimental-software.com/
