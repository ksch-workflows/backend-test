/*
 * K.S.C.H. Workflows
 * This website contains the HTTP endpoints that are offered by the [backend](https://github.com/ksch-workflows/backend) component for frontend components of the [K.S.C.H. Workflows](https://ksch-workflows.github.io/) project. 
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ksch.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import ksch.model.Page;
import ksch.model.PatientListResponseEmbedded;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PatientListResponse
 */
@JsonPropertyOrder({
  PatientListResponse.JSON_PROPERTY_EMBEDDED,
  PatientListResponse.JSON_PROPERTY_PAGE
})

public class PatientListResponse {
  public static final String JSON_PROPERTY_EMBEDDED = "embedded";
  private PatientListResponseEmbedded embedded;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Page page;

  public PatientListResponse() { 
  }

  public PatientListResponse embedded(PatientListResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/

  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PatientListResponseEmbedded getEmbedded() {
    return embedded;
  }


  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmbedded(PatientListResponseEmbedded embedded) {
    this.embedded = embedded;
  }


  public PatientListResponse page(Page page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/

  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Page getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Page page) {
    this.page = page;
  }


  /**
   * Return true if this PatientListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientListResponse patientListResponse = (PatientListResponse) o;
    return Objects.equals(this.embedded, patientListResponse.embedded) &&
        Objects.equals(this.page, patientListResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientListResponse {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `embedded` to the URL query string
    if (getEmbedded() != null) {
      joiner.add(getEmbedded().toUrlQueryString(prefix + "embedded" + suffix));
    }

    // add `page` to the URL query string
    if (getPage() != null) {
      joiner.add(getPage().toUrlQueryString(prefix + "page" + suffix));
    }

    return joiner.toString();
  }
}
