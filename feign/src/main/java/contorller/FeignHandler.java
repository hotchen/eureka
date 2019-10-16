package contorller;

import entity.Student;
import feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-16.
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
@Autowired
private FeignProviderClient feignClient;
@GetMapping("findAll")
    public Collection<Student> findAll(){
    return feignClient.findAll();
}
@GetMapping("/index")
    public  String index(){
    return  feignClient.index();
}
}
