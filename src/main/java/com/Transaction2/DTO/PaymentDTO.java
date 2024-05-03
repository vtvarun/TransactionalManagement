package com.Transaction2.DTO;

import com.Transaction2.Model.OrderTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Integer orderId;

    private Integer amount;


}
