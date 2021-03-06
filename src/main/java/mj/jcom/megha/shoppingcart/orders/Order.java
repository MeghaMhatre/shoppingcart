package mj.jcom.megha.shoppingcart.orders;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Long productId;

    private Long noofproducts;

    private int customerId;

}
