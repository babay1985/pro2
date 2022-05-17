package Exemple;

public class Main {

    public static void main(String[] args) {
        // Задание 1.
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        System.out.println(liftingCapacity);
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = peppersWeight + tomatoesWeight + cucumberWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Место осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на  " + overload + " кг!");
        ;
        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

        byte lesson = 8;
        short course = 9;
        int profession = 11;
        long year = 365L;

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");

        int gramsInKg = 1000;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaAmount = 5;
        int milkAmount = 2;
        int iceCreamAmount = 2;
        int eggAmount = 4;
        int result = (bananaWeight * bananaAmount) + (milkWeight * milkAmount) + (iceCreamWeight * iceCreamAmount) + (eggWeight * eggAmount);
        double resultInKg = (double) result / gramsInKg;
        System.out.println(resultInKg);

        int needToLoseKgs = 7;
        int gramsInKilogram = 1000;
        int needToLoseGs = needToLoseKgs * gramsInKilogram;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int minDays = needToLoseGs / maxGramsPerDay;
        int maxDays = needToLoseGs / minGramsPerDay;
        int avgDays = (minDays + maxDays) / 2;
        System.out.println("Min: " + minDays);
        System.out.println("Max: " + maxDays);
        System.out.println("Avg: " + avgDays);


    }
}
