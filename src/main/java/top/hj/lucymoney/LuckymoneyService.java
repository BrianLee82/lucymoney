package top.hj.lucymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/***
 @ClassName: LuckymoneyService
 *@Description:
 *@Author: Brian
 *@Date: 2020/3/4 10:49 下午 
 *@Version: V1.0
 **/
@Service
public class LuckymoneyService {

    @Autowired
    private LuckmoneyRepository repository;

    @Transactional
    public void createTwo(){
        Luckymoney luckymoney=new Luckymoney();
        luckymoney.setProducer("王五");
        luckymoney.setMoney(new BigDecimal(520));
        repository.save(luckymoney);

        Luckymoney luckymoney2=new Luckymoney();
        luckymoney2.setProducer("马六");
        luckymoney2.setMoney(new BigDecimal(1314));
        repository.save(luckymoney2);
        //just a test.
    }
}
