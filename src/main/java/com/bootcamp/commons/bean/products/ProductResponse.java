package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

        private String id;
        private String productType;
        private Double amountOfOpen;
        private String accountNumber;
        private Boolean hasPlasticCard;
        private String cardNumber;
        private LocalDate createdDate;
        private CustomerBean customer;
        private List<AdditionalPersonBean> holders;
        private List<AdditionalPersonBean> authorizedSignatories;

}
