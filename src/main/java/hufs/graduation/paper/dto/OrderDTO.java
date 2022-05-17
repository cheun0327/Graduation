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
    private int order_user_id;
    private String order_date;
    private List<OrderProductDTO> products;
}
