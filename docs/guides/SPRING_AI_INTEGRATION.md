# Spring AI Integration

## Table of Contents

- [Introduction](#introduction)
- [Orchestration Chat Completion](#orchestration-chat-completion)
- [Orchestration Masking](#orchestration-masking)

## Introduction

This guide provides examples of how to use our Spring AI integration with our clients in SAP AI Core
for chat completion tasks using the SAP AI SDK for Java.

First, add the Spring AI dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-core</artifactId>
    <version>1.0.0-M5</version>
</dependency>
...
<repository>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
    <id>spring-milestones</id>
    <name>Spring Milestones</name>
    <url>https://repo.spring.io/milestone</url>
</repository>
```

:::note Spring AI Milestone Version
Note that currently no stable version of Spring AI exists just yet.
The AI SDK currently uses the [M5 milestone](https://spring.io/blog/2024/12/23/spring-ai-1-0-0-m5-released).

Please be aware that future versions of the AI SDK may increase the Spring AI version.
:::

## Orchestration Chat Completion

The Orchestration client is integrated in Spring AI classes:

```java
ChatModel client = new OrchestrationChatModel();
OrchestrationModuleConfig config = new OrchestrationModuleConfig().withLlmConfig(GPT_35_TURBO);
OrchestrationChatOptions opts = new OrchestrationChatOptions(config);

Prompt prompt = new Prompt("What is the capital of France?", opts);
ChatResponse response = client.call(prompt);
```

Please find [an example in our Spring Boot application](../../sample-code/spring-app/src/main/java/com/sap/ai/sdk/app/services/SpringAiOrchestrationService.java).

## Orchestration Masking

Configure Orchestration modules withing Spring AI:

```java
ChatModel client = new OrchestrationChatModel();
OrchestrationModuleConfig config = new OrchestrationModuleConfig().withLlmConfig(GPT_35_TURBO);

val masking =
    DpiMasking.anonymization()
        .withEntities(DPIEntities.EMAIL, DPIEntities.ADDRESS, DPIEntities.LOCATION);

val opts = new OrchestrationChatOptions(config.withMaskingConfig(masking));
val prompt =
    new Prompt(
        "Please write 'Hello World!' to me via email. My email address is foo.bar@baz.ai",
        opts);

ChatResponse response = client.call(prompt);
```

Please
find [an example in our Spring Boot application](../../sample-code/spring-app/src/main/java/com/sap/ai/sdk/app/services/SpringAiOrchestrationService.java).

## Stream chat completion

It's possible to pass a stream of chat completion delta elements, e.g. from the application backend
to the frontend in real-time.

```java
ChatModel client = new OrchestrationChatModel();
OrchestrationModuleConfig config = new OrchestrationModuleConfig().withLlmConfig(GPT_35_TURBO);
OrchestrationChatOptions opts = new OrchestrationChatOptions(config);

Prompt prompt =
    new Prompt(
        "Can you give me the first 100 numbers of the Fibonacci sequence?", opts);
Flux<ChatResponse> flux = client.stream(prompt);

// also possible to keep only the chat completion text
Flux<String> responseFlux = 
    flux.map(chatResponse -> chatResponse.getResult().getOutput().getContent());
```

_Note: A Spring endpoint can return `Flux` instead of `ResponseEntity`._

Please find [an example in our Spring Boot application](../../sample-code/spring-app/src/main/java/com/sap/ai/sdk/app/services/SpringAiOrchestrationService.java).
