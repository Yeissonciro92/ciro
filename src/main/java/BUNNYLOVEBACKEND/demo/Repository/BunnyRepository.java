package BUNNYLOVEBACKEND.demo.Repository;

import BUNNYLOVEBACKEND.demo.Entity.Bunny;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BunnyRepository extends MongoRepository<Bunny, String>
{
}
