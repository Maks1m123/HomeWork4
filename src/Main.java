//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Задание номер 1

        System.out.println("Hello SkyPro!");

        int age = 15;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " нужно немного подождать");
        }

        //Задание номер 2

        int airTemperature1 = 6;

        if (airTemperature1 <= 5) {

            System.out.println("На улице холодно шапку нужно одеть");

        } else if (airTemperature1 > 5) {
            System.out.println("На улице тепло шапку можно не одевать");
        }

        // Задание номер 3

        int speed = 120;

        if (speed > 60) {
            System.out.println("Нужно оплатить штраф, за превышение скорости!");
        } else {
            System.out.println("Превышения скорости нет, штраф платить не надо!");
        }
        // Задача номер 4
        int years = 19;

        if (years >= 2 && years <= 6) {
            System.out.println("Ему нужно ходить в Сад!");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Ему нужно ходить в Школу!");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Его место в Университете");
        } else if (years > 24) {
            System.out.println("Он уже ходить на работу .");
        }
        // Задание номер 5
        int kidYears = 13;

        if (kidYears <= 5) {
            System.out.println("Если возраст ребенка равен, то ему нельзя кататься на аттракционе");
        } else if (kidYears >= 5 && kidYears <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении зрослого ");
        } else if (kidYears >= 14) {
            System.out.println("Можно кататься на аттракционе без сопровождении зрослого ");
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
        } else if (capacityPassengers > 102) {
            System.out.println("Вагон полностью забит, мест нет.");
        } else {
            System.out.println("Свободных сидячих мест осталось " + (seats - passengersSeats) + " ! стоячих мест осталось "
                    + (standingCapacity - standingPassengers) + " !");
        }

        // Задание номер 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Первое число самое большое");
        } else if (two >= one && two >= three) {
            System.out.println("Второе число самое большое");
        } else if (three >= one && three >= two){
            System.out.println("Третье число самое большое");
        }


    }
}