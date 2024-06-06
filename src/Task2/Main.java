//package Task2;
//
//import java.util.Scanner;
//
//public class Main {
//    private static Employee[] employees = new Employee[10];
//
//    public static void main(String[] args) {
//        employees[0] = new Employee("Василий", "Епифанов", "Васильевич", 3, 50000);
//        employees[1] = new Employee("Екатерина", "Васильева", "Евгеньевна", 4, 70000);
//        employees[2] = new Employee("Дмитрий", "Гладков", "Евгеньевич", 1, 90000);
//        employees[3] = new Employee("Александра", "Васильева", "Владимировна", 5, 54900);
//        employees[4] = new Employee("Елена", "Литвина", "Леонидовна", 2, 87600);
//        employees[5] = new Employee("Андрей", "Зимин", "Артемович", 3, 63912);
//        employees[6] = new Employee("Оксана", "Зимина", "Александровна", 3, 90000);
//        employees[7] = new Employee("Валерий", "Крылов", "Денисович", 1, 65000);
//        employees[8] = new Employee("Валентина", "Денисова", "Павловна", 4, 34000);
//        employees[9] = new Employee("Анастасия", "Стрельцова", "Максимовна", 5, 45000);
//        System.out.println();
//
//    }
//
//
//    Scanner in = new Scanner(System.in);
//        System.out.println("Введите кол-во сотрудников: ");
//    int n = in.nextInt();
//        System.out.println("Введите фамилии сотрудников: ");
//    String[] people = new String[n + 1];
//        for (int i = 0; i < people.length; i++) {
//        people[i] = in.nextLine();
//    }
//    int[][] money = new int[n][5];
//        for (int i = 1; i < people.length; i++) {
//        System.out.println("Введите зарплату" + people[i]);
//        for (int j = 0; j < people.length; j++) {
//            for (int k = 0; k < 4; k++) {
//                money[j][k] = in.nextInt();
//                money[j][4] = money[j][4] + money[j][j];
//                money[j][k] = in.nextInt();
//    Scanner in = new Scanner(System.in);
//    System.out.println("Введите кол-во сотрудников: ");
//    int n = in.nextInt();
//    System.out.println("Введите фамилии сотрудников: ");
//    String[] people = new String[n + 1];
//    for (int i = 0; i < n; i++) {
//        people[i] = in.next();
//    }
//    people[n] = "Итого";
//    int[][] money = new int[n + 1][5];
//    int sum = 0;
//for (int i = 0; i < n; i++) {
//        System.out.println("Введите зарплату: " + people[i]);
//        for (int k = 0; k < 4; k++) {
//            money[i][k] = in.nextInt();
//            money[i][4] += money[i][k];
//            money[n][k] += money[i][k]; // поквартальная сумма
//            money[n][4] += money[i][k];
//            sum += money[i][k];
//        }
//    }
//for (int i = 0; i < people.length; i++) {
//        System.out.printf("%-14s: ", people[i]);
//        for (int j = 0; j < money[i].length; j++) {
//            System.out.printf("%4d  ", money[i][j]);
//
//        }
//        System.out.println();
//    }
//System.out.println("Всего: " + sum);
//
//
//
//}
