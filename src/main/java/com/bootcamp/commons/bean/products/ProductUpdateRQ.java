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
public class ProductUpdateRQ {

    private String actionToUpdate;
    private String status;
    private ActiveProductBean activeProduct;
    private PassiveProductBean passiveProduct;
    private List<AdditionalPersonBean> holders;
    private List<AdditionalPersonBean> authorizedSignatories;
}
