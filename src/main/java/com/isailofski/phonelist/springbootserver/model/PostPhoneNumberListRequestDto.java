package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.PhoneNumberDetailsDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Create one or more phone numbers
 */
@ApiModel(description = "Create one or more phone numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class PostPhoneNumberListRequestDto {
  @JsonProperty("phoneDetails")
  @Valid
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
   */
  @ApiModelProperty(value = "list of phone numbers")

  @Valid

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
