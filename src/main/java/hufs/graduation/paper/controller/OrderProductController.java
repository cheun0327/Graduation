package hufs.graduation.paper.controller;

import hufs.graduation.paper.service.OrderProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderProductController {

    private final OrderProductService orderProductService;
}
