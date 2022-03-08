package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.CustomerDetailsDto;
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
 * Activate a list of one or more phone numbers and attach them to a customer
 */
@ApiModel(description = "Activate a list of one or more phone numbers and attach them to a customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class PutCustomerDetailsRequestDto {
  @JsonProperty("customerDetails")
  @Valid
  private List<CustomerDetailsDto> customerDetails = null;

  public PutCustomerDetailsRequestDto customerDetails(List<CustomerDetailsDto> customerDetails) {
    this.customerDetails = customerDetails;
    return this;
  }

  public PutCustomerDetailsRequestDto addCustomerDetailsItem(CustomerDetailsDto customerDetailsItem) {
    if (this.customerDetails == null) {
      this.customerDetails = new ArrayList<CustomerDetailsDto>();
    }
    this.customerDetails.add(customerDetailsItem);
    return this;
  }

  /**
   * list of customers
   * 
   * @return customerDetails
   */
  @ApiModelProperty(value = "list of customers")

  @Valid

  public List<CustomerDetailsDto> getCustomerDetails() {
    return customerDetails;
  }

  public void setCustomerDetails(List<CustomerDetailsDto> customerDetails) {
    this.customerDetails = customerDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCustomerDetailsRequestDto putCustomerDetailsRequest = (PutCustomerDetailsRequestDto) o;
    return Objects.equals(this.customerDetails, putCustomerDetailsRequest.customerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCustomerDetailsRequestDto {\n");

    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
