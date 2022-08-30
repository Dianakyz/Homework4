public class Main {
    public static void main(String[] args) {

        // Задача 1.1

        System.out.println("Задача №1.1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        // Задача 1.2

        System.out.println("Задача №1.2");
        int age2 = 19;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {System.out.println("Человек закончил школу и может поступать в университет");
        }
        if (age2 >= 24) {System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 1.3
        System.out.println("Задача №1.3");
        int passangers = 80;
        if (passangers < 60) {System.out.println("Есть сидячие и стоячие места");}
        if (passangers >= 60) {System.out.println("Остались только стоячие места");}
        if (passangers > 102) {System.out.println("Вагон полностью забит");}

        // Задача 2.1
        System.out.println("Задача №2.1");
        int age3 = 11;
        if (age3 >= 18) { System.out.println("Поздравляем с совершеннолетием!"); }
        else { System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать."); }

        // Задача 2.2
        System.out.println("Задача №2.2");
        int age4 = 40;
        if (age4 >= 7 && age4 < 18) { System.out.println("Ребенок ходит в школу"); }
        if (age4 >= 18 && age4 < 24) { System.out.println("Человек закончил школу и может поступать в университет"); }
        else { System.out.println("Человек окончил университет и ему пора искать первую работу"); }

        // Задача 2.3
        System.out.println("Задача №2.3");
        int passangers1 = 120;
        if (passangers1 < 60) {System.out.println("Есть сидячие и стоячие места");}
        if (passangers1 >= 60 && passangers1 <= 120) {System.out.println("Остались только стоячие места");}
        else  {System.out.println("Вагон полностью забит");}


        // Задача 3.1
        System.out.println("Задача №3.1");
        int age5 = 3;
        if(age5 >=2 && age5 <=6 )  {System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");}
        else{if(age5 >= 7 && age5 < 18) System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");}
        if(age5 >= 18 && age5 < 24) {System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в университет");}
        else{if (age5 >= 24) System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");}

        // Задача 3.2
        System.out.println("Задача №3.2");
        int ageChild = 12;
        boolean childCanNotRide = ageChild < 5;
        boolean childCanWithParents = ageChild >= 5 && ageChild < 14;
        boolean childCanAlone = ageChild >= 14;

        if (childCanNotRide) {System.out.println("Ребенку нельзя кататься одному");}
        else {if (childCanWithParents) {System.out.println("Ребенку можно кататься в сопровождении взрослого");}}
        if (childCanAlone) {System.out.println("Ребенок может кататься один");}

        // Задача 3.3
        System.out.println("Задача №3.3");
        int one = 10000;
        int two = 10000000;
        int free = 1000;
        if (one > two && one > free) {System.out.println("Число one большее");}
        else {if (two > one && two > free) {System.out.println("Число two большее");}}
        if (free > one && free > two) {System.out.println("Число free большее");}

    }


}