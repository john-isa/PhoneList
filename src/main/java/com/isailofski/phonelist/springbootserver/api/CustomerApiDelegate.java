package com.isailofski.phonelist.springbootserver.api;

import com.isailofski.phonelist.springbootserver.model.PostCustomerListRequestDto;
import com.isailofski.phonelist.springbootserver.model.PostCustomerListResponseDto;
import com.isailofski.phonelist.springbootserver.model.PutCustomerDetailsRequestDto;
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
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a
 * {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customer : Create one or more phone customers
     *
     * @param postCustomerListRequestDto (optional)
     * @return OK (status code 200)
     * @see CustomerApi#postNewCustomer
     */
    default ResponseEntity<PostCustomerListResponseDto> postNewCustomer(
            PostCustomerListRequestDto postCustomerListRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"code\" : 1, \"description\" : \"SUCCESS\" }, \"phoneDetails\" : [ { \"firstName\" : \"Frederick\", \"lastName\" : \"Frederick\", \"customerId\" : 0, \"middleName\" : \"Frederick\", \"status\" : \"inactive\" }, { \"firstName\" : \"Frederick\", \"lastName\" : \"Frederick\", \"customerId\" : 0, \"middleName\" : \"Frederick\", \"status\" : \"inactive\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /customer/{customerId} : Update one or more customer&#39;s details
     *
     * @param putCustomerDetailsRequestDto User details for update to the database
     *                                     are here (required)
     * @return OK (status code 200)
     * @see CustomerApi#putUpdateCustomer
     */
    default ResponseEntity<String> putUpdateCustomer(PutCustomerDetailsRequestDto putCustomerDetailsRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"SUCCESS\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
