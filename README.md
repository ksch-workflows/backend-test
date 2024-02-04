# Backend Test

## Maintenance

### Re-generate Java SDK

```sh
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/ksch-workflows/backend/main/docs/openapi.yml \
    -g java \
    --library native \
    -o /local/src/main/java
```

**Also see**

- https://github.com/OpenAPITools/openapi-generator
- https://openapi-generator.tech/docs/generators/java/
