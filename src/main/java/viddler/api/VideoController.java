package main.java.viddler.api;

/**
 * Created by iceman on 6/11/2017.
 */

import main.java.viddler.dao.UserInfoDao;
import main.java.viddler.dao.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class VideoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/test")
    public String test(){
        return "Test String";
    }

    @RequestMapping("/add")
    public void addUser(){
        System.out.println("Adding user");
        UserInfoDao userInfo = new UserInfoDao();
        userInfo.setFirstName("Hardik");
        userInfo.setLastName("Gohil");
        userInfoRepository.save(userInfo);
        System.out.println("Saved .!");
    }

}
