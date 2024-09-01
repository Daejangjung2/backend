package backend.greatjourney.domain.community.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chat_Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //기본 키가 될 id

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; //우혁이가 만든 user를 여기에 넣어주면 된다.

    private String room_name;

}
