package BUNNYLOVEBACKEND.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("bunny")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Bunny {
    @Id
    private String id;

    private String orejas;
    private String rostro;
    private String patas;
}

