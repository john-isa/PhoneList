/*
 * Customer Phone List
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: john.isailofski@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.isailofski.phonelist.springbootclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ResultCode of a given request
 */
@ApiModel(description = "ResultCode of a given request")
@JsonPropertyOrder({
    RequestResultDto.JSON_PROPERTY_CODE,
    RequestResultDto.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-08T13:43:47.164719+11:00[Australia/Melbourne]")
public class RequestResultDto {
  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code = 1;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description = "SUCCESS";

  public RequestResultDto code(Integer code) {

    this.code = code;
    return this;
  }

  /**
   * received code for a response
   * minimum: 0
   * 
   * @return code
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "received code for a response")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RequestResultDto description(String description) {

    this.description = description;
    return this;
  }

  /**
   * received description for response
   * 
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "received description for response")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestResultDto requestResult = (RequestResultDto) o;
    return Objects.equals(this.code, requestResult.code) &&
        Objects.equals(this.description, requestResult.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestResultDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}