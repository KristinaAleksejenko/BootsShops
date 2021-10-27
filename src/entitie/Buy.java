/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitie;

import java.util.Date;

/**
 *
 * @author aleks
 */
public class Buy {
    private Boot boot; // класс из которого выраны обьекты
    private Customer customer;
    private Date buyDate;
    private int money;

    public Boot getBoot() {
        return boot;
    }

    public void setBoot(Boot boot) {
        this.boot = boot;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
        
    @Override
    public String toString(){ 
    
    return "Buy{" 
            + "boot=" +boot.getName()
            + ",\n customer=" +customer
            + ",\n money=" +boot.getPrice()
            + ",\n date=" +buyDate
            +"\n}";
            
    } 

    
}
