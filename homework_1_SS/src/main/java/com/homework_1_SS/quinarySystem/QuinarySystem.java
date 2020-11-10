package com.homework_1_SS.quinarySystem;

public class QuinarySystem {

    private int numberForQuinarySystem;

    public QuinarySystem() {
    }

    public QuinarySystem(int numberForQuinarySystem) {
        this.numberForQuinarySystem = numberForQuinarySystem;
    }

    public String reverseToQuinarySystem() {
        System.out.println("Your number " + numberForQuinarySystem);
        StringBuilder stringBuilder = new StringBuilder();
        while (numberForQuinarySystem != 0) {
            stringBuilder.append(numberForQuinarySystem % 5);
            numberForQuinarySystem = numberForQuinarySystem / 5;
        }
        return stringBuilder.reverse().toString();
    }

    public double reverseFromQuinarySystem() {
        System.out.println("Your number " + numberForQuinarySystem);
        String[] stringsArray = Integer.toString(numberForQuinarySystem).split("");
        double sum = 0;
        double powIndex = stringsArray.length - 1;
        for (int i = 0; i < stringsArray.length; i++) {
            int tempNumber = Integer.parseInt(stringsArray[i]);
            sum = sum + tempNumber * Math.pow(5, powIndex);
            powIndex--;
        }
        return sum;
    }
}
