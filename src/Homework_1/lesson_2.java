package Homework_1;

public class lesson_2 {
    public static void main(String[] args) {
        //Задача 1
        byte a = 1;
        short b = 2;
        int c = 10;
        long d = 25L;

        float e = 3.25f;
        double j = 45.59;

        char dollarSymbol = 36;

        boolean y = b > a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(j);
        System.out.println(dollarSymbol);
        System.out.println(y);

        //Задача 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float overallWeight = boxerOne + boxerTwo;
        float weightDifference = boxerTwo - boxerOne;
        System.out.println(overallWeight + " кг");
        System.out.println(weightDifference + " кг");

        //Задача 3

        int bananaWeight = 80;
        int overallBananas = 5;
        int milkVolume = 100;
        int milk100mlWeight = 105;
        int milkPortionMl = 200;
        int icecreamWeight = 100;
        int overallIcecreams = 2;
        int eggWeight = 70;
        int overallEggs = 4;
        int breakfastWeight = (bananaWeight * overallBananas) + ((milkPortionMl / milkVolume) * milk100mlWeight) + (icecreamWeight * overallIcecreams) + (eggWeight * overallEggs);
        float breakfastWeightKilo = breakfastWeight / 1000f;
        System.out.println(breakfastWeightKilo + " кг");

        //Задача 4

        int weightAimKg = 7;
        int weightAimGrams = weightAimKg * 1000;
        int minDailyLoss = 250;
        int maxDailyLoss = 500;
        int slowWeightloss = weightAimGrams / minDailyLoss;
        int fastWeightloss = weightAimGrams / maxDailyLoss;
        int averageWeightloss = slowWeightloss + fastWeightloss / 2;
        System.out.println("Если будет худеть по 250 грамм в день, потребуется " + slowWeightloss + " дней");
        System.out.println("Если будет худеть по 500 грамм в день, потребуется " + fastWeightloss + " дней");
        System.out.println("Если будет худеть по 250 грамм в день, потребуется " + averageWeightloss + " дней");

        //Задача 5

        int basicSalaryMasha = 67760;
        int basicSalaryDenis = 83690;
        int basicSalaryKristina = 76230;
        int monthsInYear = 12;
        int increasePercent = 10;
        int annualIncomeMasha = basicSalaryMasha * monthsInYear;
        float increasedSalaryMasha = basicSalaryMasha * (1 + increasePercent/100f);
        float increasedAnnualIncomeMasha = increasedSalaryMasha * monthsInYear;
        float incomeDifferenceMasha = increasedAnnualIncomeMasha - annualIncomeMasha;

        int annualincomeDenis = basicSalaryDenis * monthsInYear;
        float increasedSalaryDenis = basicSalaryDenis * (1 + increasePercent/100f);
        float increasedAnnualIncomeDenis = increasedSalaryDenis * monthsInYear;
        float incomeDifferenceDenis = increasedAnnualIncomeDenis - annualincomeDenis;

        int annualIncomeKristina = basicSalaryKristina * monthsInYear;
        float increasedSalaryKristina = basicSalaryKristina * (1 + increasePercent/100f);
        float increasedAnnualIncomeKristina = increasedSalaryKristina * monthsInYear;
        float incomeDifferenceKristina = increasedAnnualIncomeKristina - annualIncomeKristina;

        System.out.println("Маша теперь получает " +  increasedSalaryMasha + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " +  increasedSalaryDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " +  increasedSalaryKristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей");

        //Задача 6
        //переменные a,b,c,d,e уже использованы в коде, поэтому в качестве переменных использовал другие символы.
        int k = 12;
        int l = 27;
        int m = 44;
        int n = 15;
        int o = 9;
        int result = k * (l + (m - n * o));
        System.out.println(result);
        result = result * (-1);
        System.out.println(result);

        //Задача 7

        int p = 5;
        int r = 7;
        p = p ^ r ^ (r = p);
        System.out.println(p);
        System.out.println(r);

        //Задача 8

        int s = 265;
        s = s % 100;
        int t = s / 10;
        System.out.println("b = " + t);




    }
}
