/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models.
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.model;

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

/** Basic capabilities like creating deployments and executions. */
@Beta // CHECKSTYLE:OFF
public class BckndServiceCapabilitiesBasic
// CHECKSTYLE:ON
{
  @JsonProperty("staticDeployments")
  private Boolean staticDeployments;

  @JsonProperty("userDeployments")
  private Boolean userDeployments;

  @JsonProperty("createExecutions")
  private Boolean createExecutions;

  @JsonProperty("multitenant")
  private Boolean multitenant;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for BckndServiceCapabilitiesBasic. */
  protected BckndServiceCapabilitiesBasic() {}

  /**
   * Set the staticDeployments of this {@link BckndServiceCapabilitiesBasic} instance and return the
   * same instance.
   *
   * @param staticDeployments There are static always running endpoints that can be used for
   *     inference without the need to do user deployments.
   * @return The same instance of this {@link BckndServiceCapabilitiesBasic} class
   */
  @Nonnull
  public BckndServiceCapabilitiesBasic staticDeployments(
      @Nullable final Boolean staticDeployments) {
    this.staticDeployments = staticDeployments;
    return this;
  }

  /**
   * There are static always running endpoints that can be used for inference without the need to do
   * user deployments.
   *
   * @return staticDeployments The staticDeployments of this {@link BckndServiceCapabilitiesBasic}
   *     instance.
   */
  @Nonnull
  public Boolean isStaticDeployments() {
    return staticDeployments;
  }

  /**
   * Set the staticDeployments of this {@link BckndServiceCapabilitiesBasic} instance.
   *
   * @param staticDeployments There are static always running endpoints that can be used for
   *     inference without the need to do user deployments.
   */
  public void setStaticDeployments(@Nullable final Boolean staticDeployments) {
    this.staticDeployments = staticDeployments;
  }

  /**
   * Set the userDeployments of this {@link BckndServiceCapabilitiesBasic} instance and return the
   * same instance.
   *
   * @param userDeployments Services that only support batch inference typically neither allow
   *     listing nor creation of deployments. For these, userDeployments &#x3D;&#x3D; false
   * @return The same instance of this {@link BckndServiceCapabilitiesBasic} class
   */
  @Nonnull
  public BckndServiceCapabilitiesBasic userDeployments(@Nullable final Boolean userDeployments) {
    this.userDeployments = userDeployments;
    return this;
  }

  /**
   * Services that only support batch inference typically neither allow listing nor creation of
   * deployments. For these, userDeployments &#x3D;&#x3D; false
   *
   * @return userDeployments The userDeployments of this {@link BckndServiceCapabilitiesBasic}
   *     instance.
   */
  @Nonnull
  public Boolean isUserDeployments() {
    return userDeployments;
  }

  /**
   * Set the userDeployments of this {@link BckndServiceCapabilitiesBasic} instance.
   *
   * @param userDeployments Services that only support batch inference typically neither allow
   *     listing nor creation of deployments. For these, userDeployments &#x3D;&#x3D; false
   */
  public void setUserDeployments(@Nullable final Boolean userDeployments) {
    this.userDeployments = userDeployments;
  }

  /**
   * Set the createExecutions of this {@link BckndServiceCapabilitiesBasic} instance and return the
   * same instance.
   *
   * @param createExecutions Services that only support deployment typically neither allow create
   *     executions. For these, createExecutions &#x3D;&#x3D; false
   * @return The same instance of this {@link BckndServiceCapabilitiesBasic} class
   */
  @Nonnull
  public BckndServiceCapabilitiesBasic createExecutions(@Nullable final Boolean createExecutions) {
    this.createExecutions = createExecutions;
    return this;
  }

  /**
   * Services that only support deployment typically neither allow create executions. For these,
   * createExecutions &#x3D;&#x3D; false
   *
   * @return createExecutions The createExecutions of this {@link BckndServiceCapabilitiesBasic}
   *     instance.
   */
  @Nonnull
  public Boolean isCreateExecutions() {
    return createExecutions;
  }

  /**
   * Set the createExecutions of this {@link BckndServiceCapabilitiesBasic} instance.
   *
   * @param createExecutions Services that only support deployment typically neither allow create
   *     executions. For these, createExecutions &#x3D;&#x3D; false
   */
  public void setCreateExecutions(@Nullable final Boolean createExecutions) {
    this.createExecutions = createExecutions;
  }

  /**
   * Set the multitenant of this {@link BckndServiceCapabilitiesBasic} instance and return the same
   * instance.
   *
   * @param multitenant true-&gt; AI API implementation supports resource groups (Main Tenant
   *     scenario), false-&gt; implementation does not support resource groups (Service Tenant
   *     scenario)
   * @return The same instance of this {@link BckndServiceCapabilitiesBasic} class
   */
  @Nonnull
  public BckndServiceCapabilitiesBasic multitenant(@Nullable final Boolean multitenant) {
    this.multitenant = multitenant;
    return this;
  }

  /**
   * true-&gt; AI API implementation supports resource groups (Main Tenant scenario), false-&gt;
   * implementation does not support resource groups (Service Tenant scenario)
   *
   * @return multitenant The multitenant of this {@link BckndServiceCapabilitiesBasic} instance.
   */
  @Nonnull
  public Boolean isMultitenant() {
    return multitenant;
  }

  /**
   * Set the multitenant of this {@link BckndServiceCapabilitiesBasic} instance.
   *
   * @param multitenant true-&gt; AI API implementation supports resource groups (Main Tenant
   *     scenario), false-&gt; implementation does not support resource groups (Service Tenant
   *     scenario)
   */
  public void setMultitenant(@Nullable final Boolean multitenant) {
    this.multitenant = multitenant;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndServiceCapabilitiesBasic}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndServiceCapabilitiesBasic}
   * instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "BckndServiceCapabilitiesBasic has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link BckndServiceCapabilitiesBasic} instance. If the
   * map previously contained a mapping for the key, the old value is replaced by the specified
   * value.
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
    final BckndServiceCapabilitiesBasic bckndServiceCapabilitiesBasic =
        (BckndServiceCapabilitiesBasic) o;
    return Objects.equals(
            this.cloudSdkCustomFields, bckndServiceCapabilitiesBasic.cloudSdkCustomFields)
        && Objects.equals(this.staticDeployments, bckndServiceCapabilitiesBasic.staticDeployments)
        && Objects.equals(this.userDeployments, bckndServiceCapabilitiesBasic.userDeployments)
        && Objects.equals(this.createExecutions, bckndServiceCapabilitiesBasic.createExecutions)
        && Objects.equals(this.multitenant, bckndServiceCapabilitiesBasic.multitenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        staticDeployments, userDeployments, createExecutions, multitenant, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndServiceCapabilitiesBasic {\n");
    sb.append("    staticDeployments: ").append(toIndentedString(staticDeployments)).append("\n");
    sb.append("    userDeployments: ").append(toIndentedString(userDeployments)).append("\n");
    sb.append("    createExecutions: ").append(toIndentedString(createExecutions)).append("\n");
    sb.append("    multitenant: ").append(toIndentedString(multitenant)).append("\n");
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

  /** Create a new {@link BckndServiceCapabilitiesBasic} instance. No arguments are required. */
  public static BckndServiceCapabilitiesBasic create() {
    return new BckndServiceCapabilitiesBasic();
  }
}
