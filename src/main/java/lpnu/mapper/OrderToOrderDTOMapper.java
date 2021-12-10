package lpnu.mapper;

import lpnu.dto.UserDTO;
import lpnu.entity.User;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDTOMapper {
    public User toEntity(final OrderDTO orderDTO){
        return new User(
                orderDTO.getId(),
                orderDTO.getPizza()
               );
    }
    public UserDTO toDTO(final Order order){
        return new UserDTO(
                order.getId(),
                order.getPizza()
                );
    }
}