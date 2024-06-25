import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car1= new Car("fiat", 2005);
        Car car2= new Car("bmw", 2018);
        Car car3= new Car("volvo", 2021);
        Car car4= new Car("peugot", 2003);
        Car car5= new Car("tesla", 2006);
        Car car6= new Car("kia", 2010);
        Car car7= new Car("honda", 2011);
        Car car8= new Car("citroen", 2012);
        Car car9= new Car("fiat500", 2023);
        Car car10= new Car("bmw2", 2015);

        List<Car> cars =new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        for(Car car:cars){
            System.out.println(car);
        }

    }
}