package baitapthem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dienTich, chuVi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a = scanner.nextInt();
        System.out.println("input b");
        int b = scanner.nextInt();
        dienTich = a*b;
        chuVi = (a+b)*2;
        System.out.println("dien tich cua hinh cn la: "+ dienTich);
        System.out.println("Chu vi cua hinh chu nhat là: "+ chuVi);
    }
}
