package com.study.calculator.step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private ArrayList<Double> calculationResult = new ArrayList<>();

    double result = 0;
    // 함수 생성
    public double result(Double numberOne, Double numberTwo, String operator) {

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*","x","X":
                result = numberOne * numberTwo;
                break;
            case "/":
                if(numberTwo == 0) {
                    System.out.println("0으로 나눌 수 없습니다 다시 시도해주세요.");
                    return 0;
                }
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("연산자가 잘못입력 되었습니다.");
                return 0;
        }
        // 계산 결과를 List에 저장
        calculationResult.add(result);
        return result;
    }
    // 결과 목록 Getter
    public List<Double> getCalculatorResult() {
        return calculationResult;
    }

    // 결과 목록 setter
    public void setCalculationResult(List<Double> calculationResult) {
        this.result = result;
    }

    // 가장 먼저 저장된 결과를 삭제하기
    public void removeCalculationResult() {
        if(!calculationResult.isEmpty()) {
            calculationResult.remove(0);
        }
    }
}
