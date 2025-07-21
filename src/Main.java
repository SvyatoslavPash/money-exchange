import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();
    }

    static void start() {
        System.out.print("Введите вашу сумму: ");
        Scanner scanner = new Scanner(System.in);
        int valueSum = scanner.nextInt();

        System.out.println("Выберете нужную валюту: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();

        String result = convertCurrency(valueSum, choiceType);
        int dotIndex = result.indexOf(".");
        String finalyResult = result.substring(0, dotIndex + 3);
        System.out.println("По текущему курсу сумма составит: " + finalyResult);
        start();
    }

    static String convertCurrency(int valueSum, int choiceType) {
        double rubToUsd = 0.013;
        double rubToEur = 0.011;

        switch (choiceType){
            case 1:
                double usdResult = valueSum * rubToUsd;
                return String.valueOf(usdResult);

            case 2:
                double eurResult = valueSum * rubToEur;
                return String.valueOf(eurResult);

        }

        return "0";
    }
}
