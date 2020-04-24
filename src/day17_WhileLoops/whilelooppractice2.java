package day17_WhileLoops;

public class whilelooppractice2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i <= 10){
            if (i %2 ==0){
                //System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
