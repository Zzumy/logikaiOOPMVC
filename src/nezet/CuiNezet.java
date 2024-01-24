package nezet;

import java.util.Scanner;

public class CuiNezet {

    private static final Scanner sc = new Scanner(System.in);
    private static final String sep = System.lineSeparator();

    private void konzolraIr(String msg) {
        System.out.println(msg);
    }

    private void leirasMegjelenito(String msg) {
        konzolraIr(msg + sep);
    }

    private void feladatMegjelenito(String msg) {
        konzolraIr(msg + sep);
    }
    
    private int valasztas(String msg){
        konzolraIr(msg);
        return sc.nextInt();
    }
    
    private void feredmenyMegjelenito(String msg) {
        konzolraIr(msg + sep);
    }
}
