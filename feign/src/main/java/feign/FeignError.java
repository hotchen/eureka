package feign;

import entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-16.
 */
@Component
public class FeignError implements  FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护。。。";
    }
}
