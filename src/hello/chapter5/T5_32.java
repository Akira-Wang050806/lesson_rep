package hello.chapter5;

public class T5_32 {
    public static void main(String[] args) {
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        while(number1==number2) {
            number2=(int)(Math.random()*10);
        }
        System.out.print(number1);
        System.out.print(number2);
    }
}
