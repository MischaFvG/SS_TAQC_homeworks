package com.homework_1_SS.complexNumbers;

public class ComplexNumber {

    private double rePart;
    private double imPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double rePart, double imPart) {
        this.rePart = rePart;
        this.imPart = imPart;
    }

    public double getRePart() {
        return rePart;
    }

    public void setRePart(double rePart) {
        this.rePart = rePart;
    }

    public double getImPart() {
        return imPart;
    }

    public void setImPart(double imPart) {
        this.imPart = imPart;
    }

    private String checkSign() {
        if (imPart > 0) {
            return "+";
        } else return "-";
    }

    @Override
    public String toString() {
        String complexNumber;
        if (imPart == 1 || imPart == -1) {
            if (rePart == 0) {
                complexNumber = checkSign() + "i";
            } else {
                complexNumber = Double.toString(rePart) + checkSign() + "i";
            }
        } else {
            complexNumber = Double.toString(rePart) + checkSign() + Double.toString(Math.abs(imPart)) + "i";
        }
        return complexNumber;
    }
}
