public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        byte a = 5;
        short b = 317;
        int c = 1000123987;
        long d = 98765432155L;
        float i = 37.17f;
        double f = 96.00015486;
        System.out.println("Значение переменной 'a' с типом byte = " +a);
        System.out.println("Значение переменной 'b' с типом short = " +b);
        System.out.println("Значение переменной 'c' с типом int = " +c);
        System.out.println("Значение переменной 'd' с типом long = " +d);
        System.out.println("Значение переменной 'i' с типом float = " +i);
        System.out.println("Значение переменной 'f' с типом double = " +f);
        //Задача 2
        float apples = 27.12f;
        long peach = 987678965549L;
        float oranges = 2.786f;
        short grape = 569;
        short melon = -159;
        short strawberry = 27897;
        byte chery = 67;
        //Задача 3
        byte teacherLyudmilaPavlovna = 23;
        byte teacherAnnaSergeevna = 27;
        byte teacherEkaterinaAndreevna = 30;
        short allSheetsPaper = 480;
        System.out.println("На каждого ученика рассчитано " +allSheetsPaper/(teacherAnnaSergeevna+teacherEkaterinaAndreevna+teacherLyudmilaPavlovna) +" листов бумаги");
        //Задача 4 через вычисление производства бутылок в минуту, обозначение что такое час, день, месяц
        byte cycle = 2;
        byte bottlesPerCycle = 16;
        int perMinute = bottlesPerCycle/cycle;
        int in20Minutes = 20*perMinute;
        System.out.println("За 20 минут машина произвела " +in20Minutes + " штук бутылок");
        int hour = 60;
        int day = hour*24;
        int month = day*30;
        int perDay = perMinute*day;
        System.out.println("За сутки машина произвела " +perDay + " штук бутылок");
        int inThreeDays = perDay*3;
        System.out.println("За 3 дня машина произвела " +inThreeDays + " штук бутылок");
        int inMonth = month*perMinute;
        System.out.println("За 1 месяц машина произвела " +inMonth + " штук бутылок");
        //Задача 4 по-простому
        byte bottlesAtATime = 16;
        int bottlesIn20Minutes = 20*bottlesAtATime/2;
        System.out.println("За 20 минут машина произвела " +bottlesIn20Minutes + " штук бутылок");
        int bottlesPerDay = 60*24*bottlesAtATime/2;
        System.out.println("За сутки машина произвела " +bottlesPerDay + " штук бутылок");
        int bottlesInThreeDays = bottlesPerDay*3;
        System.out.println("За 3 дня машина произвела " +bottlesInThreeDays + " штук бутылок");
        int bottlesInMonth = bottlesPerDay*30;
        System.out.println("За 1 месяц машина произвела " +bottlesInMonth + " штук бутылок");
        //Задача 5
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int numberOfClasses = totalPaint/(whitePaintPerClass+brownPaintPerClass);
        int whitePaintOneClass = numberOfClasses*whitePaintPerClass;
        int brownPainOneClass = numberOfClasses*brownPaintPerClass;
        System.out.println("в школе, где " +numberOfClasses +" классов, нужно " +whitePaintOneClass +" банок белой краски и " +brownPainOneClass +" банок коричневой краски");
        //Задача 6
        byte oneBanana = 80;
        byte oneMilk = 105;
        byte oneIceCream = 100;
        byte oneEgg = 70;
        int onePortion = oneBanana*5+oneMilk*2+oneIceCream*2+oneEgg*4;
        System.out.println("Одна порция спортсмена составляет " +onePortion +" грамм");
        float onePortionInKg = onePortion/1000f;
        System.out.println("Одна порция спортсмена составляет " +onePortionInKg +" килограмм");
        //Задача 7
        byte needToReset = 7;
        int needToResetInGram = needToReset*1000;
        short firstDiet = 250;
        short secondDiet = 500;
        int dayFirstDiet = needToResetInGram/firstDiet;
        System.out.println("Если спортсмен будет терять каждый день по " +firstDiet +" грамм, то он похудеет на " +needToReset +" кг за " +dayFirstDiet +" дней");
        int daySecondDiet = needToResetInGram/secondDiet;
        System.out.println("Если спортсмен будет терять каждый день по " +secondDiet +" грамм, то он похудеет на " +needToReset +" кг за " +daySecondDiet +" дней");
        float dayTwoDiet  =   (float) needToResetInGram/(firstDiet+secondDiet);
        System.out.println("Если спортсмен будет комбинировать суточный рацион, то он похудеет на " +needToReset +" кг за " +dayTwoDiet +" дней");
        //Задача 8
        int mashaPerMonth = 67760;
        int denisPerMonth = 83690;
        int kristinaPerMonth = 76230;
        float mashaIncreasePerMonth = mashaPerMonth*1.1f;
        float denisIncreasePerMonth = denisPerMonth*1.1f;
        float kristinaIncreasePerMonth = kristinaPerMonth *1.1f;
        int mashaPerYear = mashaPerMonth*12;
        int denisPerYear = denisPerMonth*12;
        int kristinaPerYear = kristinaPerMonth*12;
        float mashaIncreasePerYear = mashaIncreasePerMonth*12;
        float denisIncreasePerYear = denisIncreasePerMonth*12;
        float kristinaIncreasePerYear = kristinaIncreasePerMonth*12;
        float mashaSalaryDifference = mashaIncreasePerYear-mashaPerYear;
        float denisSalaryDifference = denisIncreasePerYear-denisPerYear;
        float kristinaSalaryDifference = kristinaIncreasePerYear-kristinaPerYear;
        System.out.println("Маша теперь получает " +mashaIncreasePerMonth +" рублей. Годовой доход вырос на " +mashaSalaryDifference +" рублей");
        System.out.println("Денис теперь получает " +denisIncreasePerMonth +" рублей. Годовой доход вырос на " +denisSalaryDifference +" рублей");
        System.out.println("Кристина теперь получает " +kristinaIncreasePerMonth +" рублей. Годовой доход вырос на " +kristinaSalaryDifference +" рублей");


    }
}