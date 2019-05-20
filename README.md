# Camel CI Gradle Test Project

## Usage

### Prerequisites

You must have Java 8 (or higher) and Gradle installed on your machine to use this project.

You can check your java version with `java --version`.

You can check if you already have Gradle installed with the command: `gradle -v`.

Otherwise, you can get it with those steps:

- Download a Gradle 5.4.1 binary [here](https://gradle.org/next-steps/?version=5.4.1&format=bin)
- Extract it and add gradle/bin to your path

### Building/Rebuilding the project

```bash
gradle clean assemble
```

### Running Tests

```bash
gradle test
```

### Running the application

```bash
gradle -q hello
```
