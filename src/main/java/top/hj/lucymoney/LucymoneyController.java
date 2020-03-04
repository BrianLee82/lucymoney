package top.hj.lucymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/***
 @ClassName: LucymoneyController
 *@Description:
 *@Author: Brian
 *@Date: 2020/3/4 9:03 下午 
 *@Version: V1.0
 **/
@RestController
public class LucymoneyController {

    @Autowired
    private LuckmoneyRepository repository;
    @Autowired
    private LuckymoneyService service;

    /**
     * 获取红包列表
     */
    @GetMapping("/luckymoneys")
    public List<Luckymoney> list(){
        return repository.findAll();
    }

    /*
    * 创建红包（发红包）
    * */
    @PostMapping("/luckymoneys")
    public Luckymoney create(@RequestParam("producer") String producer,
                             @RequestParam("money")BigDecimal money){
        Luckymoney luckymoney=new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return repository.save(luckymoney);
    }

    /*
    *根据ID查询红包
    * */
    @GetMapping("/luckymoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id){
        return repository.findById(id).orElse(null);
    }

    /*
    * 更新红包
    * */
    @PutMapping("/luckymoneys/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,@RequestParam("consumer") String consumer){
        Optional<Luckymoney> optional= repository.findById(id);
        if (optional.isPresent()){
            Luckymoney luckymoney =optional.get();
            luckymoney.setId(id);
            luckymoney.setConsumer(consumer);
            return repository.save(luckymoney);
        }
        return null;
    }

    /*
    * 测试事务
    * */
    @PostMapping("/luckymoneys/two")
    public void createTwo(){
        service.createTwo();
    }

}
