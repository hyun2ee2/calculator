package com.study.calculator.step2;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 첫번째 값을 저장하는 스캐너
        Scanner numberOneScanner = new Scanner(System.in);
        // 연산자를 저장하는 스캐너
        Scanner operatorScanner = new Scanner(System.in);
        // 두번째 값을 저장하는 스캐너
        Scanner numberTwoScanner = new Scanner(System.in);


            System.out.print("첫번째 값을 입력해주세요 : ");
            double numberOne = numberOneScanner.nextDouble();

            System.out.print("연산자를 입력해주세요 : ");
            String operator = operatorScanner.nextLine();

            System.out.print("두번째 값을 입력해주세요 : ");
            double numberTwo = numberTwoScanner.nextDouble();

            double result = calculator.calculator(numberOne, numberTwo, operator);

            // 만약에 calculator를 %로 계산 했을 때 나머지가 0일경우 calculator을 int형으로 변환해서 출력
            if(calculator.result % 1 == 0) {
                System.out.println("결과 값 : " + (int)calculator.result);
            } else {
                System.out.println("결과 값 : " + calculator.result);
            }
    }
}
