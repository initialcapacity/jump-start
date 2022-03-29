# Welcome!

An exercise to prepare your machine for Cloud Native Weekend.

## Software to install

Use your package manager of choice to install the following software ([homebrew](https://brew.sh/) packages listed).

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (_openjdk@17_)
- [IntelliJ](https://www.jetbrains.com/idea/download/) (_intellij-idea_ or _intellij-idea-ce_)
- [PostgreSQL](https://www.postgresql.org/) (_postgresql_)
- [RabbitMQ](https://www.rabbitmq.com/) (_rabbitmq_)
- [Prometheus](https://prometheus.io/) (_prometheus_)
- [Grafana](https://grafana.com/) (_grafana_)

## The exercise

Once your software is installed and running (using `brew services run $SERVICE_NAME` for homebrew), run the tests to
check that everything is working correctly.

```shell
./gradlew test
```

Your machine is ready for the weekend once all the tests pass!

© 2022 by Initial Capacity. All rights reserved.
