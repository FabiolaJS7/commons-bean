package com.bootcamp.commons.bean.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

        private String id;
        private String productType;
        private String status;
        private String family;
        private Date createdDate;
        private CustomerBean customer;
        private ActiveProductBean activeProduct;
        private PassiveProductBean passiveProduct;
        private List<AdditionalPersonBean> holders;
        private List<AdditionalPersonBean> authorizedSignatories;
}
