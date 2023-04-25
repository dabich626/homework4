public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        boolean diffreneceOne = one < two && one < three;
        boolean diffTwo = two > one && two < three;
        boolean diffThree = three > two && three > one;
        boolean biggest = three > two;
      if (one < two) {
          System.out.println("1 меньше чем 2, но 2 больше одного");
      } else {
          System.out.println( "3 больше чем 2, 3 - наибольшее число");
        }

    }

    private static void task6() {
        int totalCapacity = 102;
        int sitPlaces = 60;
        int peoplesCoast = 73;
        boolean haveFreePlaces = peoplesCoast < 102 && peoplesCoast > 60;
        if (haveFreePlaces) {System.out.println("в вагоне остались стоячие места");}
        else {
            System.out.println("мест в вагоне не осталось");
        }
    }

    private static void task5() {
        int childAge = 10;
        boolean childCanNotGoOnAttraction = childAge < 5;
        if (childCanNotGoOnAttraction) {System.out.println("Если человеку" + childAge + "человек не может идти на аттракцион");}
        boolean childCanGoWithParents = childAge > 5 && childAge < 14;
        if (childCanGoWithParents) {System.out.println("Если человеку " + childAge + " то он может пойти на аттракцион в сопровождении взрослого");}
        boolean childCanVisitAttraction = childAge > 14;
        if (childCanVisitAttraction) {System.out.println("Если человеку " + childAge + " то он может пойти на аттракцион");}
    }

    private static void task4() {
        int age = 15;
        boolean childNeedToSleep = age < 2;
        if (childNeedToSleep) {System.out.println("если человеку " + age + "человеку пора спать");}
        boolean childNeedToGoOnKidsgarden = age >= 2 && age <=6;
        if (childNeedToGoOnKidsgarden) {System.out.println("если человеку " + age + " человеку нужно в детский сад");}
        boolean childeNeedGoToSkhool = age >= 7 && age <= 18;
        if (childeNeedGoToSkhool) {System.out.println("если человеку " + age + "человеку нужно идти в школу");}
        boolean manNeedToGoOnCollege = age >=18 && age <= 24;
        if (manNeedToGoOnCollege) {System.out.println("если человеку " + age + "человеку нужно идти в университет");}
        boolean manNeedToWork = age > 24;
        if (manNeedToWork) {System.out.println("если человеку " + age + "человеку нужно идти на работу");}
        boolean manCanRest = age > 60;
        if (manCanRest) {System.out.println("если человеку " + age + "человек может отдохнуть");}


    }

    private static void task3() {
        int speed = 65;
        if (speed > 60) {System.out.println("Если скорость больше 60 км,час, то придется заплатить штраф");}
        if (speed < 60) {System.out.println("если скорость ниже 60 км/час, то можно ехать спокойно");}
    }

    public static void task1 () {
     int age = 18;
     if (age >= 18) { System.out.println("человеку есть 18 и он совершеннолетний");}
     if (age < 18) { System.out.println("еще несовершеннолетний и нужно подождать");}

    }

    public static void task2 () {
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("если температура  меньше 5 градусов нужно надеть шапку");
        } else {
            System.out.println("если температура больше 5 можно идти без шапки");
        }
    }}

