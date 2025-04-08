package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActiveProductBean {

    private Boolean hasCreditCard;
    private Double creditLimit;
    private Double creditLimitUsed;
    private Double creditBalance;
    private CreditCardBean creditCard;
}
