![build](https://github.com/SAP/ai-sdk-java/actions/workflows/continuous-integration.yaml/badge.svg?branch=main)
![CodeQL](https://github.com/SAP/ai-sdk-java/actions/workflows/github-code-scanning/codeql/badge.svg)
[![REUSE status](https://api.reuse.software/badge/git.fsfe.org/reuse/api)](https://api.reuse.software/info/git.fsfe.org/reuse/api)
[![Fosstars security rating](https://github.com/SAP/ai-sdk-java/blob/fosstars-report/fosstars_badge.svg)](https://github.com/SAP/ai-sdk-java/blob/fosstars-report/fosstars_report.md)

# <img src="https://sap.github.io/cloud-sdk/img/logo.svg" alt="SAP Cloud SDK" width="30"/> SAP Cloud SDK for AI (for Java)

**SAP Cloud SDK for AI** is the official Software Development Kit (SDK) for **SAP AI Core**, **SAP Generative AI Hub**, and **Orchestration Service**.

This SDK enables developers to seamlessly integrate AI capabilities, such as chat completion, into their Java-based business applications using SAP's Generative AI Hub.
Leverage powerful features like templating, grounding, data masking, and content filtering to build intelligent applications.
The SDK simplifies the setup and interaction with SAP AI Core, allowing you to focus on delivering value through AI integration.

## Table of Contents

- [General Requirements](#general-requirements)
- [Getting Started](#getting-started)
    - [What You'll Build](#what-youll-build)
    - [Prerequisites](#prerequisites)
    - [Use the Orchestration API](#use-the-orchestration-api)
    - [Run the Application Locally](#run-the-application-locally)
    - [Explore Further Capabilities](#explore-further-capabilities)
- [Documentation](#documentation)
- [Build the Project](#build-the-project)
- [FAQs](#faqs)
- [Contribute, Support and Feedback](#contribute-support-and-feedback)
- [Security / Disclosure](#security--disclosure)
- [Code of Conduct](#code-of-conduct)
- [Licensing](#licensing)

## General Requirements

To use the SDK in a Java application, it is necessary to understand the technical prerequisites and required versions for common dependencies.

- Java 17 or higher.
- Access to an **SAP AI Core Service** instance.

Please refer to [this documentation on **how to connect the SDK to AI Core**](docs/guides/CONNECTING_TO_AICORE.md).

The following table lists the required versions, based on the latest release:

| Dependency             | Minimum Version | Recommended Version |
|------------------------|-----------------|---------------------|
| JDK                    | 17 (LTS)        | 21 (LTS)            |
| SAP Cloud SDK          | 5.6.0           | latest              |
| (optional) CAP Java    | 3.0.0           | latest              |
| (optional) Spring Boot | 3.0             | latest              |

See [an example `pom.xml` in our Spring Boot application](sample-code/spring-app/pom.xml).

> [!WARNING]  
> All classes under any of the `...model` packages are generated from an OpenAPI specification and marked as `@Beta`.
> This means that these model classes are not guaranteed to be stable and may change with future releases.
> They are safe to use, but may require updates even in minor releases.

## Getting Started

### What You'll Build

In this quickstart, you'll use the OpenAI GPT-4o model through the [Orchestration Service of AI Core](https://help.sap.com/docs/sap-ai-core/sap-ai-core-service-guide/orchestration) for generating text.
The application will send a prompt to the AI model and display the generated response.

### Prerequisites

This quickstart assumes you have a **deployment of the Orchestration service available** in the `default` resource group of your AI Core instance.
If you don't have a deployment yet, please refer to [this guide](https://help.sap.com/docs/sap-ai-core/sap-ai-core-service-guide/create-deployment-for-orchestration) on how to create one.

### Add the SDK as a Dependency

Add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.sap.ai.sdk</groupId>
    <artifactId>orchestration</artifactId>
    <!-- Use the latest version here -->
    <version>${ai-sdk.version}</version>
</dependency>
```

### Use the Orchestration API

We'll use a `client` to interact with the Orchestration service:

```java
var client = new OrchestrationClient();
```

Next, we'll specify the model we want to use:

```java
var config = new OrchestrationModuleConfig()
        .withLlmConfig(OrchestrationAiModel.GPT_4O);
```

Now we can create our first prompt:

```java
var prompt = new OrchestrationPrompt("Hello world! Why is this phrase so famous?");

var result = client.chatCompletion(prompt, config).getContent();
```

The result will be the text generated by the AI model.

### Run the Application Locally

In order to run the application locally, you need to provide credentials for your AI Core service instance.

For this example we'll use a **service key** and pass it as an **environment variable** to the application.

```shell
cd your-spring-app/

# assuming a bash, for other shells (e.g. PowerShell) see the below documentation
export AICORE_SERVICE_KEY='{ "clientid": "...", "clientsecret": "...", "url": "...", "serviceurls": { "AI_API_URL": "..." } }'

# assuming Maven and a Spring Boot application
mvn spring-boot:run
```

Please find **detailed instructions** and more examples [in this documentation](docs/guides/CONNECTING_TO_AICORE.md#using-the-aicore_service_key-environment-variable).

### Explore Further Capabilities

Check out the options available for the `OrchestrationPrompt` and `OrchestrationModuleConfig` classes.
You can use templating, content filtering, data masking and more.
Please refer to [this documentation](docs/guides/ORCHESTRATION_CHAT_COMPLETION.md) for more information.

## Documentation

For more detailed information and advanced usage, please refer to the following:

- [<img src="sample-code/spring-app/src/main/resources/static/BTP-Cockpit-Logo.png"/> Connecting to AI Core](docs/guides/CONNECTING_TO_AICORE.md)
- [<img src="sample-code/spring-app/src/main/resources/static/Orchestration-Logo.png" width="16"/> Orchestration Chat Completion](docs/guides/ORCHESTRATION_CHAT_COMPLETION.md)
- [<img src="sample-code/spring-app/src/main/resources/static/Open-AI-Logo.svg" width="16"/> OpenAI Chat Completion](docs/guides/OPENAI_CHAT_COMPLETION.md)
- [<img src="https://spring.io/favicon-32x32.png" width="16"/> Spring AI Integration](docs/guides/SPRING_AI_INTEGRATION.md)
- [🧰 AI Core Deployment](docs/guides/AI_CORE_DEPLOYMENT.md)

For updating versions, please refer to the [**Release Notes**](docs/release-notes/release-notes-0-to-14.md).

## Build the Project

You can build the project using Maven:

```shell
mvn clean install -DskipTests
```

This will install the current `SNAPSHOT` version of the project into your local Maven repository.

For SAP internal development, you can also use `SNAPSHOT` builds from the [internal](https://int.repositories.cloud.sap/ui/repos/tree/General/proxy-build-snapshots-cloudsdk/com/sap/ai/sdk) and [internet-facing](https://common.repositories.cloud.sap/artifactory/build-snapshots-cloudsdk/com/sap/ai/sdk/) Artifactory.

## FAQs

### _"How to add a custom header to AI Core requests?"_

The AI SDK leverages the destination concept from the SAP Cloud SDK to manage the connection to AI Core.
This opens up a wide range of possibilities to customize the connection, including adding custom headers.

```java
var service = new AiCoreService();
var service = service.withBaseDestination(
        DefaultHttpDestination.fromDestination(service.getBaseDestination())
          .header("my-header-key", "my-header-value")
          .build()
);
```

For more information, please refer to the [AI Core connectivity guide](./docs/guides/CONNECTING_TO_AICORE.md) and the [SAP Cloud SDK documentation](https://sap.github.io/cloud-sdk/docs/java/features/connectivity/http-destinations).

### _"There's a vulnerability warning `CVE-2021-41251`?"_

This is a known false-positive finding.
Depending on the tooling any product called "SAP Cloud SDK" or similar with a low version number may be marked as vulnerable, incorrectly.
Please consider suppressing the warning, [as we do](https://github.com/SAP/ai-sdk-java/blob/main/.pipeline/dependency-check-suppression.xml).


### _"Are there any example projects?"_

Explore example applications and code snippets:

- [Spring Boot Application Example](sample-code/spring-app)

## Contribute, Support and Feedback

This project is open to feature requests/suggestions, bug reports etc. via [GitHub issues](https://github.com/SAP/ai-sdk-java/issues).
Contribution and feedback are encouraged and always welcome. 
For more information about how to contribute, the project structure, as well as additional contribution information, see our [Contribution Guidelines](CONTRIBUTING.md).

## Security / Disclosure

If you find any bug that may be a security problem, please follow our instructions at [in our security policy](https://github.com/SAP/ai-sdk-java/security/policy) on how to report it. 
Please do not create GitHub issues for security-related doubts or problems.

## Code of Conduct

We as members, contributors, and leaders pledge to make participation in our community a harassment-free experience for everyone. 
By participating in this project, you agree to abide by its [Code of Conduct](https://github.com/SAP/.github/blob/main/CODE_OF_CONDUCT.md) at all times.

## Licensing

Copyright 2024 SAP SE or an SAP affiliate company and ai-sdk-java contributors. Please see our [LICENSE](LICENSE) for copyright and license information. 
Detailed information including third-party components and their licensing/copyright information is available [via the REUSE tool](https://api.reuse.software/info/github.com/SAP/ai-sdk-java).
