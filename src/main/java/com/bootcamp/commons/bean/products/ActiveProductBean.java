package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ActiveProductBean {

    private Boolean hasCreditCard;
    private Double creditLimit;
    private Double creditLimitEnabled;
    private Double creditLimitUsed;
}
