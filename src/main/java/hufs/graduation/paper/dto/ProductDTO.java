package hufs.graduation.paper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ProductDTO {
    private int id;
    private String productName;
    private String price;
}
