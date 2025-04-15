package com.bootcamp.commons.bean.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlasticCardBean {

    private String id;
    private String productIdAssociated;
    private String cardType;
    private String expirationDate;
    private String cardNumber;
}
