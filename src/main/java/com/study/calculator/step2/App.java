package com.study.calculator.step2;

import java.util.Scanner;

public class App {

    public static void app() {
        // 첫번째 값 스캐너
        Scanner valueOneScanner = new Scanner(System.in);

        // 연산자 스캐너
        Scanner operatorScanner = new Scanner(System.in);

        // 두번째 값 스캐너
        Scanner valueTwoScanner = new Scanner(System.in);

        // 사용자로 부터 첫번째 값 입력 받기
        System.out.print("첫번째 값을 입력해주세요 : ");
        int inputValueOne = valueOneScanner.nextInt();

        // 사용자로 부터 연산자 입력 받기
        System.out.print("연산자를 입력해주세요 : ");
        String inputOperator = operatorScanner.nextLine();

        // 사용자로 부터 두번째 값 입력 받기
        System.out.print("두번째 값을 입력해주세요 : ");
        int inputValueTwo = valueTwoScanner.nextInt();
    }
}
