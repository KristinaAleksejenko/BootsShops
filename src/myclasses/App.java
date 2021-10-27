package myclasses;

import entitie.Boot; //подключаем Boot.java 
import entitie.Buy;
import entitie.Customer;//подключаем Customer.java 

import java.util.ArrayList;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;



public class App {
    Scanner scanner= new Scanner(System.in); // вызов обьекта выводящий текст
    List <Boot> boots = new ArrayList<>(); // вызов обьекта ботинки!!! ЭТО МАССИВ!!!!
    List<Customer> customers = new ArrayList<>(); // вызов обьекта покупатели!! ЭТО МАССИВ!!!!
    List<Buy> buys = new ArrayList<>();
  
    public App(){ 
    
    
    }
    public void run(){ //в главном методе прописывает простейшее меню ,  то есть задаем изначалью переменную 
     String repeat = "y"; //пока переменная равна реп приложение просит от тебя ввода по меню
     do {
         System.out.println("Выберите задачу: ");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить модель");
            System.out.println("2: Список продаваемых моделей");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список зарегистрированных покупателей");
            System.out.println("5: Покупка покупателем обуви");
            System.out.println("6: Доход магазина за все время работы"); //меню 
            System.out.println("7: Чек");
            int menu = scanner.nextInt();//ввод с клавиатуры задачи
//добавляем переменную которая будет отвечать за меню
            scanner.nextLine();// Очистить ввод для эстетики
            switch (menu){         //замена ифа
         case 0:
                System.out.println("Программа закончена");
                repeat="q";
                break;
          case 1:
                System.out.println("Добавить модель.");
                boots.add(addBoot());// создаем отдельный метод  массив- метод добавления ботинок
                break;
          case 2:
               System.out.println("Список продаваемых моделей");//   вызываем цикл for  and cntr space
               // отсчет с нуля до велицины цикла  с шагом в 1
               for (int i = 0; i < boots.size(); i++) {
                 // прописываем условие что он будет выводить из массива те элементы которые не пустые
                  if(boots.get(i)!= null){
                      System.out.println(boots.get(i).toString());
                       
                  }
                                    
              }
                  break;
            
          case 3:
                System.out.println("Добавить покупателя");
                customers.add(addCustomer());
                 break;
     
           
            case 4:
               System.out.println("Список зарегистрированных покупателей");
               for (int i = 0; i < customers.size(); i++) {
                  if(customers.get(i)!= null){
                      System.out.println(customers.get(i).toString());
                  }
                  
              }
              break;
            
            
            case 5:
           
            System.out.println("Покупка покупателем обуви");
            buys.add(addBuy());// создаем отдельный метод  массив- метод добавления покупки
            break;
             
            
             case 7:
               System.out.println("Чек");//   вызываем цикл for  and cntr space
               // отсчет с нуля до велицины цикла  с шагом в 1
               for (int i = 0; i < buys.size(); i++) {
                 // прописываем условие что он будет выводить из массива те элементы которые не пустые
                  if(buys.get(i)!= null){
                      System.out.println(buys.get(i).toString());
                  }
               }
                 
                  break;
             case 6:
                 
                 System.out.println("Доход магазина за все время работы = " + moneySum());
                 
                 
                 
                  break;
                 
                 
     }
     }while("y".equals(repeat));// цикл вайл будет работать до тех пока реп будет равно репит
    
     }
     
    //обьявляем еще один метод частный который может юзаться только в класса Boot.java
    
    private Boot addBoot(){ // метод addBoot() класса Boot

               Boot boot = new Boot();//создаем обьект boot  на остнове класса Boot.java  , 
               //new Boot() конструктор который позволяет создать этот экземпляр 
               System.out.println("Введите название модели: ");
                 boot.setName(scanner.nextLine());// обращаемся к объекту созданному в  привате(внутренний метод) boot  
               System.out.println("Введите название бренда: ");
                 boot.setBrand(scanner.nextLine());
               System.out.println("Введите цену: ");  
                 boot.setPrice(scanner.nextInt());
             scanner.nextLine();// Очистить ввод для эстетики
             // обащаемся в массив boots List <Boot> boots = new ArrayList<>();
             //  boots.add(addBoot()); добавление в массив объекта из 
             //  private Boot addBoot(){... методом addBoot()
             
             return boot;
    }
             
     private Customer addCustomer(){
         Customer customer = new Customer();
         System.out.println("Введите имя покупателя: ");
         customer.setFirstName(scanner.nextLine());
         System.out.println("Введите фамилию покупателя: ");
         customer.setSecondName(scanner.nextLine());

         return customer;
     }        
     
     
         private Buy addBuy(){
         Buy buy = new Buy();
             System.out.println("Список моделей обуви");
               for (int i = 0; i < boots.size(); i++) {
                  if(boots.get(i)!= null){
                      System.out.printf("%d.%s%n",i+1, boots.get(i).getName());//d число double - s строка - n новоя строчка
                  }
                  
              }
            System.out.println("Выберите модель обуви из списка: ");
            int namebootChoose=scanner.nextInt(); //пользователь вводит номер модели
            scanner.nextLine();
            buy.setBoot(boots.get(namebootChoose-1));// записываем в обьект buy методом setBoot\
            buy.setMoney(boots.get(namebootChoose-1).getPrice()); //выбираем книгу и ее метод гетпрайс
            

            Calendar c = new GregorianCalendar();// метод-дата
            buy.setBuyDate(c.getTime());

            
            System.out.println("Список покупателей");
                for (int i = 0; i < customers.size(); i++) {
                  if(customers.get(i)!= null){
                      System.out.printf("%d.%s%n",i+1, customers.get(i).toString());//d число double - s строка - n новоя строчка
                  }
              }
         
             System.out.println("Выберете покупателя из списка");
             int customChoose =scanner.nextInt();
             scanner.nextLine();
             buy.setCustomer(customers.get(customChoose-1));
             return buy;
     
     }  
          private double moneySum(){
          double moneyCount=0;
                        for (int i = 0; i < buys.size(); i++) {
                  
                   if(buys.get(i)!= null){
                      moneyCount=moneyCount+buys.get(i).getMoney();
                  }
              }
              
              
          return moneyCount;
          }

}

