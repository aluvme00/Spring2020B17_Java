package day36_StaticBlock;

public class StaticBlock2 {
    static int a;
    static int b;

    static {
        a = 100;
        b = 200;

        if (100 > 200){
            a =100;
        }else {
            b = 200;
        }
    }
}
