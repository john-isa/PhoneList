package com.isailofski.phonelist.springbootclient.api;

import com.isailofski.phonelist.springbootclient.client.ApiClient;

import com.isailofski.phonelist.springbootclient.model.GetPhoneListByCustomerResponseDto;
import com.isailofski.phonelist.springbootclient.model.GetPhoneNumbersResponseDto;
import com.isailofski.phonelist.springbootclient.model.PostCustomerListRequestDto;
import com.isailofski.phonelist.springbootclient.model.PostCustomerListResponseDto;
import com.isailofski.phonelist.springbootclient.model.PostPhoneNumberListRequestDto;
import com.isailofski.phonelist.springbootclient.model.PostPhoneNumberListResponseDto;
import com.isailofski.phonelist.springbootclient.model.PutCustomerDetailsRequestDto;
import com.isailofski.phonelist.springbootclient.model.PutPhoneNumberListRequestDto;
import com.isailofski.phonelist.springbootclient.model.PutPhoneNumberListResponseDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-08T13:43:47.164719+11:00[Australia/Melbourne]")
@Component("com.isailofski.phonelist.springbootclient.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve all phone numbers attached to a customer
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @return GetPhoneListByCustomerResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public GetPhoneListByCustomerResponseDto getPhoneNumberByCustomer() throws RestClientException {
        return getPhoneNumberByCustomerWithHttpInfo().getBody();
    }

    /**
     * Retrieve all phone numbers attached to a customer
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @return ResponseEntity&lt;GetPhoneListByCustomerResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<GetPhoneListByCustomerResponseDto> getPhoneNumberByCustomerWithHttpInfo()
            throws RestClientException {
        Object postBody = null;

        String path = apiClient.expandPath("/phonenumber/{customerId}", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<GetPhoneListByCustomerResponseDto> returnType = new ParameterizedTypeReference<GetPhoneListByCustomerResponseDto>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }

    /**
     * Retrieve all phone numbers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @return GetPhoneNumbersResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public GetPhoneNumbersResponseDto getPhoneNumbers() throws RestClientException {
        return getPhoneNumbersWithHttpInfo().getBody();
    }

    /**
     * Retrieve all phone numbers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @return ResponseEntity&lt;GetPhoneNumbersResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<GetPhoneNumbersResponseDto> getPhoneNumbersWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = apiClient.expandPath("/phonenumber", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<GetPhoneNumbersResponseDto> returnType = new ParameterizedTypeReference<GetPhoneNumbersResponseDto>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }

    /**
     * Create one or more phone customers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param postCustomerListRequestDto (optional)
     * @return PostCustomerListResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public PostCustomerListResponseDto postNewCustomer(PostCustomerListRequestDto postCustomerListRequestDto)
            throws RestClientException {
        return postNewCustomerWithHttpInfo(postCustomerListRequestDto).getBody();
    }

    /**
     * Create one or more phone customers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param postCustomerListRequestDto (optional)
     * @return ResponseEntity&lt;PostCustomerListResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<PostCustomerListResponseDto> postNewCustomerWithHttpInfo(
            PostCustomerListRequestDto postCustomerListRequestDto) throws RestClientException {
        Object postBody = postCustomerListRequestDto;

        String path = apiClient.expandPath("/customer", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<PostCustomerListResponseDto> returnType = new ParameterizedTypeReference<PostCustomerListResponseDto>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }

    /**
     * Create one or more new phone numbers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param postPhoneNumberListRequestDto (required)
     * @return PostPhoneNumberListResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public PostPhoneNumberListResponseDto postPhoneNumber(PostPhoneNumberListRequestDto postPhoneNumberListRequestDto)
            throws RestClientException {
        return postPhoneNumberWithHttpInfo(postPhoneNumberListRequestDto).getBody();
    }

    /**
     * Create one or more new phone numbers
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param postPhoneNumberListRequestDto (required)
     * @return ResponseEntity&lt;PostPhoneNumberListResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<PostPhoneNumberListResponseDto> postPhoneNumberWithHttpInfo(
            PostPhoneNumberListRequestDto postPhoneNumberListRequestDto) throws RestClientException {
        Object postBody = postPhoneNumberListRequestDto;

        // verify the required parameter 'postPhoneNumberListRequestDto' is set
        if (postPhoneNumberListRequestDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'postPhoneNumberListRequestDto' when calling postPhoneNumber");
        }

        String path = apiClient.expandPath("/phonenumber", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<PostPhoneNumberListResponseDto> returnType = new ParameterizedTypeReference<PostPhoneNumberListResponseDto>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }

    /**
     * Activate phone number(s) and attach to a customer
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param putPhoneNumberListRequestDto (required)
     * @return PutPhoneNumberListResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public PutPhoneNumberListResponseDto putPhoneNumberByCustomer(
            PutPhoneNumberListRequestDto putPhoneNumberListRequestDto) throws RestClientException {
        return putPhoneNumberByCustomerWithHttpInfo(putPhoneNumberListRequestDto).getBody();
    }

    /**
     * Activate phone number(s) and attach to a customer
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param putPhoneNumberListRequestDto (required)
     * @return ResponseEntity&lt;PutPhoneNumberListResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<PutPhoneNumberListResponseDto> putPhoneNumberByCustomerWithHttpInfo(
            PutPhoneNumberListRequestDto putPhoneNumberListRequestDto) throws RestClientException {
        Object postBody = putPhoneNumberListRequestDto;

        // verify the required parameter 'putPhoneNumberListRequestDto' is set
        if (putPhoneNumberListRequestDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'putPhoneNumberListRequestDto' when calling putPhoneNumberByCustomer");
        }

        String path = apiClient.expandPath("/phonenumber", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<PutPhoneNumberListResponseDto> returnType = new ParameterizedTypeReference<PutPhoneNumberListResponseDto>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }

    /**
     * Update one or more customer&#39;s details
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param putCustomerDetailsRequestDto User details for update to the database
     *                                     are here (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public String putUpdateCustomer(PutCustomerDetailsRequestDto putCustomerDetailsRequestDto)
            throws RestClientException {
        return putUpdateCustomerWithHttpInfo(putCustomerDetailsRequestDto).getBody();
    }

    /**
     * Update one or more customer&#39;s details
     * 
     * <p>
     * <b>200</b> - OK
     * 
     * @param putCustomerDetailsRequestDto User details for update to the database
     *                                     are here (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the
     *                             API
     */
    public ResponseEntity<String> putUpdateCustomerWithHttpInfo(
            PutCustomerDetailsRequestDto putCustomerDetailsRequestDto) throws RestClientException {
        Object postBody = putCustomerDetailsRequestDto;

        // verify the required parameter 'putCustomerDetailsRequestDto' is set
        if (putCustomerDetailsRequestDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'putCustomerDetailsRequestDto' when calling putUpdateCustomer");
        }

        String path = apiClient.expandPath("/customer/{customerId}", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams,
                accept, contentType, authNames, returnType);
    }
}
