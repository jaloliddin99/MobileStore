package uz.cau.mobilestore.main;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import uz.cau.mobilestore.main.data.MobileDTO;
import uz.cau.mobilestore.main.data.MobileTable;
import uz.cau.mobilestore.main.data.ModelSuccess;

import java.util.List;

@Service
@AllArgsConstructor
public class MainService {

    private final MainRepository repository;
    public ModelSuccess getAllPhones() {

        List<MobileTable> phoneList = repository.findAll();


        return null;
    }

    public ModelSuccess savePhone(MobileDTO body) {
        return null;
    }

    public ModelSuccess getPhoneById(Integer phoneId) {
        return null;
    }
}
