package top.hj.lucymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/***
 @ClassName: HelloController
 *@Description:
 *@Author: Brian
 *@Date: 2020/3/4 3:55 下午 
 *@Version: V1.0
 **/
//@RestController
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

   @Autowired
   private LimitConfig limitConfig;

    //@GetMapping("/say")
    //@PostMapping("/say")
    //@RequestMapping("/say")
    //@GetMapping("/say")
    //@PostMapping("/say")
    @RequestMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
       // return  "说明："+limitConfig.getDescription();
        //return "index";
        return "id: "+id;
    }
}
