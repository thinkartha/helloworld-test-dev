# helloworld-test-dev

Spring Boot application with a basic REST controller that returns "Hello World" and the current environment name.

## Run

```bash
./mvnw spring-boot:run
```

Or with Maven installed:

```bash
mvn spring-boot:run
```

## Hello endpoint

- **GET** `http://localhost:8080/hello`

Returns JSON:

```json
{
  "message": "Hello World",
  "environment": "local"
}
```

## Environment name

- **Default:** `local` (when no profile or env var is set)
- **Profile:** `--spring.profiles.active=dev`, `qa`, or `prod` → `environment` is `dev`, `qa`, or `prod`
- **Env var:** `ENVIRONMENT_NAME=staging` → `environment` is `staging`

Examples:

```bash
# Dev / QA / Prod profile
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=qa"
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=prod"

# Custom env via env var
ENVIRONMENT_NAME=staging ./mvnw spring-boot:run
```

## Requirements

- Java 17+
