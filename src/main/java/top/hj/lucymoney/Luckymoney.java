package top.hj.lucymoney;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/***
 @ClassName: Luckymoney
 *@Description:
 *@Author: Brian
 *@Date: 2020/3/4 8:51 下午 
 *@Version: V1.0
 **/
@Entity
public class Luckymoney {
    @Id
    @GeneratedValue
    private Integer id;
    private BigDecimal money;
    /**
     * 发送方
     * */
    private String producer;
    /*
    * 接收方
    * */
    private String consumer;

    public Luckymoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
