package com.bootcamp.commons.bean.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRQ {

    private String productId;
    private String productType;
    private Double amount;
    private Double amountMoved;
    private String movementType;
    private String result;
    private String observation;
    private String customerId;
    private Double commissionAmount;
}
