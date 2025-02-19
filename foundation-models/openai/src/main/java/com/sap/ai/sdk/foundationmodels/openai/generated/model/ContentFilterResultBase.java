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

/** ContentFilterResultBase */
// CHECKSTYLE:OFF
@com.google.common.annotations.Beta
public class ContentFilterResultBase
// CHECKSTYLE:ON
{
  @JsonProperty("filtered")
  private Boolean filtered;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the filtered of this {@link ContentFilterResultBase} instance and return the same instance.
   *
   * @param filtered The filtered of this {@link ContentFilterResultBase}
   * @return The same instance of this {@link ContentFilterResultBase} class
   */
  @Nonnull
  public ContentFilterResultBase filtered(@Nonnull final Boolean filtered) {
    this.filtered = filtered;
    return this;
  }

  /**
   * Get filtered
   *
   * @return filtered The filtered of this {@link ContentFilterResultBase} instance.
   */
  @Nonnull
  public Boolean isFiltered() {
    return filtered;
  }

  /**
   * Set the filtered of this {@link ContentFilterResultBase} instance.
   *
   * @param filtered The filtered of this {@link ContentFilterResultBase}
   */
  public void setFiltered(@Nonnull final Boolean filtered) {
    this.filtered = filtered;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ContentFilterResultBase}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ContentFilterResultBase} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "ContentFilterResultBase has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ContentFilterResultBase} instance. If the map
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
  public boolean equals(@Nullable final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ContentFilterResultBase contentFilterResultBase = (ContentFilterResultBase) o;
    return Objects.equals(this.cloudSdkCustomFields, contentFilterResultBase.cloudSdkCustomFields)
        && Objects.equals(this.filtered, contentFilterResultBase.filtered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filtered, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ContentFilterResultBase {\n");
    sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
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
