

# PhoneNumberDetailsDto

telephone number details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneId** | **Integer** | The phone number reference ID |  [optional]
**customerId** | **Integer** | The ID number of the customer |  [optional]
**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) | type of phone system in use by the number |  [optional]
**countryCode** | **String** | code for each country |  [optional]
**areaCode** | **String** | code to define an std area |  [optional]
**phoneNum** | **String** | the phone number |  [optional]
**status** | [**StatusDto**](StatusDto.md) |  |  [optional]



## Enum: PhoneTypeEnum

Name | Value
---- | -----
MOBILE | &quot;mobile&quot;
IP | &quot;ip&quot;
LANDLINE | &quot;landline&quot;



