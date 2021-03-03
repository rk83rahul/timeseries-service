# timeseries-service

The timeseries-service is an API service that implements the TrendMiner Connector API to provide time series data.
The application has four API endpoints that provide relevant time series data to TrendMiner.

This project uses the Quarkus Framework.
If you want to learn more about Quarkus, you can visit its website: https://quarkus.io/

* GET /api/version
* GET /api/database
* GET /api/v2/tags
* GET /api/v2/tags/indexvalues

## Getting Started
Follow the instructions below to get started.

### Prerequisites
- Java 11

### Running locally
You can run the application locally dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

### Running the tests
```shell script
./gradlew test
```

### Building
```shell script
./gradlew build
```

It produces the `time-series-service-0.0.1-runner.jar` file in the `/build` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar build/time-series-service-0.0.1-runner.jar`.

## Configuration
Configuration is located in the application.properties file in the src/main/resources folder.

## Built with
- Java 11
- [Quarkus](https://quarkus.io/)
- [Gradle](https://gradle.org/) (See [Quarkus with Gradle guide](https://quarkus.io/guides/gradle-tooling))
- JUnit 5
- RestEasy

## Versioning
We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/YaraCG/timeseries-service/tags). References


## References

### RESTEasy JAX-RS

<p>A Hello World RESTEasy resource</p>

Guide: https://quarkus.io/guides/rest-json

### RESTEasy JSON serialisation using Jackson

<p>This example demonstrate RESTEasy JSON serialisation by letting you list, add and remove quark types from a list.</p>
<p><b>Quarked!</b></p>

Guide: https://quarkus.io/guides/rest-json
