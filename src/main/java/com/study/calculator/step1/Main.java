package com.study.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 첫번째 값 스캐너
        Scanner numberScannerOne = new Scanner(System.in);

        // 연산자 스캐너
        Scanner operator = new Scanner(System.in);

        // 두번째 값 스캐너
        Scanner numberScannerTwo = new Scanner(System.in);

        // exit 여부 스캐너
        Scanner exitWhether = new Scanner(System.in);

        boolean complete = false;

        while (true) {
            // 사용자로 부터 첫번째 값 입력 받기
            System.out.print("첫번째 값을 입력해주세요 : ");
            int numberOne = numberScannerOne.nextInt();

            // 사용자로 부터 연산자 입력 받기
            System.out.print("연산자를 입력해주세요 : ");
            String inputOperator = operator.nextLine();

            // 사용자로 부터 두번째 값 입력 받기
            System.out.print("두번째 값을 입력해주세요 : ");
            int numberTwo = numberScannerTwo.nextInt();

            // 조건문 (만약에 사용자로 부터 입력 받은 연산자가 "+" 이면 numberOne값과 numberTwo값을 더해서 출력)
            if (inputOperator.equals("+")) {
                int sum = numberOne + numberTwo;

                System.out.println("결과 값 : " + sum);
                // else-if (만약에 사용자로 부터 입력 받은 연산자가 "-" 이면 numberOne값과 numberTwo값을 빼서 출력)
            } else if (inputOperator.equals("-")) {
                int subtract = numberOne - numberTwo;

                System.out.println("결과 값 : " + subtract);
                // else-if (만약에 사용자로 부터 입력 받은 연산자가 "/" 이면 numberOne값과 numberTwo값을 나눈 값 출력)
            } else if (inputOperator.equals("/")) {
                // 몫과 나머지를 더해서 0.5를 뺀 값을 result에 저장
                int divide = numberOne / numberTwo;
                int remain = numberOne % numberTwo;
                int result = divide + remain;

                System.out.println("결과 값 : " + (result - 0.5));
                //// else-if (만약에 사용자로 부터 입력 받은 연산자가 "*" 또는 "x" 이면 numberOne값과 numberTwo값을 나눈 값 출력)
            } else if (inputOperator.equals("*") || inputOperator.equalsIgnoreCase("X")) {
                int multiplication = numberOne * numberTwo;
                System.out.println("결과 값 : " + multiplication);
            }

            // 반복문과 조건문을 사용하여 exit 여부가 Y/N일 때 계속 진행하거나 종료 (예외처리: 입력 값이 Y또는 N이 아닐 경우 계속 반복)
            while (true) {
                System.out.println("계산을 계속 진행하시겠습니까? Y/N");
                String inputExitWhether = exitWhether.nextLine();

                if (inputExitWhether.equalsIgnoreCase("Y")) {
                    break; // break를 함으로 써 안에 있는 반복문은 종료되고 바깥에 있는 반복문으로 넘어감
                } else if (inputExitWhether.equalsIgnoreCase("N")) {
                    complete = true; // 19번째 줄에  boolean complete = false; 라는 것을 만든 후 N을 입력 받았을 때 false를 true로 바꿔줌
                    break;
                } else {
                    System.out.println("Y 또는 N을 입력해주시기 바랍니다."); // 반복문이 종료되지 않고 해당 텍스트를 띄우면서 입력하라고 뜸
                }
            }

            if (complete) { // complete가 true일 경우 종료
                break;
            }
        }
    }
}