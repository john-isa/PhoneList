package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.CustomerDetailsDto;
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
 * phone number(s) for a customer
 */
@ApiModel(description = "phone number(s) for a customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class CustomersNumberDto {
  @JsonProperty("customer")
  private CustomerDetailsDto customer;

  @JsonProperty("phones")
  @Valid
  private List<PhoneNumberDetailsDto> phones = null;

  public CustomersNumberDto customer(CustomerDetailsDto customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * 
   * @return customer
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomerDetailsDto getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerDetailsDto customer) {
    this.customer = customer;
  }

  public CustomersNumberDto phones(List<PhoneNumberDetailsDto> phones) {
    this.phones = phones;
    return this;
  }

  public CustomersNumberDto addPhonesItem(PhoneNumberDetailsDto phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<PhoneNumberDetailsDto>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * 
   * @return phones
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<PhoneNumberDetailsDto> getPhones() {
    return phones;
  }

  public void setPhones(List<PhoneNumberDetailsDto> phones) {
    this.phones = phones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersNumberDto customersNumber = (CustomersNumberDto) o;
    return Objects.equals(this.customer, customersNumber.customer) &&
        Objects.equals(this.phones, customersNumber.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersNumberDto {\n");

    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
