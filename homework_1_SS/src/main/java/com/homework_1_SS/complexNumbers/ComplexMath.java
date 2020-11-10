package com.homework_1_SS.complexNumbers;

public class ComplexMath {

    private ComplexMath() {
    }

    public static ComplexNumber sum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return new ComplexNumber(complexNumber1.getRePart() + complexNumber2.getRePart(),
                complexNumber1.getImPart() + complexNumber2.getImPart());
    }

    public static ComplexNumber subtract(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return new ComplexNumber(complexNumber1.getRePart() - complexNumber2.getRePart(),
                complexNumber1.getImPart() - complexNumber2.getImPart());
    }

    public static ComplexNumber multiply(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return new ComplexNumber(complexNumber1.getRePart() * complexNumber2.getRePart() - complexNumber1.getImPart() * complexNumber2.getImPart(),
                complexNumber1.getRePart() * complexNumber2.getImPart() + complexNumber2.getRePart() * complexNumber1.getImPart());
    }

    public static ComplexNumber divide(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        double divideRePart = (complexNumber1.getRePart() * complexNumber2.getRePart() + complexNumber1.getImPart() * complexNumber2.getImPart()) /
                (Math.pow(complexNumber2.getRePart(), 2) + Math.pow(complexNumber2.getImPart(), 2));
        double divideImPart = (complexNumber1.getImPart() * complexNumber2.getRePart() - complexNumber1.getRePart() * complexNumber2.getImPart()) /
                (Math.pow(complexNumber2.getRePart(), 2) + Math.pow(complexNumber2.getImPart(), 2));
        return new ComplexNumber(divideRePart, divideImPart);
    }
}