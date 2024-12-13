public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно подождать");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        int speed = 65;
        int speedLimit = 60;
        if (speed > speedLimit) {
            System.out.println("скорость превышена,придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        int years = 26;
        if (years >= 2 && years <= 6) {
            System.out.println("нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("его место в университете");
        }if (years > 24) {
            System.out.println("пора ходить на работу");
        }
        System.out.println(" ");
        System.out.println("Задача 5");
        int babyAge = 34;
        if (babyAge < 5) {
            System.out.println("он не может кататься на атракционе");
        }
        if (babyAge >= 5 && babyAge < 14) {
            System.out.println("он может кататься только в сопровождении взрослого");
        }
        if (babyAge >= 14) {
            System.out.println("он может кататься бнз сопровождения взрослого");
        }
        System.out.println(" ");
        System.out.println("Задача 6");
        int carCapacity = 102;
        int seatPlace = 60;
        int standPlace = carCapacity - seatPlace;
        int passenger = 105;
        if (passenger > 102) {
            System.out.println("Вагон уже полностью забит");
        } else if (passenger > seatPlace) {
            System.out.println("В вагоне есть стоячие места ");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        int one = 2;
        int two = 1;
        int three = 4;
        if (one > two && one > three) {
            System.out.println(one + " больше из трех чисел");
        } else if (two > one && two > three) {
            System.out.println(two + " больше из трех чисел");
        } else if (three > one && three > two) {
            System.out.println(three + " больше из трех чисел");
        }
// повышенная сложность
        System.out.println("повышенная сложность 1");
        int agePeople = 22;
        int salary = 60000;
        int maxLimit = salary;
        if (agePeople >= 23) {
            maxLimit *= 3;
        } else {
            maxLimit *= 2;
        }
        if (salary < 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + maxLimit + " рублей");
        }
        if (salary >= 50000 && salary < 80000) {
            maxLimit *= 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + maxLimit + " рублей");
        }
        if (salary >= 80000) {
            maxLimit *= 1.3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + maxLimit + " рублей");
        }

        System.out.println("\n");
        System.out.println("повышенная сложность 2");
        int ageClient = 22;
        int salaryClient = 60000;
        int wantedSum = 330000;
        double baseRate = 10;
        int loanTerm = 12;
        double creditPay = wantedSum * baseRate / 100 / loanTerm;
        int maxМounthPay = salaryClient / 100 * 50;
        if (ageClient < 23 && creditPay < maxМounthPay) {
            baseRate += 1;
            creditPay = wantedSum * baseRate / 100 / loanTerm;
            System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + maxМounthPay + " рублей. Платеж по кредиту " + creditPay + " рублей. Одобрено");
        }

        if (ageClient > 23 && ageClient < 30 && creditPay < maxМounthPay) {
            baseRate += 0.5;
            creditPay = wantedSum * baseRate / 100 / loanTerm;
            System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + maxМounthPay + " рублей. Платеж по кредиту " + creditPay + " рублей. Одобрено");
        }

        if (salary > 80000) {
            baseRate -= 0.7;
            creditPay = wantedSum * baseRate / 100 / loanTerm;
            System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + maxМounthPay + " рублей. Платеж по кредиту " + creditPay + " рублей. Одобрено");
        }
        boolean approvedCredit = creditPay < maxМounthPay;
        if (approvedCredit==false){
            System.out.println("отказ");}


    }
}
