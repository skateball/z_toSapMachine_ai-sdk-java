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

/** ContentFilterDetectedWithCitationResult */
// CHECKSTYLE:OFF
@com.google.common.annotations.Beta
public class ContentFilterDetectedWithCitationResult
// CHECKSTYLE:ON
{
  @JsonProperty("filtered")
  private Boolean filtered;

  @JsonProperty("detected")
  private Boolean detected;

  @JsonProperty("citation")
  private ContentFilterDetectedWithCitationResultAllOfCitation citation;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the filtered of this {@link ContentFilterDetectedWithCitationResult} instance and return
   * the same instance.
   *
   * @param filtered The filtered of this {@link ContentFilterDetectedWithCitationResult}
   * @return The same instance of this {@link ContentFilterDetectedWithCitationResult} class
   */
  @Nonnull
  public ContentFilterDetectedWithCitationResult filtered(@Nonnull final Boolean filtered) {
    this.filtered = filtered;
    return this;
  }

  /**
   * Get filtered
   *
   * @return filtered The filtered of this {@link ContentFilterDetectedWithCitationResult} instance.
   */
  @Nonnull
  public Boolean isFiltered() {
    return filtered;
  }

  /**
   * Set the filtered of this {@link ContentFilterDetectedWithCitationResult} instance.
   *
   * @param filtered The filtered of this {@link ContentFilterDetectedWithCitationResult}
   */
  public void setFiltered(@Nonnull final Boolean filtered) {
    this.filtered = filtered;
  }

  /**
   * Set the detected of this {@link ContentFilterDetectedWithCitationResult} instance and return
   * the same instance.
   *
   * @param detected The detected of this {@link ContentFilterDetectedWithCitationResult}
   * @return The same instance of this {@link ContentFilterDetectedWithCitationResult} class
   */
  @Nonnull
  public ContentFilterDetectedWithCitationResult detected(@Nonnull final Boolean detected) {
    this.detected = detected;
    return this;
  }

  /**
   * Get detected
   *
   * @return detected The detected of this {@link ContentFilterDetectedWithCitationResult} instance.
   */
  @Nonnull
  public Boolean isDetected() {
    return detected;
  }

  /**
   * Set the detected of this {@link ContentFilterDetectedWithCitationResult} instance.
   *
   * @param detected The detected of this {@link ContentFilterDetectedWithCitationResult}
   */
  public void setDetected(@Nonnull final Boolean detected) {
    this.detected = detected;
  }

  /**
   * Set the citation of this {@link ContentFilterDetectedWithCitationResult} instance and return
   * the same instance.
   *
   * @param citation The citation of this {@link ContentFilterDetectedWithCitationResult}
   * @return The same instance of this {@link ContentFilterDetectedWithCitationResult} class
   */
  @Nonnull
  public ContentFilterDetectedWithCitationResult citation(
      @Nullable final ContentFilterDetectedWithCitationResultAllOfCitation citation) {
    this.citation = citation;
    return this;
  }

  /**
   * Get citation
   *
   * @return citation The citation of this {@link ContentFilterDetectedWithCitationResult} instance.
   */
  @Nonnull
  public ContentFilterDetectedWithCitationResultAllOfCitation getCitation() {
    return citation;
  }

  /**
   * Set the citation of this {@link ContentFilterDetectedWithCitationResult} instance.
   *
   * @param citation The citation of this {@link ContentFilterDetectedWithCitationResult}
   */
  public void setCitation(
      @Nullable final ContentFilterDetectedWithCitationResultAllOfCitation citation) {
    this.citation = citation;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link
   * ContentFilterDetectedWithCitationResult}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link
   * ContentFilterDetectedWithCitationResult} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "ContentFilterDetectedWithCitationResult has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ContentFilterDetectedWithCitationResult}
   * instance. If the map previously contained a mapping for the key, the old value is replaced by
   * the specified value.
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
    final ContentFilterDetectedWithCitationResult contentFilterDetectedWithCitationResult =
        (ContentFilterDetectedWithCitationResult) o;
    return Objects.equals(
            this.cloudSdkCustomFields, contentFilterDetectedWithCitationResult.cloudSdkCustomFields)
        && Objects.equals(this.filtered, contentFilterDetectedWithCitationResult.filtered)
        && Objects.equals(this.detected, contentFilterDetectedWithCitationResult.detected)
        && Objects.equals(this.citation, contentFilterDetectedWithCitationResult.citation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filtered, detected, citation, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ContentFilterDetectedWithCitationResult {\n");
    sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
    sb.append("    detected: ").append(toIndentedString(detected)).append("\n");
    sb.append("    citation: ").append(toIndentedString(citation)).append("\n");
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
