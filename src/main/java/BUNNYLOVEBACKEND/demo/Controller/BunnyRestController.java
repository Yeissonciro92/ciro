package BUNNYLOVEBACKEND.demo.Controller;

import BUNNYLOVEBACKEND.demo.Services.BunnyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BunnyRestController {

    @Autowired
    BunnyService bunnyService;

    @GetMapping("CreateBunny")
    public String createBunny(){
        bunnyService.createbunny();
        return "conejo ya creado";
    }
}
