
package entitie;

/**
 *
 * Создраем сущности"ботинки"
 */
public class Boot {
    
    private String name; // создаем класс  для будущего массива ботинок(для сущностей)
    private String brand; //паблик означает что просматривать и задавать мы можем из любого другого класса, стринг - тип данных строка
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    // переопределяем метот tosting  в case 2 
    
    @Override
    public String toString(){ //публик значит что он доступен из внешнего класса , стринг  раота со сткорой 
    
    return "Boot{" 
            + "name=" +name
            + ",\n brand=" +brand
             + ",\n price=" +price 
            +"\n}";
            
            
    
    } 
}
