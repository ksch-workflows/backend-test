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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PatientCategory
 */
public enum PatientCategory {
  
  GENERAL("GENERAL"),
  
  INPATIENT("INPATIENT"),
  
  OUTPATIENT("OUTPATIENT");

  private String value;

  PatientCategory(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PatientCategory fromValue(String value) {
    for (PatientCategory b : PatientCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

