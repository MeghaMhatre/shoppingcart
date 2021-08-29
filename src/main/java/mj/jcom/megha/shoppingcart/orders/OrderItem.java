package mj.jcom.megha.shoppingcart.orders;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity

public class OrderItem {

    private Long orderId;

    private Long productId;

}
