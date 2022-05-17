package hufs.graduation.paper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserDetailDTO {
    private int id;
    private String name;
    private String password;
    private String tel;
    private List<OrderDTO> orderIds;
}
