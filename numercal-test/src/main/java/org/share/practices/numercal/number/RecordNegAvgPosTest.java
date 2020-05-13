package main.java.org.share.practices.numercal.number;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ** created by DawnSailing at 2020/3/15
 *
 * @author DawnSailing
 */
public class RecordNegAvgPosTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.nextLine();
            String inputString[] = input.split(" ");
            int numP = 0;
            int numN = 0;
            double sum = 0;
            double avg = 0;
            int temp = 0;
            for (int i = 0; i < inputString.length; i++) {
                temp = Integer.parseInt(inputString[i]);
                if (temp >= 0) {
                    sum += temp;
                    numP++;
                } else {
                    numN++;
                }
            }
            DecimalFormat df = new DecimalFormat("#.0");
            if (numP == 0) {
                avg = 0.0;
            } else {
                avg = sum / (double) numP;
            }
            System.out.println(numN);
            System.out.println(df.format(avg));
        }
    }

}
