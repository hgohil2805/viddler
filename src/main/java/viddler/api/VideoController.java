package main.java.viddler.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iceman on 5/20/2017.
 */
@RestController
public class VideoController {

    @RequestMapping("/")
    public String getString(){
        return "Hello to All.!";
    }
}
