package com.isailofski.phonelist.springbootserver.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-08T13:47:25.649846+11:00[Australia/Melbourne]")

@Controller
@RequestMapping("${openapi.customerPhoneList.base-path:}")
public class CustomerApiController implements CustomerApi {

    private final CustomerApiDelegate delegate;

    public CustomerApiController(
            @org.springframework.beans.factory.annotation.Autowired(required = false) CustomerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CustomerApiDelegate() {
        });
    }

    @Override
    public CustomerApiDelegate getDelegate() {
        return delegate;
    }

}
