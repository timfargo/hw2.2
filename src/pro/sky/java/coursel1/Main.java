package pro.sky.java.coursel1;

public class Main {

    public static void main(String[] args) {
        // Задача 1
            byte coat = 5;
            short dress =10;
            int jacket = 13;
            long shoes = 15;
            float bootsWeight = 5.5f;
            double sweaterWeight = 1.5;
            char a = 43;
            boolean coatIsAdult = coat < 3;

            // Задача 2
               double boxer1 = 78.2;
               double boxer2 = 82.7;
               double totalWeight = boxer1 + boxer2;
               double weightDifference = boxer2 - boxer1;
               System.out.println("Общий вес двух босеров" + totalWeight);
               System.out.println("Разница между весом боксеров" + weightDifference);

               // Задача 3
                  short bananas = 5 * 80;
                  short milk = 2 * 105;
                  short iceCream = 2 * 100;
                  short eggs = 4 * 70;
                  int totalWeightInGram = bananas + milk + iceCream + eggs;
                  System.out.println("Общий вес в граммах " + totalWeightInGram + "гр");
                  int grToKilo = 1000;
                  float totalWeightInKilo = totalWeightInGram /(float) grToKilo;
                  System.out.println("Общий вес завтрака в килограммах" + totalWeightInKilo + "кг");

                  // Задача 4
                     byte totalLoseWeight = 7;
                     int gramToKilo = 1000;
                     int totalLoseWeightInGram = totalLoseWeight * gramToKilo;
                     short loseWeight1 = 250;
                     short loseWeight2 = 500;
                     int daysToLoseWeight1 = totalLoseWeightInGram / loseWeight1;
                     System.out.println(daysToLoseWeight1 + "дней нужно для похудения в первом варианте");
                     int daysToLoseWeight2 = totalLoseWeightInGram / loseWeight2;
                     System.out.println(daysToLoseWeight2 + "дней нужно для похудения во втором варианте");
                     int mean = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
                     System.out.println(mean + "дней в среднем нужно для похудения");

                     // Задача 5
                        int salaryM = 67760;
                        int salaryD = 83690;
                        int salaryK = 76230;
                        byte monthsAYer = 12;
                        int annualIncomeM = salaryM * monthsAYer;
                        int annualIncomeD = salaryD * monthsAYer;
                        int annualIncomeK = salaryK * monthsAYer;
                        double salaryIncrease = 0.1;
                        double salaryMNow = salaryM + (salaryM * salaryIncrease);
                        double salaryDNow = salaryD + (salaryD * salaryIncrease);
                        double salaryKNow = salaryK + (salaryK * salaryIncrease);
                        double annualIncomeMNow = salaryMNow * salaryIncrease;
                        double annualIncomeDNow = salaryDNow * salaryIncrease;
                        double annualIncomeKNow = salaryKNow * salaryIncrease;
                        double differenceM = annualIncomeMNow - annualIncomeM;
                        double differenceD = annualIncomeDNow - annualIncomeD;
                        double differenceK = annualIncomeKNow - annualIncomeK;
                        System.out.println(salaryMNow + "зарплата Мвши после повышения" + "годовой доход вырос на " + differenceM);
                        System.out.println(salaryDNow + "зарплата Дениса после повышения" + "годовой доход вырос на " + differenceD);
                        System.out.println(salaryKNow + "зарплата Кристины после повышения" + "годовой доход вырос на" + differenceK);














    }
}