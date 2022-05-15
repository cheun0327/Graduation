package hufs.graduation.paper.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Getter
public class Product {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "price")
    private String price;
}
