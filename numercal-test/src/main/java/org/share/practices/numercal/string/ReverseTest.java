package main.java.org.share.practices.numercal.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ** created by DawnSailing at 2020/3/15
 *
 * @author DawnSailing
 */
public class ReverseTest {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input something:");
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
        }
        System.out.println(stringReverse(str));
    }

    public static String stringReverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        if(inputString == null || "".equals(inputString) || inputString.length() > 100){
            return null;
        }
        for(int i = inputString.length()-1 ; i>=0 ; i--){
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }

}
