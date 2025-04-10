/*
 * Internal Orchestration Service API
 * SAP AI Core - Orchestration Service API
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** CompletionPostRequest */
@Beta // CHECKSTYLE:OFF
public class CompletionPostRequest
// CHECKSTYLE:ON
{
  @JsonProperty("orchestration_config")
  private OrchestrationConfig orchestrationConfig;

  @JsonProperty("input_params")
  private Map<String, String> inputParams = new HashMap<>();

  @JsonProperty("messages_history")
  private List<ChatMessage> messagesHistory;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for CompletionPostRequest. */
  protected CompletionPostRequest() {}

  /**
   * Set the orchestrationConfig of this {@link CompletionPostRequest} instance and return the same
   * instance.
   *
   * @param orchestrationConfig The orchestrationConfig of this {@link CompletionPostRequest}
   * @return The same instance of this {@link CompletionPostRequest} class
   */
  @Nonnull
  public CompletionPostRequest orchestrationConfig(
      @Nonnull final OrchestrationConfig orchestrationConfig) {
    this.orchestrationConfig = orchestrationConfig;
    return this;
  }

  /**
   * Get orchestrationConfig
   *
   * @return orchestrationConfig The orchestrationConfig of this {@link CompletionPostRequest}
   *     instance.
   */
  @Nonnull
  public OrchestrationConfig getOrchestrationConfig() {
    return orchestrationConfig;
  }

  /**
   * Set the orchestrationConfig of this {@link CompletionPostRequest} instance.
   *
   * @param orchestrationConfig The orchestrationConfig of this {@link CompletionPostRequest}
   */
  public void setOrchestrationConfig(@Nonnull final OrchestrationConfig orchestrationConfig) {
    this.orchestrationConfig = orchestrationConfig;
  }

  /**
   * Set the inputParams of this {@link CompletionPostRequest} instance and return the same
   * instance.
   *
   * @param inputParams The inputParams of this {@link CompletionPostRequest}
   * @return The same instance of this {@link CompletionPostRequest} class
   */
  @Nonnull
  public CompletionPostRequest inputParams(@Nullable final Map<String, String> inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  /**
   * Put one inputParams instance to this {@link CompletionPostRequest} instance.
   *
   * @param key The String key of this inputParams instance
   * @param inputParamsItem The inputParams that should be added under the given key
   * @return The same instance of type {@link CompletionPostRequest}
   */
  @Nonnull
  public CompletionPostRequest putinputParamsItem(
      @Nonnull final String key, @Nonnull final String inputParamsItem) {
    if (this.inputParams == null) {
      this.inputParams = new HashMap<>();
    }
    this.inputParams.put(key, inputParamsItem);
    return this;
  }

  /**
   * Get inputParams
   *
   * @return inputParams The inputParams of this {@link CompletionPostRequest} instance.
   */
  @Nonnull
  public Map<String, String> getInputParams() {
    return inputParams;
  }

  /**
   * Set the inputParams of this {@link CompletionPostRequest} instance.
   *
   * @param inputParams The inputParams of this {@link CompletionPostRequest}
   */
  public void setInputParams(@Nullable final Map<String, String> inputParams) {
    this.inputParams = inputParams;
  }

  /**
   * Set the messagesHistory of this {@link CompletionPostRequest} instance and return the same
   * instance.
   *
   * @param messagesHistory History of chat messages. Can be used to provide system and assistant
   *     messages to set the context of the conversation. Will be merged with the template message
   * @return The same instance of this {@link CompletionPostRequest} class
   */
  @Nonnull
  public CompletionPostRequest messagesHistory(@Nullable final List<ChatMessage> messagesHistory) {
    this.messagesHistory = messagesHistory;
    return this;
  }

  /**
   * Add one messagesHistory instance to this {@link CompletionPostRequest}.
   *
   * @param messagesHistoryItem The messagesHistory that should be added
   * @return The same instance of type {@link CompletionPostRequest}
   */
  @Nonnull
  public CompletionPostRequest addMessagesHistoryItem(
      @Nonnull final ChatMessage messagesHistoryItem) {
    if (this.messagesHistory == null) {
      this.messagesHistory = new ArrayList<>();
    }
    this.messagesHistory.add(messagesHistoryItem);
    return this;
  }

  /**
   * History of chat messages. Can be used to provide system and assistant messages to set the
   * context of the conversation. Will be merged with the template message
   *
   * @return messagesHistory The messagesHistory of this {@link CompletionPostRequest} instance.
   */
  @Nonnull
  public List<ChatMessage> getMessagesHistory() {
    return messagesHistory;
  }

  /**
   * Set the messagesHistory of this {@link CompletionPostRequest} instance.
   *
   * @param messagesHistory History of chat messages. Can be used to provide system and assistant
   *     messages to set the context of the conversation. Will be merged with the template message
   */
  public void setMessagesHistory(@Nullable final List<ChatMessage> messagesHistory) {
    this.messagesHistory = messagesHistory;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link CompletionPostRequest}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link CompletionPostRequest} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "CompletionPostRequest has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link CompletionPostRequest} instance. If the map
   * previously contained a mapping for the key, the old value is replaced by the specified value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final CompletionPostRequest completionPostRequest = (CompletionPostRequest) o;
    return Objects.equals(this.cloudSdkCustomFields, completionPostRequest.cloudSdkCustomFields)
        && Objects.equals(this.orchestrationConfig, completionPostRequest.orchestrationConfig)
        && Objects.equals(this.inputParams, completionPostRequest.inputParams)
        && Objects.equals(this.messagesHistory, completionPostRequest.messagesHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orchestrationConfig, inputParams, messagesHistory, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class CompletionPostRequest {\n");
    sb.append("    orchestrationConfig: ")
        .append(toIndentedString(orchestrationConfig))
        .append("\n");
    sb.append("    inputParams: ").append(toIndentedString(inputParams)).append("\n");
    sb.append("    messagesHistory: ").append(toIndentedString(messagesHistory)).append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Create a type-safe, fluent-api builder object to construct a new {@link CompletionPostRequest}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (orchestrationConfig) ->
        new CompletionPostRequest().orchestrationConfig(orchestrationConfig);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the orchestrationConfig of this {@link CompletionPostRequest} instance.
     *
     * @param orchestrationConfig The orchestrationConfig of this {@link CompletionPostRequest}
     * @return The CompletionPostRequest instance.
     */
    CompletionPostRequest orchestrationConfig(
        @Nonnull final OrchestrationConfig orchestrationConfig);
  }
}
