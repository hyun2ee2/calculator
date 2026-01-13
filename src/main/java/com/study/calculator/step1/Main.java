package com.study.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 스캐너 생성
        Scanner numberScanner = new Scanner(System.in);
        Scanner operatorScanner = new Scanner(System.in);

        // 사용자로부터 값 입력 받기
        System.out.print("첫번째 값을 입력해주세요. : ");
        int numberOne = numberScanner.nextInt();

        System.out.print("연산자를 입력해주세요. : ");
        String operator = operatorScanner.nextLine();

        System.out.print("두번째 값을 입력해주세요. : ");
        int numberTwo = numberScanner.nextInt();
    }
}
