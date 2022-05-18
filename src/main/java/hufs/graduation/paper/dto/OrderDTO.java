package hufs.graduation.paper.dto;

import hufs.graduation.paper.entity.OrderProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class OrderDTO {
    private int id;
    private int orderUserId;
    private String orderDate;
    private List<Integer> productId;
}
