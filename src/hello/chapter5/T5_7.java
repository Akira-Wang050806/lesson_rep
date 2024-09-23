package hello.chapter5;

public class T5_7 {
    public static void main(String[] args) {
        int tuition=10000;
        double rate = 0.05;
        for (int i = 0; i < 10; i++) {
            tuition*=1+rate;
        }
        System.out.println("十年后学费:" + tuition);

        int totalTuition=0;
        for (int j = 0; j < 4; j++) {
            tuition*=1+rate;
            totalTuition+=tuition;
        }
        System.out.println("四年总学费:"+totalTuition);
    }
}
