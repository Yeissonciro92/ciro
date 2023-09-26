package BUNNYLOVEBACKEND.demo.Services;

import BUNNYLOVEBACKEND.demo.Entity.Bunny;
import BUNNYLOVEBACKEND.demo.Repository.BunnyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BunnyService {
    @Autowired

    BunnyRepository bunnyRepository;

    public void createbunny(){
        Bunny bunny =new Bunny();
        bunny.setOrejas("(^)(^)");
        bunny.setRostro("(^)(^)");
        bunny.setPatas("(^)(^)");
        bunnyRepository.insert(bunny);
    }
}
