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
import com.isailofski.phonelist.springbootclient.model.PhoneNumberDetailsDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Create one or more phone numbers
 */
@ApiModel(description = "Create one or more phone numbers")
@JsonPropertyOrder({
    PostPhoneNumberListRequestDto.JSON_PROPERTY_PHONE_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-08T13:43:47.164719+11:00[Australia/Melbourne]")
public class PostPhoneNumberListRequestDto {
  public static final String JSON_PROPERTY_PHONE_DETAILS = "phoneDetails";
  private List<PhoneNumberDetailsDto> phoneDetails = null;

  public PostPhoneNumberListRequestDto phoneDetails(List<PhoneNumberDetailsDto> phoneDetails) {

    this.phoneDetails = phoneDetails;
    return this;
  }

  public PostPhoneNumberListRequestDto addPhoneDetailsItem(PhoneNumberDetailsDto phoneDetailsItem) {
    if (this.phoneDetails == null) {
      this.phoneDetails = new ArrayList<PhoneNumberDetailsDto>();
    }
    this.phoneDetails.add(phoneDetailsItem);
    return this;
  }

  /**
   * list of phone numbers
   * 
   * @return phoneDetails
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of phone numbers")
  @JsonProperty(JSON_PROPERTY_PHONE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhoneNumberDetailsDto> getPhoneDetails() {
    return phoneDetails;
  }

  public void setPhoneDetails(List<PhoneNumberDetailsDto> phoneDetails) {
    this.phoneDetails = phoneDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPhoneNumberListRequestDto postPhoneNumberListRequest = (PostPhoneNumberListRequestDto) o;
    return Objects.equals(this.phoneDetails, postPhoneNumberListRequest.phoneDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPhoneNumberListRequestDto {\n");
    sb.append("    phoneDetails: ").append(toIndentedString(phoneDetails)).append("\n");
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
