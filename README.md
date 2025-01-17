[![Build Status](https://travis-ci.org/xm-online/xm-ms-otp.svg?branch=master)](https://travis-ci.org/xm-online/xm-ms-otp) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?&metric=sqale_index&branch=master&project=xm-online:xm-ms-otp)](https://sonarcloud.io/dashboard/index/xm-online:xm-ms-otp) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?&metric=ncloc&branch=master&project=xm-online:xm-ms-otp)](https://sonarcloud.io/dashboard/index/xm-online:xm-ms-otp) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?&metric=coverage&branch=master&project=xm-online:xm-ms-otp)](https://sonarcloud.io/dashboard/index/xm-online:xm-ms-otp)

# otp
This application was generated using JHipster 5.3.4, you can find documentation and help at [https://www.jhipster.tech/documentation-archive/v5.3.4](https://www.jhipster.tech/documentation-archive/v5.3.4).

This is a "microservice" application intended to be part of a microservice architecture, please refer to the [Doing microservices with JHipster][] page of the documentation for more information.

This application is configured for Service Discovery and Configuration with Consul. On launch, it will refuse to start if it is not able to connect to Consul at [http://localhost:8500](http://localhost:8500). For more information, read our documentation on [Service Discovery and Configuration with Consul][].

## Development

To start your application in the dev profile, simply run:

    ./gradlew


For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].



## Building for production

To optimize the otp application for production, run:

    ./gradlew -Pprod clean bootWar

To ensure everything worked, run:

    java -jar build/libs/*.war


Refer to [Using JHipster in production][] for more details.

## Testing

To launch your application's tests, run:

    ./gradlew test
### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in [src/test/gatling](src/test/gatling).

To use those tests, you must install Gatling from [https://gatling.io/](https://gatling.io/).

For more information, refer to the [Running tests page][].

### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker-compose -f src/main/docker/sonar.yml up -d
```

Then, run a Sonar analysis:

```
./gradlew -Pprod clean test sonarqube
```

For more information, refer to the [Code quality page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a postgresql database in a docker container, run:

    docker-compose -f src/main/docker/postgresql.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/postgresql.yml down

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

    ./gradlew bootWar -Pprod buildDocker

Then run:

    docker-compose -f src/main/docker/app.yml up -d

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: https://www.jhipster.tech
[JHipster 5.3.4 archive]: https://www.jhipster.tech/documentation-archive/v5.3.4
[Doing microservices with JHipster]: https://www.jhipster.tech/documentation-archive/v5.3.4/microservices-architecture/
[Using JHipster in development]: https://www.jhipster.tech/documentation-archive/v5.3.4/development/
[Service Discovery and Configuration with Consul]: https://www.jhipster.tech/documentation-archive/v5.3.4/microservices-architecture/#consul
[Using Docker and Docker-Compose]: https://www.jhipster.tech/documentation-archive/v5.3.4/docker-compose
[Using JHipster in production]: https://www.jhipster.tech/documentation-archive/v5.3.4/production/
[Running tests page]: https://www.jhipster.tech/documentation-archive/v5.3.4/running-tests/
[Code quality page]: https://www.jhipster.tech/documentation-archive/v5.3.4/code-quality/
[Setting up Continuous Integration]: https://www.jhipster.tech/documentation-archive/v5.3.4/setting-up-ci/

[Gatling]: http://gatling.io/
