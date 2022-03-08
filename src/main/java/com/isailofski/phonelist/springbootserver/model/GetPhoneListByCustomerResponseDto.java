package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.CustomersNumberDto;
import com.isailofski.phonelist.springbootserver.model.RequestResultDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * received a list of all the telephone numbers for a given customer
 */
@ApiModel(description = "received a list of all the telephone numbers for a given customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class GetPhoneListByCustomerResponseDto {
  @JsonProperty("result")
  private RequestResultDto result;

  @JsonProperty("phoneDetails")
  private CustomersNumberDto phoneDetails;

  public GetPhoneListByCustomerResponseDto result(RequestResultDto result) {
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

  public GetPhoneListByCustomerResponseDto phoneDetails(CustomersNumberDto phoneDetails) {
    this.phoneDetails = phoneDetails;
    return this;
  }

  /**
   * Get phoneDetails
   * 
   * @return phoneDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomersNumberDto getPhoneDetails() {
    return phoneDetails;
  }

  public void setPhoneDetails(CustomersNumberDto phoneDetails) {
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
    GetPhoneListByCustomerResponseDto getPhoneListByCustomerResponse = (GetPhoneListByCustomerResponseDto) o;
    return Objects.equals(this.result, getPhoneListByCustomerResponse.result) &&
        Objects.equals(this.phoneDetails, getPhoneListByCustomerResponse.phoneDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, phoneDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPhoneListByCustomerResponseDto {\n");

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
