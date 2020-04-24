package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String ip = scan.nextLine();
        ip = ip.replaceAll("\\s+","");
        int arr[] = new int[26];
        for (int i=0;i<ip.length();i++){
            if (ip.charAt(i)!=32) {
                int series = ip.toLowerCase().charAt(i);
                arr[series - 97]++;
            }
        }
        for (int i=0;i<26;i++){
            if (arr[i]>0){
                System.out.printf("%c(%c) %d\n",i+65,i+97,arr[i]);
            }
        }
    }
}
