package com.study.calculator.step2;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // exit 여부 스캐너
        Scanner exitWhether = new Scanner(System.in);
        // 첫번째 값을 저장하는 스캐너
        Scanner numberOneScanner = new Scanner(System.in);
        // 연산자를 저장하는 스캐너
        Scanner operatorScanner = new Scanner(System.in);
        // 두번째 값을 저장하는 스캐너
        Scanner numberTwoScanner = new Scanner(System.in);

        boolean complete = false;

        while (true) {
            // 사용자로부터 첫번째 값을 입력 받기
            System.out.print("첫번째 값을 입력해주세요 : ");
            double numberOne = numberOneScanner.nextDouble();

            // 사용자로부터 연산자를 입력 받기
            System.out.print("연산자를 입력해주세요 : ");
            String operator = operatorScanner.nextLine();

            // 사용자로부터 두번째 값을 입력 받기
            System.out.print("두번째 값을 입력해주세요 : ");
            double numberTwo = numberTwoScanner.nextDouble();

            double result = calculator.calculator(numberOne, numberTwo, operator);

            // 만약에 calculator를 %로 계산 했을 때 나머지가 0일경우 calculator을 int형으로 변환해서 출력
            if (calculator.result % 1 == 0) {
                System.out.println("결과 값 : " + (int) calculator.result);
            } else {
                System.out.println("결과 값 : " + calculator.result);
            }
            while (true) {
                System.out.print("계속진행하시겠습니까? (계속하기: Yㅣ종료하기: EXIT) : ");
                String inputExitWhether = exitWhether.nextLine();
                if(inputExitWhether.equalsIgnoreCase("Y")) {
                    break;
                } else if (inputExitWhether.equalsIgnoreCase("EXIT")) {
                    complete = true;
                    break;
                } else {
                    System.out.println("Y또는 EXIT를 입력해주시기 바랍니다.");
                }
            }
            if (complete) {
                break;
            }

        }
    }
}
