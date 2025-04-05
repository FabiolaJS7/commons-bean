package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InfoTransactionBean {

    private Double commission;
    private String maxPerMonth;
    private String transactionDone;
    private Boolean enabledToMovement;


}
