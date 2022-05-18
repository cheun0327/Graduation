package hufs.graduation.paper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class OrderProductDTO {
    private int id;
    private int orderId;
    private int itemId;
    private int count;
}
