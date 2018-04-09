
package min.max.prumer;
import java.util.Scanner;

public class MinMaxPrumer {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0, pocet = 1;
        // nekonečná smyčka
    while (true){
        //zvětším počítadlo vložených čísel
        pocet++;
        System.out.print("vlož"+pocet+ ".číslo: ");
        int vstup = sc.nextInt();
        //pokud vložil menší nebo větší číslo, zapamatujeme si je
        // pokud uživatel vloží nulu program skončí
        if (vstup == 0) break;
        soucet = soucet + vstup;
        if (vstup < min) min = vstup;
        if(vstup > max) max = vstup;
        System.out.println("minimum: "+min);
        System.out.println("maximum: "+max);
        System.out.println("průměr: "+((float) soucet/pocet));
        }
    }
}

