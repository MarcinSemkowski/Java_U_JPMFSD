package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_6;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRW 4DW");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());


        Ford Ford = new Ford(6,"Ford Falcon ");

        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());



        Holden holden = new Holden(6,"Holden Commodore ");

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }

}