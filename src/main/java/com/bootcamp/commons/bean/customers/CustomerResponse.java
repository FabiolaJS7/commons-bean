package com.bootcamp.commons.bean.customers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
    private String id;
    private String name;
    private String lastName;
    private String typeClient;
    private String phone;
    private String email;
    private String identificationType;
    private String numIdentification;


}
