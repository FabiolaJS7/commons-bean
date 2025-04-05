package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AdditionalPersonBean {

    private String fullName;
    private String email;
    private String phone;
    private IdentificationBean identification;
}
