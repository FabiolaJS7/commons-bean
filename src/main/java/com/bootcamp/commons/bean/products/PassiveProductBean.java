package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PassiveProductBean {

    private Boolean isFreeCommission;
    private Double amountOfOpen;
    private String accountNumber;
    private InfoTransactionBean inforToTransaction;
}
