# Monitoring API

## Build

```
./mvnw clean install
```

## Configure

See [configuration file](src/main/resources/application.properties).

Options:
* change server port using `--server.port=8081`


## Start

```
./mvnw spring-boot:run
```

or

```
cd target
java -jar mo-0.0.1-SNAPSHOT.jar
```

## Use

http://localhost:8080/root/api/tests for testing the API

http://localhost:8080/root/api/docs for the API documentation