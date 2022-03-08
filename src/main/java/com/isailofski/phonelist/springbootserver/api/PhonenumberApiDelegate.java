package com.isailofski.phonelist.springbootserver.api;

import com.isailofski.phonelist.springbootserver.model.GetPhoneListByCustomerResponseDto;
import com.isailofski.phonelist.springbootserver.model.GetPhoneNumbersResponseDto;
import com.isailofski.phonelist.springbootserver.model.PostPhoneNumberListRequestDto;
import com.isailofski.phonelist.springbootserver.model.PostPhoneNumberListResponseDto;
import com.isailofski.phonelist.springbootserver.model.PutPhoneNumberListRequestDto;
import com.isailofski.phonelist.springbootserver.model.PutPhoneNumberListResponseDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PhonenumberApiController}}.
 * Implement this interface with a
 * {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public interface PhonenumberApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /phonenumber/{customerId} : Retrieve all phone numbers attached to a
     * customer
     *
     * @return OK (status code 200)
     * @see PhonenumberApi#getPhoneNumberByCustomer
     */
    default ResponseEntity<GetPhoneListByCustomerResponseDto> getPhoneNumberByCustomer() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"code\" : 1, \"description\" : \"SUCCESS\" }, \"phoneDetails\" : { \"phones\" : [ { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" }, { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" } ], \"customer\" : { \"firstName\" : \"Frederick\", \"lastName\" : \"Frederick\", \"customerId\" : 0, \"middleName\" : \"Frederick\", \"status\" : \"inactive\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /phonenumber : Retrieve all phone numbers
     *
     * @return OK (status code 200)
     * @see PhonenumberApi#getPhoneNumbers
     */
    default ResponseEntity<GetPhoneNumbersResponseDto> getPhoneNumbers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"code\" : 1, \"description\" : \"SUCCESS\" }, \"phoneDetails\" : [ { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" }, { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /phonenumber : Create one or more new phone numbers
     *
     * @param postPhoneNumberListRequestDto (required)
     * @return OK (status code 200)
     * @see PhonenumberApi#postPhoneNumber
     */
    default ResponseEntity<PostPhoneNumberListResponseDto> postPhoneNumber(
            PostPhoneNumberListRequestDto postPhoneNumberListRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"code\" : 1, \"description\" : \"SUCCESS\" }, \"phoneDetails\" : [ { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" }, { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /phonenumber : Activate phone number(s) and attach to a customer
     *
     * @param putPhoneNumberListRequestDto (required)
     * @return OK (status code 200)
     * @see PhonenumberApi#putPhoneNumberByCustomer
     */
    default ResponseEntity<PutPhoneNumberListResponseDto> putPhoneNumberByCustomer(
            PutPhoneNumberListRequestDto putPhoneNumberListRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"code\" : 1, \"description\" : \"SUCCESS\" }, \"phoneDetails\" : { \"phones\" : [ { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" }, { \"country_code\" : \"061\", \"phone_type\" : \"mobile\", \"area_code\" : \"03\", \"customerId\" : 0, \"phone_num\" : \"1111222333\", \"phone_id\" : 0, \"status\" : \"inactive\" } ], \"customer\" : { \"firstName\" : \"Frederick\", \"lastName\" : \"Frederick\", \"customerId\" : 0, \"middleName\" : \"Frederick\", \"status\" : \"inactive\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
