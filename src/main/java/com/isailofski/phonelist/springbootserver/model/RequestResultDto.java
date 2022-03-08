package com.isailofski.phonelist.springbootserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultCode of a given request
 */
@ApiModel(description = "ResultCode of a given request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public class RequestResultDto {
  @JsonProperty("code")
  private Integer code = 1;

  @JsonProperty("description")
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
   */
  @ApiModelProperty(example = "1", value = "received code for a response")

  @Min(0)
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
   */
  @ApiModelProperty(example = "SUCCESS", value = "received description for response")

  @Size(max = 2048)
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
