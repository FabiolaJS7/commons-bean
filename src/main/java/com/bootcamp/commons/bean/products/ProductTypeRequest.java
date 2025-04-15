package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeRequest {

    private String code;
    private String description;
    private String familyType;
    private Boolean isFreeMaintenanceCommission;
    private Boolean isFreeNumberMovement;
    private Boolean isFreeCommissionPerMovement;
    private BigDecimal maxMovementPerMonth;
    private String dateToUniqueMovement;
    private Double maintenanceCommission;
    private Double movementCommission;
}
