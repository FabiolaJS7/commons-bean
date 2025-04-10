package com.bootcamp.commons.bean.customers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String id;
    private String name;
    private String lastName;
    private String typeClient;
    private String phone;
    private String email;
    private String createdBy;
    private String identificationType;
    private String numIdentification;
}
