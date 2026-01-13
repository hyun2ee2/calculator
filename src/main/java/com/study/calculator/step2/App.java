package com.study.calculator.step2;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calculator = new Calculator();

        boolean complete = false;

        while (true) {
            // 숫자값 스캐너
            Scanner numberScanner = new Scanner(System.in);
            // 연산자 스캐너
            Scanner operator = new Scanner(System.in);
            // 종료여부 스캐너
            Scanner exitWheather = new Scanner(System.in);

            // 사용자로 부터 값 입력 받기
            System.out.print("첫번째 값을 입력해주세요. : ");
            double inputNumberOne = numberScanner.nextDouble();

            System.out.print("연산자를 입력해주세요. : ");
            String inputOperator = operator.nextLine();

            System.out.print("두번째 값을 입력해주세요. : ");
            double inputNumberTwo = numberScanner.nextDouble();

            // 계산은 Calculator에서 받아옴
            double result = calculator.result(inputNumberOne, inputNumberTwo, inputOperator);

            if(calculator.result % 1 == 0) {
                System.out.println("결과 값 : " + (int)result);
            } else {
                System.out.println("결과 값 : " + result);
            }
            // calcurationResult에 저장되어있는 이전 결과 값 출력 (소수는 그대로 출력하되 8.0과 같이 딱 맞아 떨어지면 .0을 제거하고 출력)
            System.out.print("이전 계산 결과 : ");

            for (double value : calculator.getCalculatorResult()) {
                if (value % 1 == 0) {
                    System.out.print((int) value + "ㅣ");
                } else {
                    System.out.print(value + "ㅣ");
                }
            }

            System.out.println();
            while (true) {
                System.out.print("계산을 계속 진행하시겠습니까?(Y: 계속ㅣEXIT: 종료하기) : ");
                String inputExitWheather = exitWheather.nextLine();
                if (inputExitWheather.equalsIgnoreCase("Y")) {
                    break;
                } else if (inputExitWheather.equalsIgnoreCase("EXIT")) {
                    complete = true;
                    break;
                } else {
                    System.out.println("Y또는 EXIT를 입력해주시기 바랍니다.");
                }
            }
            if(complete) {
                break;
            }
        }
    }
}
