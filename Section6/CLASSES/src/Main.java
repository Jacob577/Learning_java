public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("911");
//        System.out.println("Model is "+ porsche.getModel());
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        Person person = new Person();
//        person.setFirstName("John");
//        System.out.println(person.getFullName());
       int a0 = 42;
        System.out.println("f2 = " + f2(a0) + " f4 = " + f4(a0) + " f8 = "
                + f8(a0) + " f16 = " + f16(a0) + " f32 = "+f32(a0));
    }
    public static int generator(int a0){
        if (a0 == 1){
            return 1;
        } else if (a0 % 2 == 0){
            return a0/2;
        } else {
            return 3*a0 + 1;
        }
    }
    public static int f2(int a0){
    return generator(generator(a0));
    }
    public static int f4(int a0){
       return f2(f2(a0));
    }
    public static int f8(int a0){
        return f4(f4(a0));
    }
    public static int f16(int a0){
        return f8(f8(a0));
    }
    public static int f32(int a0){
        return f16(f16(a0));
    }
}
