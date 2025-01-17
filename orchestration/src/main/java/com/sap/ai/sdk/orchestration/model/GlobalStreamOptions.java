/*
 * Orchestration
 * Orchestration is an inference service which provides common additional capabilities for business AI scenarios, such as content filtering and data masking. At the core of the service is the LLM module which allows for an easy, harmonized access to the language models of gen AI hub. The service is designed to be modular and extensible, allowing for the addition of new modules in the future. Each module can be configured independently and at runtime, allowing for a high degree of flexibility in the orchestration of AI services.
 *
 * The version of the OpenAPI document: 0.48.2
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Options for streaming. Will be ignored if stream is false. */
@Beta // CHECKSTYLE:OFF
public class GlobalStreamOptions
// CHECKSTYLE:ON
{
  @JsonProperty("chunk_size")
  private Integer chunkSize = 100;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for GlobalStreamOptions. */
  protected GlobalStreamOptions() {}

  /**
   * Set the chunkSize of this {@link GlobalStreamOptions} instance and return the same instance.
   *
   * @param chunkSize Number of characters per chunk that post-LLM modules operate on. Minimum: 1
   *     Maximum: 10000
   * @return The same instance of this {@link GlobalStreamOptions} class
   */
  @Nonnull
  public GlobalStreamOptions chunkSize(@Nullable final Integer chunkSize) {
    this.chunkSize = chunkSize;
    return this;
  }

  /**
   * Number of characters per chunk that post-LLM modules operate on. minimum: 1 maximum: 10000
   *
   * @return chunkSize The chunkSize of this {@link GlobalStreamOptions} instance.
   */
  @Nonnull
  public Integer getChunkSize() {
    return chunkSize;
  }

  /**
   * Set the chunkSize of this {@link GlobalStreamOptions} instance.
   *
   * @param chunkSize Number of characters per chunk that post-LLM modules operate on. Minimum: 1
   *     Maximum: 10000
   */
  public void setChunkSize(@Nullable final Integer chunkSize) {
    this.chunkSize = chunkSize;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link GlobalStreamOptions}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link GlobalStreamOptions} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "GlobalStreamOptions has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link GlobalStreamOptions} instance. If the map
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
    final GlobalStreamOptions globalStreamOptions = (GlobalStreamOptions) o;
    return Objects.equals(this.cloudSdkCustomFields, globalStreamOptions.cloudSdkCustomFields)
        && Objects.equals(this.chunkSize, globalStreamOptions.chunkSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkSize, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class GlobalStreamOptions {\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
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

  /** Create a new {@link GlobalStreamOptions} instance. No arguments are required. */
  public static GlobalStreamOptions create() {
    return new GlobalStreamOptions();
  }
}
