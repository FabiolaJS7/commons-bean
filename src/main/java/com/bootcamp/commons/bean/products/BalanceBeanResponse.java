package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BalanceBeanResponse {
    private Double balanceAmount;
    private Double creditLimit;
    private Double creditLimitUsed;
    private String result;

}
