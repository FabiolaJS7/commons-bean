package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoTransactionBean {

    private Double commission;
    private String maxPerMonth;
    private String transactionDone;
    private Boolean enabledToMovement;


}
