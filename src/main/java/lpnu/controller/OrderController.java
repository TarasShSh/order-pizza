

package lpnu.controller;

        import lpnu.dto.OrderDTO;
        import lpnu.service.OrderService;
        import org.springframework.http.ResponseEntity;
        import org.springframework.validation.annotation.Validated;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/dictionary-books")
    public ResponseEntity<List<OrderDTO>> getAllOrders() {
        return ResponseEntity.ok().body(orderService.getAllOrders());
    }

    @GetMapping("/dictionary-books/{id}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable final Long id) {
        return ResponseEntity.ok().body(orderService.getOrderById(id));
    }

    @PostMapping("/dictionary-books")
    public ResponseEntity<OrderDTO> saveOrder(@Validated @RequestBody final OrderDTO orderDTO) {
        return ResponseEntity.ok().body(orderService.saveOrder(orderDTO));
    }

    @PutMapping("/dictionary-books")
    public ResponseEntity<OrderDTO> updateOrder(@Validated @RequestBody final OrderDTO orderDTO) {
        return ResponseEntity.ok().body(orderService.updateOrder(orderDTO));
    }

    @DeleteMapping("/dictionary-books/{id}")
    public ResponseEntity deleteOrderById(@PathVariable final Long id) {
        orderService.deleteOrderById(id);
        return ResponseEntity.ok().build();
    }
}