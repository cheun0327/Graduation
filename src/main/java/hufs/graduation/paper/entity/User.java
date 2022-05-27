package hufs.graduation.paper.entity;

import lombok.Getter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "tel")
    private String tel;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @BatchSize(size = 10)
    private List<Order> orders = new ArrayList<Order>();

}

