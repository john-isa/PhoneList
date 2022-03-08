package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.PhoneNumberDetailsDto;
import com.isailofski.phonelist.springbootserver.model.RequestResultDto;
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
 * a list of all the telephone numbers
 */
@ApiModel(description = "a list of all the telephone numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class GetPhoneNumbersResponseDto {
  @JsonProperty("result")
  private RequestResultDto result;

  @JsonProperty("phoneDetails")
  @Valid
  private List<PhoneNumberDetailsDto> phoneDetails = null;

  public GetPhoneNumbersResponseDto result(RequestResultDto result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * 
   * @return result
   */
  @ApiModelProperty(value = "")

  @Valid

  public RequestResultDto getResult() {
    return result;
  }

  public void setResult(RequestResultDto result) {
    this.result = result;
  }

  public GetPhoneNumbersResponseDto phoneDetails(List<PhoneNumberDetailsDto> phoneDetails) {
    this.phoneDetails = phoneDetails;
    return this;
  }

  public GetPhoneNumbersResponseDto addPhoneDetailsItem(PhoneNumberDetailsDto phoneDetailsItem) {
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
    GetPhoneNumbersResponseDto getPhoneNumbersResponse = (GetPhoneNumbersResponseDto) o;
    return Objects.equals(this.result, getPhoneNumbersResponse.result) &&
        Objects.equals(this.phoneDetails, getPhoneNumbersResponse.phoneDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, phoneDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPhoneNumbersResponseDto {\n");

    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
