# Welcome!

An exercise to prepare your machine for Cloud Native Weekend.

## Software to install

Use your package manager of choice to install the following software ([homebrew](https://brew.sh/) packages listed).

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (openjdk@17)
- [IntelliJ](https://www.jetbrains.com/idea/download/) (intellij-idea or intellij-idea-ce)
- [PostgreSQL](https://www.postgresql.org/) (postgresql)
- [RabbitMQ](https://www.rabbitmq.com/) (rabbitmq)
- [Prometheus](https://prometheus.io/) (prometheus)
- [Grafana](https://grafana.com/) (grafana)

## Working directory

We will use the `~/workspace` directory for all the exercises.
Create that directory now.

```shell
mkdir ~/workspace
cd ~/workspace
```

## The Exercise

Once your software is installed and running (using `brew services run $SERVICE_NAME` for homebrew), run the tests to
check that everything is working correctly.

```shell
./gradlew test
```

Welcome to the weekend!

© 2022 by Initial Capacity. All rights reserved.
