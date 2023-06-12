package day5;

public class Calculator {

    // compile time polymorphism

    public static void main(String[] args) {
        Calculator cal = new Calculator();
//        cal.add(2147483468,2147483468);
        int sum = cal.add(2,3);
        cal.add(2,3, 5);

//        Math.addExact(2147483468,2147483468);
    }

    // function overloading
    public int add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
        return temp;
    }

    public void add(int a , int b, int c){
        int temp = a + b + c;
        System.out.println(temp);
    }
}
