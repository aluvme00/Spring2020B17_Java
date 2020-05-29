package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CarObjects2 {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW","x6","Black", 2020);
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Toyota","Corolla","Red", 2020);
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi","Q7","Gray", 2019);
        car3.getCarInfo();

        System.out.println("==========================================");

        Car[] cars ={car1,car2,car3};

        for (Car eachCar: cars){
            eachCar.getCarInfo();
        }

         System.out.println(car1);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);






    }
}
