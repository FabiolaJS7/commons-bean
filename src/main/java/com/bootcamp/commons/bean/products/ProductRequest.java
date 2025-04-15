package com.bootcamp.commons.bean.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String productType;
    private String userBank;
    private Double amountOfOpen;
    private CustomerBean customer;
    private List<AdditionalPersonBean> holders;
    private List<AdditionalPersonBean> authorizedSignatories ;
}
