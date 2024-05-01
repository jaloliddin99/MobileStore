package uz.cau.mobilestore.main;

import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.cau.mobilestore.main.data.MobileDTO;
import uz.cau.mobilestore.main.data.ModelSuccess;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/phone/")
public class MainController {


    private final MainService mainService;


    @GetMapping("get-result")
    public String getResult(){
        return "Hello This is me.";
    }
    @PostMapping("save-date")
    public ModelSuccess postPhone(
            @RequestBody MobileDTO body
            ){
        return mainService.savePhone(body);
    }

    @GetMapping
    public ModelSuccess getAllPhones(){
        return mainService.getAllPhones();
    }

    @GetMapping("{phoneId}")
    public ModelSuccess getPhoneById(
            @PathVariable("phoneId") Integer phoneId
    ){
        return mainService.getPhoneById(phoneId);
    }









}
