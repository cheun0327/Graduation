package hufs.graduation.paper.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "order_products")
@Getter
public class OrderProduct {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "count")
    private int count;
}
