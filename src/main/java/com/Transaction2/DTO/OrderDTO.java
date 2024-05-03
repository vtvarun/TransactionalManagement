package com.Transaction2.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private Integer productId;

    private boolean isPaid;

    private Integer customerId;

    private boolean isDelivered;

    private Integer quantity;
}
