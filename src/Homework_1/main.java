package Homework_1;

public class main {
    public static void homework_1(String[] args) {
        //Задача 1
        byte a = 1;
        short b = 2;
        int c = 10;
        long d = 25L;

        float e = 3.25f;
        double j = 45.59;

        //Задача 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float overallWeight = boxerOne + boxerTwo;
        float weightDifference = boxerTwo - boxerOne;
        System.out.println(overallWeight + " кг");
        System.out.println(weightDifference + " кг");

        //Задача 3

        int oneBanana = 80;
        int overallBananas = 5;
        int milkVolume = 100;
        int milkVolumeWeight = 105;
        int milkPortion = 200;
        int oneIcecream = 100;
        int overallIcecreams = 2;
        int eggWeight = 70;
        int overallEggs = 4;
        int breakfastWeight = (oneBanana * overallBananas) + ((milkPortion / milkVolume) * milkVolumeWeight) + (oneIcecream * overallIcecreams) + (eggWeight * overallEggs);
        int breakfastWeightKilo = breakfastWeight / 1000; //пробовал float и double, но все равно результат получался 1.0 , хотя должен был быть 1.09
        System.out.println(breakfastWeightKilo + " кг");

        //Задача 4

        int weightAim = 7;
        int weightAimGrams = weightAim * 1000;
        int minDaily = 250;
        int maxDaily = 500;
        int slowWeightloss = weightAimGrams / minDaily;
        int fastWeightloss = weightAimGrams / maxDaily;
        int averageWeightloss = slowWeightloss + fastWeightloss / 2;
        System.out.println("Если будет худеть по 250 грамм в день, потребуется " + slowWeightloss + " дней");
        System.out.println("Если будет худеть по 500 грамм в день, потребуется " + fastWeightloss + " дней");
        System.out.println("Если будет худеть по 250 грамм в день, потребуется " + averageWeightloss + " дней");

        //Задача 5

        int salaryMashaOld = 67760;
        int salaryDenisOld = 83690;
        int salaryKristinaOld = 76230;
        int year = 12;
        int increase = 10;
        int salaryMashaYearOld = salaryMashaOld * year;
        int salaryMashaNew = salaryMashaOld + (salaryMashaOld / increase);
        int salaryMashaYearNew = salaryMashaNew * year;
        int salaryMashaDifference = salaryMashaYearNew - salaryMashaYearOld;

        int salaryDenisYearOld = salaryDenisOld * year;
        int salaryDenisNew = salaryDenisOld + (salaryDenisOld / increase);
        int salaryDenisYearNew = salaryDenisNew * year;
        int salaryDenisDifference = salaryDenisYearNew - salaryDenisYearOld;

        int salaryKristinaYearOld = salaryKristinaOld * year;
        int salaryKristinaNew = salaryKristinaOld + (salaryKristinaOld / increase);
        int salaryKristinaYearNew = salaryKristinaNew * year;
        int salaryKristinaDifference = salaryKristinaYearNew - salaryKristinaYearOld;

        System.out.println("Маша теперь получает " +  salaryMashaNew + " рублей. Годовой доход вырос на " + salaryMashaDifference + " рублей");
        System.out.println("Денис теперь получает " +  salaryDenisNew + " рублей. Годовой доход вырос на " + salaryDenisDifference + " рублей");
        System.out.println("Кристина теперь получает " +  salaryKristinaNew + " рублей. Годовой доход вырос на " + salaryKristinaDifference + " рублей");


    }
}
