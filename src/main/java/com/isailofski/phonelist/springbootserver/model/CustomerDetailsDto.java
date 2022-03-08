package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.StatusDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * the customer&#39;s details
 */
@ApiModel(description = "the customer's details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class CustomerDetailsDto {
  @JsonProperty("customerId")
  private Integer customerId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("status")
  private StatusDto status;

  public CustomerDetailsDto customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The ID number of the customer
   * minimum: 0
   * 
   * @return customerId
   */
  @ApiModelProperty(example = "0", value = "The ID number of the customer")

  @Min(0)
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public CustomerDetailsDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first-name of the customer
   * 
   * @return firstName
   */
  @ApiModelProperty(example = "Frederick", value = "The first-name of the customer")

  @Size(max = 256)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CustomerDetailsDto middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * The middle-name of the customer (if any)
   * 
   * @return middleName
   */
  @ApiModelProperty(example = "Frederick", value = "The middle-name of the customer (if any)")

  @Size(max = 256)
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public CustomerDetailsDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last-name of the customer
   * 
   * @return lastName
   */
  @ApiModelProperty(example = "Frederick", value = "The last-name of the customer")

  @Size(max = 256)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CustomerDetailsDto status(StatusDto status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */
  @ApiModelProperty(value = "")

  @Valid

  public StatusDto getStatus() {
    return status;
  }

  public void setStatus(StatusDto status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetailsDto customerDetails = (CustomerDetailsDto) o;
    return Objects.equals(this.customerId, customerDetails.customerId) &&
        Objects.equals(this.firstName, customerDetails.firstName) &&
        Objects.equals(this.middleName, customerDetails.middleName) &&
        Objects.equals(this.lastName, customerDetails.lastName) &&
        Objects.equals(this.status, customerDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, middleName, lastName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDetailsDto {\n");

    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
