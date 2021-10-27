/*
Создраем сущности " покупатель"
 */
package entitie;

/**
 *
 * @author aleks
 */
public class Customer {
     private String firstName; // создаем класс  для будущего массива Customer (для сущностей)
   private String secondName; //паблик означает что просматривать и задавать мы можем из любого другого класса, стринг - тип данных строка


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    
    
    @Override
    public String toString(){ //публик значит что он доступен из внешнего класса , стринг  раота со сткорой 
    
    return "Customer{" 
            + "firstName=" +firstName
            + ",\n secondName=" +secondName
            +"\n}";
            
            
    
    } 
}
