package com.bootcamp.commons.bean.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRS {

    private String id;
    private String productType;
    private String productId;
    private Double amount;
    private String result;
    private Double commissionAmount;
    private String movementType;
    private String observation;
    private LocalDate dateOfTransaction;
}
