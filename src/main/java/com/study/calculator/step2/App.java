package com.study.calculator.step2;

import java.util.Scanner;

public class App {
    public static void main() {
        // 첫번째 값을 저장하는 스캐너
        Scanner numberOneScanner = new Scanner(System.in);
        // 연산자를 저장하는 스캐너
        Scanner operatorScanner = new Scanner(System.in);
        // 두번째 값을 저장하는 스캐너
        Scanner numberTwoScanner = new Scanner(System.in);

        System.out.println("첫번째 값을 입력해주세요 : ");
        int numberOne = numberOneScanner.nextInt();

        System.out.println("연산자를 입력해주세요 : ");
        String operator = operatorScanner.nextLine();

        System.out.println("두번째 값을 입력해주세요 : ");
        int numberTwo = numberTwoScanner.nextInt();

    }
}
