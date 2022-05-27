package hufs.graduation.paper.entity;

import lombok.Getter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
public class Order {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "order_date")
    private String orderDate;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts = new ArrayList<OrderProduct>();

}
