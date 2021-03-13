# Welcome!

A simple dashboard for your Cloud Native Weekend exercises, and an
exercise to prepare your machine for the weekend.

|Exercise|Status|
|:---|:---|
|Jump start| ![Getting started](https://github.com/continuumcollective/jump-start/actions/workflows/build.yml/badge.svg)|
|Simple aged cache| ![Simple aged cache](https://github.com/continuumcollective/simple-aged-cache/actions/workflows/build.yml/badge.svg)|
|Simple aged cache revisited| ![Simple aged cache revisited](https://github.com/continuumcollective/simple-aged-cache-revisited/actions/workflows/build.yml/badge.svg)|
|Provenance| ![Provenance](https://github.com/continuumcollective/provenance/actions/workflows/build.yml/badge.svg)|
|Provenance metrics| ![Provenance metrics](https://github.com/continuumcollective/provenance-metrics/actions/workflows/build.yml/badge.svg)|
|The milk problem| ![The milk problem](https://github.com/continuumcollective/the-milk-problem/actions/workflows/build.yml/badge.svg)|

### Before we start

Do not worry about any missing or broken links above just yet - we will
be creating the repos and enabling the links soon.

Take a quick look at the tech stack we will be using for the exercises.

|Topic|Tool|
|:---|:---|
|Project planning|[Tracker](https://www.pivotaltracker.com/)|
|Package manager|[Homebrew](https://brew.sh/) for MacOS, [Chocolatey](https://chocolatey.org/) for Windows, [Apt](https://wiki.debian.org/Apt) for Debian-Based Linux|
|Language|[Java](https://en.wikipedia.org/wiki/Java_%28programming_language%29), [Kotlin](https://kotlinlang.org/)|
|Build tool|[Gradle](https://gradle.org/)|
|Testing tools|[JUnit](https://junit.org/junit5/), [Mockito](https://site.mockito.org/)|
|Data persistence|[PostgreSQL](https://www.postgresql.org/)|
|Messaging|[RabbitMQ](https://www.rabbitmq.com/)|
|Continuous integration|[GitHub](https://github.com/), [Heroku](https://www.heroku.com/)|
|Continuous delivery|[Heroku](https://www.heroku.com/)|
|Production environment|[Heroku](https://www.heroku.com/)|
|Monitoring|[Prometheus](https://prometheus.io/), [Grafana](https://grafana.com/)|

### Working directory

We will be using `~/workspace` for all the exercises. Setup that
directory now.

```bash
mkdir ~/workspace
cd ~/workspace
```

### IntelliJ

We strongly recommend using [IntelliJ](https://www.jetbrains.com/idea/)
as your IDE.
There is a free [Community Edition](https://www.jetbrains.com/idea/features/editions_comparison_matrix.html)
that will work well for our exercises.

## The Exercise

Get the tests to pass!

- Create a GitHub repository called `jump-start`.
- Download the source code into a directory called `jump-start` in your
  `workspace` directory that your created above.
- Replace `continuumcollective` with your GitHub username for each of
  the README links in the table on top.
- Get the tests to pass. Keep it simple.

Welcome to the weekend!

Thanks, @barinek

© 2021 by Continuum Collective, Inc. All rights reserved.
