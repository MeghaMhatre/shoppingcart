package mj.jcom.megha.shoppingcart.products;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Product {

    @GeneratedValue
    @Id
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 100)
    private String description;

    @Column(name = "mfg_date")
    private LocalDate manufacturingDate;

}
