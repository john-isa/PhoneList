package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.isailofski.phonelist.springbootserver.model.StatusDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * telephone number details
 */
@ApiModel(description = "telephone number details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class PhoneNumberDetailsDto {
  @JsonProperty("phone_id")
  private Integer phoneId;

  @JsonProperty("customerId")
  private Integer customerId;

  /**
   * type of phone system in use by the number
   */
  public enum PhoneTypeEnum {
    MOBILE("mobile"),

    IP("ip"),

    LANDLINE("landline");

    private String value;

    PhoneTypeEnum(String value) {
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
    public static PhoneTypeEnum fromValue(String value) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("phone_type")
  private PhoneTypeEnum phoneType;

  @JsonProperty("country_code")
  private String countryCode;

  @JsonProperty("area_code")
  private String areaCode;

  @JsonProperty("phone_num")
  private String phoneNum;

  @JsonProperty("status")
  private StatusDto status;

  public PhoneNumberDetailsDto phoneId(Integer phoneId) {
    this.phoneId = phoneId;
    return this;
  }

  /**
   * The phone number reference ID
   * minimum: 0
   * 
   * @return phoneId
   */
  @ApiModelProperty(example = "0", value = "The phone number reference ID")

  @Min(0)
  public Integer getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(Integer phoneId) {
    this.phoneId = phoneId;
  }

  public PhoneNumberDetailsDto customerId(Integer customerId) {
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

  public PhoneNumberDetailsDto phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  /**
   * type of phone system in use by the number
   * 
   * @return phoneType
   */
  @ApiModelProperty(example = "mobile", value = "type of phone system in use by the number")

  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }

  public PhoneNumberDetailsDto countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * code for each country
   * 
   * @return countryCode
   */
  @ApiModelProperty(example = "061", value = "code for each country")

  @Size(max = 3)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumberDetailsDto areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * code to define an std area
   * 
   * @return areaCode
   */
  @ApiModelProperty(example = "03", value = "code to define an std area")

  @Size(max = 2)
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneNumberDetailsDto phoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
    return this;
  }

  /**
   * the phone number
   * 
   * @return phoneNum
   */
  @ApiModelProperty(example = "1111222333", value = "the phone number")

  @Size(max = 10)
  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public PhoneNumberDetailsDto status(StatusDto status) {
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
    PhoneNumberDetailsDto phoneNumberDetails = (PhoneNumberDetailsDto) o;
    return Objects.equals(this.phoneId, phoneNumberDetails.phoneId) &&
        Objects.equals(this.customerId, phoneNumberDetails.customerId) &&
        Objects.equals(this.phoneType, phoneNumberDetails.phoneType) &&
        Objects.equals(this.countryCode, phoneNumberDetails.countryCode) &&
        Objects.equals(this.areaCode, phoneNumberDetails.areaCode) &&
        Objects.equals(this.phoneNum, phoneNumberDetails.phoneNum) &&
        Objects.equals(this.status, phoneNumberDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneId, customerId, phoneType, countryCode, areaCode, phoneNum, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberDetailsDto {\n");

    sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
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
