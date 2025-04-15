package com.bootcamp.commons.bean.products;

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
    private String statusProduct;
    private Boolean hasPlasticCard;
    private String plasticCardId;
    private List<AdditionalPersonBean> holders;
    private List<AdditionalPersonBean> authorizedSignatories;

}
