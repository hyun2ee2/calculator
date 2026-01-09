package com.study.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 첫번째 값 스캐너
        Scanner numberScannerOne = new Scanner(System.in);
        // 두번째 값 스캐너
        Scanner numberScannerTwo = new Scanner(System.in);
        // 연산자 스캐너
        Scanner operator = new Scanner(System.in);

        // 사용자로 부터 첫번째 값 입력 받기
        System.out.print("첫번째 값을 입력해주세요 : ");
        int numberOne = numberScannerOne.nextInt();

        // 사용자로 부터 두번째 값 입력 받기
        System.out.print("두번째 값을 입력해주세요 : ");
        int numberTwo = numberScannerTwo.nextInt();

        // 사용자로 부터 연산자 입력 받기
        System.out.print("연산자를 입력해주세요 : ");
        String inputOperator = operator.nextLine();
    }
}