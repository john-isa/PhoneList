# DefaultApi

All URIs are relative to *<http://localhost>*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPhoneNumberByCustomer**](DefaultApi.md#getPhoneNumberByCustomer) | **GET** /phonenumber/{customerId} | Retrieve all phone numbers attached to a customer
[**getPhoneNumbers**](DefaultApi.md#getPhoneNumbers) | **GET** /phonenumber | Retrieve all phone numbers
[**postNewCustomer**](DefaultApi.md#postNewCustomer) | **POST** /customer | Create one or more phone customers
[**postPhoneNumber**](DefaultApi.md#postPhoneNumber) | **POST** /phonenumber | Create one or more new phone numbers
[**putPhoneNumberByCustomer**](DefaultApi.md#putPhoneNumberByCustomer) | **PUT** /phonenumber | Activate phone number(s) and attach to a customer
[**putUpdateCustomer**](DefaultApi.md#putUpdateCustomer) | **PUT** /customer/{customerId} | Update one or more customer&#39;s details

## getPhoneNumberByCustomer

> GetPhoneListByCustomerResponseDto getPhoneNumberByCustomer()

Retrieve all phone numbers attached to a customer

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GetPhoneListByCustomerResponseDto result = apiInstance.getPhoneNumberByCustomer();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getPhoneNumberByCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetPhoneListByCustomerResponseDto**](GetPhoneListByCustomerResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## getPhoneNumbers

> GetPhoneNumbersResponseDto getPhoneNumbers()

Retrieve all phone numbers

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GetPhoneNumbersResponseDto result = apiInstance.getPhoneNumbers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getPhoneNumbers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetPhoneNumbersResponseDto**](GetPhoneNumbersResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## postNewCustomer

> PostCustomerListResponseDto postNewCustomer(postCustomerListRequestDto)

Create one or more phone customers

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PostCustomerListRequestDto postCustomerListRequestDto = new PostCustomerListRequestDto(); // PostCustomerListRequestDto | 
        try {
            PostCustomerListResponseDto result = apiInstance.postNewCustomer(postCustomerListRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postNewCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCustomerListRequestDto** | [**PostCustomerListRequestDto**](PostCustomerListRequestDto.md)|  | [optional]

### Return type

[**PostCustomerListResponseDto**](PostCustomerListResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## postPhoneNumber

> PostPhoneNumberListResponseDto postPhoneNumber(postPhoneNumberListRequestDto)

Create one or more new phone numbers

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PostPhoneNumberListRequestDto postPhoneNumberListRequestDto = new PostPhoneNumberListRequestDto(); // PostPhoneNumberListRequestDto | 
        try {
            PostPhoneNumberListResponseDto result = apiInstance.postPhoneNumber(postPhoneNumberListRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postPhoneNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPhoneNumberListRequestDto** | [**PostPhoneNumberListRequestDto**](PostPhoneNumberListRequestDto.md)|  |

### Return type

[**PostPhoneNumberListResponseDto**](PostPhoneNumberListResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## putPhoneNumberByCustomer

> PutPhoneNumberListResponseDto putPhoneNumberByCustomer(putPhoneNumberListRequestDto)

Activate phone number(s) and attach to a customer

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PutPhoneNumberListRequestDto putPhoneNumberListRequestDto = new PutPhoneNumberListRequestDto(); // PutPhoneNumberListRequestDto | 
        try {
            PutPhoneNumberListResponseDto result = apiInstance.putPhoneNumberByCustomer(putPhoneNumberListRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#putPhoneNumberByCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **putPhoneNumberListRequestDto** | [**PutPhoneNumberListRequestDto**](PutPhoneNumberListRequestDto.md)|  |

### Return type

[**PutPhoneNumberListResponseDto**](PutPhoneNumberListResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## putUpdateCustomer

> String putUpdateCustomer(putCustomerDetailsRequestDto)

Update one or more customer&#39;s details

### Example

```java
// Import classes:
import com.isailofski.phonelist.springbootclient.client.ApiClient;
import com.isailofski.phonelist.springbootclient.client.ApiException;
import com.isailofski.phonelist.springbootclient.client.Configuration;
import com.isailofski.phonelist.springbootclient.client.models.*;
import com.isailofski.phonelist.springbootclient.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PutCustomerDetailsRequestDto putCustomerDetailsRequestDto = new PutCustomerDetailsRequestDto(); // PutCustomerDetailsRequestDto | User details for update to the database are here
        try {
            String result = apiInstance.putUpdateCustomer(putCustomerDetailsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#putUpdateCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **putCustomerDetailsRequestDto** | [**PutCustomerDetailsRequestDto**](PutCustomerDetailsRequestDto.md)| User details for update to the database are here |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
