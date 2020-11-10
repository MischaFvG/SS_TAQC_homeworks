package com.homework_1_SS.quadraticEquation;

import com.homework_1_SS.complexNumbers.ComplexNumber;


public class QuadraticEquation {
    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }

    public void printCoefficients() {
        System.out.println("Coefficient a " + coefficientA);
        System.out.println("Coefficient b " + coefficientB);
        System.out.println("Coefficient c " + coefficientC);
    }

    public double returnDiscriminant() {
        return Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
    }

    public double zeroDiscriminantResult() {
        return -coefficientB / (2 * coefficientA);
    }

    public double firstDiscriminantResult() {
        return (-coefficientB + Math.sqrt(returnDiscriminant())) / (2 * coefficientA);
    }

    public double secondDiscriminantResult() {
        return (-coefficientB - Math.sqrt(returnDiscriminant())) / (2 * coefficientA);
    }

    public ComplexNumber firstComplexDiscriminantResult() {
        double x1Re = -coefficientB / (2 * coefficientA);
        double x1Im = Math.sqrt(Math.abs(returnDiscriminant())) / (2 * coefficientA);
        return new ComplexNumber(x1Re, x1Im);
    }

    public ComplexNumber secondComplexDiscriminantResult() {
        double x2Re = -coefficientB / (2 * coefficientA);
        double x2Im = -Math.sqrt(Math.abs(returnDiscriminant())) / (2 * coefficientA);
        return new ComplexNumber(x2Re, x2Im);
    }
}
