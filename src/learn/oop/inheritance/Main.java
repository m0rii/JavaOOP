package learn.oop.inheritance;

public class Main {
    public static void main(String[] args) {



        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(12);
        calculator.setSecondNumber(10);
        System.out.println(calculator.getAdditionalResult());
        System.out.println(calculator.getDivisionResult());


        BankAccount acc = new BankAccount("123","091231564",100,"mori","mori@mori.mori");
        System.out.println(acc.getBalance());

        acc.deposit(10);
        acc.withdraw(7);


        VipAccount vip1 = new VipAccount();
        System.out.println(vip1.getName());

        VipAccount vip2 = new VipAccount("bob",2500);
        System.out.println(vip2.getName());

        VipAccount vip3 = new VipAccount("tim",2500,"tim@email.com");
        System.out.println(vip3.getName());


        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);


    }
}
