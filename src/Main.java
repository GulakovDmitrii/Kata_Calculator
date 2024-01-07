import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ввод: ");
        Scanner zeroScan =new Scanner(System.in);
        System.out.println(calc(zeroScan.nextLine()));
    }
    public static String calc(String input){
        String[] rom10 = {"P","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String[] rom = {null,"I","II","III","IV","V","VI","VII","VIII","IX","X"};
            String p = " ";
            String[] d =(input.split(p,3));

        String num = d[0];
        String sign = d[1];
        String num2 = d[2];
        if (List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X").contains(num) & List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X").contains(num2)) {
           int answerInAr;
           String rToA;
           String signR;
           String rToA2;
           rToA = num;
           rToA2 = num2;
           signR = sign;
           Rome rNums = Rome.valueOf(String.valueOf(rToA));
           int a1 = rNums.getRNumsToArabicAlt();
           Rome rNums2 = Rome.valueOf(String.valueOf(rToA2));
           int a2 = rNums2.getRNumsToArabicAlt();

           answerInAr = switch (signR) {
               case "+" ->
                   //System.out.println(a1 + a2 );
                       a1 + a2;
               case "-" ->
                   //System.out.println(a1 - a2 );
                       a1 - a2;
               case "/" ->
                   //System.out.println(a1 / a2 );
                       a1 / a2;
               case "*" ->
                   //System.out.println(a1 * a2 );
                       a1 * a2;
               default -> throw new IllegalStateException("Unexpected value: " + signR);
           };
                        if (answerInAr==0){
                            throw new IllegalStateException("Out of range: " + answerInAr);
                        }
                        int brbr = (answerInAr -(answerInAr%10))/10;
                        int br = answerInAr%10;
                        if (answerInAr <=10) {
                            return (rom[answerInAr]);}
                        else if (br == 0) {
                            return (rom10[brbr]);
                        }
                        else {
                            return(rom10[brbr] + rom[br]);
                        }

                    } else {
                        int ar;
                        String signForAr;
                        int ar2;
                        ar = Integer.parseInt(num);
                        ar2 = Integer.parseInt(num2);
                        signForAr = sign;

                        if (ar < 0 || ar > 10 || ar2 < 0 || ar2 > 10) {
                            throw new IllegalStateException("Unexpected value");
                        }


            return switch (signForAr) {
                case "+" -> String.valueOf((ar + ar2));
                case "-" -> String.valueOf((ar - ar2));
                case "/" -> String.valueOf((ar / ar2));
                case "*" -> String.valueOf((ar * ar2));
                default -> throw new IllegalStateException("Unexpected value: " + sign);
            };

                    }
    }





    }

