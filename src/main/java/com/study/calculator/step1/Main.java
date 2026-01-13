package com.study.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean complete = false;

        // 스캐너 생성
        Scanner numberScanner = new Scanner(System.in);
        Scanner operatorScanner = new Scanner(System.in);
        Scanner exitWheather = new Scanner(System.in);

        // 반복 출력
        while (true) {
            // 사용자로부터 값 입력 받기
            System.out.print("첫번째 값을 입력해주세요. : ");
            int numberOne = numberScanner.nextInt();

            System.out.print("연산자를 입력해주세요. : ");
            String operator = operatorScanner.nextLine();

            System.out.print("두번째 값을 입력해주세요. : ");
            int numberTwo = numberScanner.nextInt();

            // 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값 출력하기
            // operator가 "+"이면 numberOne + numberTwo
            if (operator.equals("+")) {
                System.out.println("결과 값 : " + (numberOne + numberTwo));

                // operator가 "-"이면 numberOne - numberTwo
            } else if (operator.equals("-")) {
                System.out.println("결과 값 : " + (numberOne - numberTwo));

                // operator가 "*"이거나 "X(대소문자 구분X)"이면 numberOne * numberTwo
            } else if (operator.equals("*") || operator.equalsIgnoreCase("X")) {
                System.out.println("결과 값 : " + (numberOne * numberTwo));

                // operator가 "/"이면 numberOne / numberTwo (예외처리: 0으로 나눌 수 없음.)
            } else if (operator.equals("/")) {
                if (numberTwo == 0) {
                    System.out.println("0으로 나눌 수 없습니다. 다시 시도해주세요.");
                } else {
                    System.out.println("결과 값 : " + (numberOne / numberTwo));
                }
            }
            while (true) {
                System.out.println("계산을 계속 진행하시겠습니까? (Y: 계속진행ㅣEXIT: 종료하기) : ");
                String inputExitWheather = exitWheather.nextLine();
                if (inputExitWheather.equalsIgnoreCase("Y")) {
                    break;
                } else if (inputExitWheather.equalsIgnoreCase("EXIT")) {
                    complete = true;
                    break;
                    // 예외처리: 입력 값이 Y도 아니고 EXIT도 아닐 때 출력
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
