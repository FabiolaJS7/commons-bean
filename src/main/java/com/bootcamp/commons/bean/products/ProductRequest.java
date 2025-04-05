package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ProductRequest {


    private String productType;
    private String familyProduct;
    private String userBank;
    private CustomerBean customer;
    private ActiveProductBean activeProduct;
    private PassiveProductBean passiveProduct;
    private List<AdditionalPersonBean> holders = null;
    private List<AdditionalPersonBean> authorizedSignatories = null;
}
