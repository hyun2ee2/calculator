package com.study.calculator.step2;

public class Calculator {

    double result = 0;
    public double calculator(double numberOne, double numberTwo, String operator) {
        switch (operator) {

            // 만약에 operator가 "+"일 경우 result값에 numberOne + numberTwo를 진행 후 대입
            case "+":
                result = numberOne + numberTwo;
                break;

            // 만약에 operator가 "-"일 경우 result값에 numberOne - numberTwo를 진행 후 대입
            case "-":
                result = numberOne - numberTwo;
                break;

            // 만약에 operator가 "*"일 경우 result값에 numberOne * numberTwo를 진행 후 대입
            case "*":
                result = numberOne * numberTwo;
                break;

            // 만약에 operator가 "/"일 경우 result값에 numberOne / numberTwo를 진행 후 대입 (예외: 나누는 값이 0이될 경우 경고 메시지 출력)
            case "/":
                if(numberOne == 0) {
                    System.out.println("0으로 나눌 수 없습니다 다시 시도해주세요.");
                    return 0;
                }
                result = numberOne / numberTwo;
                break;
        }
        return result;
    }
}
