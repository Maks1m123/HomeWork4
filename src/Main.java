public class Main {
    public static void main(String[] args) {

        // Задание номер 1

        System.out.println("Hello SkyPro!");

        int age = 21;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " нужно немного подождать");
        }

        //Задание номер 2

        int airTemperature1 = 4;

        if (airTemperature1 <= 5) {

            System.out.println("На улице " + airTemperature1 + " шапку нужно одеть");

        } else if (airTemperature1 >= 5) {

            System.out.println("На улице " + airTemperature1 + " градусов шапку можно не одевать");
        }

        // Задание номер 3

        int speed = 75;

        if (speed <= 60) {
            System.out.println("Привышения скороски нету " + speed + " штраф платить не надо!");
        } else if (speed > 60) {
            System.out.println("Нужно оплатить штраф , за превышение скорости " + speed + " !");
        }
        // Задача номер 4
        int years = 3;

        if (years >= 2 && years <= 6) {

            System.out.println("Если возраст человека равен " + years + " , то ему нужно ходить в Сад!");
        }
        int years1 = 12;

        if (years1 >= 7 && years1 <= 17) {
            System.out.println("Если возраст человека равен " + years1 + " , то ему нужно ходить в Школу");
        }
        int years3 = 22;

        if (years3 >= 18 && years3 <= 24) {
            System.out.println("Если возраст человека равен " + years3 + " , то его место в Университете");
        }
        int years4 = 33;

        if (years4 > 24) {
            System.out.println("Если возраст человека равен " + years4 + ", то ему нужно ходить на работу!");
        }
        // Задание номер 5
        int kidYears = 4;

        if (kidYears < 5) {
            System.out.println("Если возраст ребенка равен " + kidYears + " , то ему нельзя кататься на аттракционе");
        }
        int kidYears1 = 12;

        if (kidYears1 > 5 && kidYears1 <= 14) {
            System.out.println("Если возраст ребенка равен " + kidYears1 + " то можно кататься на аттракционе в сопровождении зрослого ");
        }
        int kidYears2 = 19;

        if (kidYears2 >= 14) {
            System.out.println("Если возраст ребенка равен " + kidYears2 + " , то ему, можно кататься на аттракционе без сопровождения взрослого");
        }
        // Задача номер 6
        int capacityPassengers = 102;
        int seats = 60;
        int standingCapacity = capacityPassengers - seats;
        int passengersSeats = 45;
        int standingPassengers = 32;
        int totalPassengers = passengersSeats + standingPassengers;
        if (totalPassengers < capacityPassengers) {
            System.out.println("В вагоне есть еще " + (capacityPassengers - totalPassengers) + " свободных мест");
        } else {
            System.out.println("Вагон полностью забит, мест нет.");
        }
        System.out.println("Свободных сидячих мест осталось " + (seats - passengersSeats) + " ! стоячих мест осталось "
                + (standingCapacity - standingPassengers) + " !");
        // Задание номер 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Первое число самое большое");
        } else if (two >= one && two >= three ){
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }

        }

    }



















