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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.annotations.Beta;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** GroundingModuleConfig */
@Beta // CHECKSTYLE:OFF
public class GroundingModuleConfig
// CHECKSTYLE:ON
{
  /** Gets or Sets type */
  public enum TypeEnum {
    /** The DOCUMENT_GROUNDING_SERVICE option of this GroundingModuleConfig */
    DOCUMENT_GROUNDING_SERVICE("document_grounding_service"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this GroundingModuleConfig */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * Get the value of the enum
     *
     * @return The enum value
     */
    @JsonValue
    @Nonnull
    public String getValue() {
      return value;
    }

    /**
     * Get the String value of the enum value.
     *
     * @return The enum value as String
     */
    @Override
    @Nonnull
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * Get the enum value from a String value
     *
     * @param value The String value
     * @return The enum value of type GroundingModuleConfig
     */
    @JsonCreator
    @Nonnull
    public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("config")
  private GroundingModuleConfigConfig config;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for GroundingModuleConfig. */
  protected GroundingModuleConfig() {}

  /**
   * Set the type of this {@link GroundingModuleConfig} instance and return the same instance.
   *
   * @param type The type of this {@link GroundingModuleConfig}
   * @return The same instance of this {@link GroundingModuleConfig} class
   */
  @Nonnull
  public GroundingModuleConfig type(@Nullable final TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type The type of this {@link GroundingModuleConfig} instance.
   */
  @Nullable
  public TypeEnum getType() {
    return type;
  }

  /**
   * Set the type of this {@link GroundingModuleConfig} instance.
   *
   * @param type The type of this {@link GroundingModuleConfig}
   */
  public void setType(@Nullable final TypeEnum type) {
    this.type = type;
  }

  /**
   * Set the config of this {@link GroundingModuleConfig} instance and return the same instance.
   *
   * @param config The config of this {@link GroundingModuleConfig}
   * @return The same instance of this {@link GroundingModuleConfig} class
   */
  @Nonnull
  public GroundingModuleConfig config(@Nonnull final GroundingModuleConfigConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   *
   * @return config The config of this {@link GroundingModuleConfig} instance.
   */
  @Nonnull
  public GroundingModuleConfigConfig getConfig() {
    return config;
  }

  /**
   * Set the config of this {@link GroundingModuleConfig} instance.
   *
   * @param config The config of this {@link GroundingModuleConfig}
   */
  public void setConfig(@Nonnull final GroundingModuleConfigConfig config) {
    this.config = config;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link GroundingModuleConfig}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link GroundingModuleConfig} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "GroundingModuleConfig has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link GroundingModuleConfig} instance. If the map
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
    final GroundingModuleConfig groundingModuleConfig = (GroundingModuleConfig) o;
    return Objects.equals(this.cloudSdkCustomFields, groundingModuleConfig.cloudSdkCustomFields)
        && Objects.equals(this.type, groundingModuleConfig.type)
        && Objects.equals(this.config, groundingModuleConfig.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, config, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class GroundingModuleConfig {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link GroundingModuleConfig}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (type) -> (config) -> new GroundingModuleConfig().type(type).config(config);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the type of this {@link GroundingModuleConfig} instance.
     *
     * @param type The type of this {@link GroundingModuleConfig}
     * @return The GroundingModuleConfig builder.
     */
    Builder1 type(@Nullable final TypeEnum type);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the config of this {@link GroundingModuleConfig} instance.
     *
     * @param config The config of this {@link GroundingModuleConfig}
     * @return The GroundingModuleConfig instance.
     */
    GroundingModuleConfig config(@Nonnull final GroundingModuleConfigConfig config);
  }
}
