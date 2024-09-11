package backend.greatjourney.domain.community.controller.response;

import backend.greatjourney.domain.login.domain.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PostResponseDTO {
    private User user;



}
