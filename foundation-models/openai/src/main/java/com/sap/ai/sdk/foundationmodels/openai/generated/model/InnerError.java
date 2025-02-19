/*
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * Azure OpenAI Service API
 * Azure OpenAI APIs for completions and search
 *
 * The version of the OpenAPI document: 2024-10-21
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.foundationmodels.openai.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Inner error with additional details. */
// CHECKSTYLE:OFF
@com.google.common.annotations.Beta
public class InnerError
// CHECKSTYLE:ON
{
  @JsonProperty("code")
  private InnerErrorCode code;

  @JsonProperty("content_filter_results")
  private ContentFilterPromptResults contentFilterResults;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the code of this {@link InnerError} instance and return the same instance.
   *
   * @param code The code of this {@link InnerError}
   * @return The same instance of this {@link InnerError} class
   */
  @Nonnull
  public InnerError code(@Nullable final InnerErrorCode code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code The code of this {@link InnerError} instance.
   */
  @Nonnull
  public InnerErrorCode getCode() {
    return code;
  }

  /**
   * Set the code of this {@link InnerError} instance.
   *
   * @param code The code of this {@link InnerError}
   */
  public void setCode(@Nullable final InnerErrorCode code) {
    this.code = code;
  }

  /**
   * Set the contentFilterResults of this {@link InnerError} instance and return the same instance.
   *
   * @param contentFilterResults The contentFilterResults of this {@link InnerError}
   * @return The same instance of this {@link InnerError} class
   */
  @Nonnull
  public InnerError contentFilterResults(
      @Nullable final ContentFilterPromptResults contentFilterResults) {
    this.contentFilterResults = contentFilterResults;
    return this;
  }

  /**
   * Get contentFilterResults
   *
   * @return contentFilterResults The contentFilterResults of this {@link InnerError} instance.
   */
  @Nonnull
  public ContentFilterPromptResults getContentFilterResults() {
    return contentFilterResults;
  }

  /**
   * Set the contentFilterResults of this {@link InnerError} instance.
   *
   * @param contentFilterResults The contentFilterResults of this {@link InnerError}
   */
  public void setContentFilterResults(
      @Nullable final ContentFilterPromptResults contentFilterResults) {
    this.contentFilterResults = contentFilterResults;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link InnerError}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link InnerError} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException("InnerError has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link InnerError} instance. If the map previously
   * contained a mapping for the key, the old value is replaced by the specified value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final InnerError innerError = (InnerError) o;
    return Objects.equals(this.cloudSdkCustomFields, innerError.cloudSdkCustomFields)
        && Objects.equals(this.code, innerError.code)
        && Objects.equals(this.contentFilterResults, innerError.contentFilterResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, contentFilterResults, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class InnerError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contentFilterResults: ")
        .append(toIndentedString(contentFilterResults))
        .append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
