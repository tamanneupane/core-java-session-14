package day2;

public class FunctionPractice {

    public static void main(String[] args) {

        FunctionPractice func = new FunctionPractice();

        int a = 2;
        int b = 3;

//        int sum1 = a + b;
//        System.out.println(sum1);
        int sum1 = func.addAndReturn(a, b);
        System.out.println(sum1);

        int c = 8;
        int d = 2;

//        int sum2 = c + d;
//        System.out.println(sum2);
        int sum2 =  func.addAndReturn(c, d);
        System.out.println(sum2);

        int e = 12;
        int f = 3;

//        int sum3 = e + f;
//        System.out.println(sum3);
        int sum3 = func.addAndReturn(e,f);
        System.out.println(sum3);
    }

    /*
    <Access_Modifier> <Return_Type> <Function_Name>(Parameters){
        <Code>
    }
    */

    public void add(int a , int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public int addAndReturn(int a , int b){
        int sum = a + b;
        return sum;
    }

}
