package Task1;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Василий", "Епифанов", "Васильевич", 3, 50000);
        employees[1] = new Employee("Екатерина", "Васильева", "Евгеньевна", 4, 70000);
        employees[2] = new Employee("Дмитрий", "Гладков", "Евгеньевич", 1, 90000);
        employees[3] = new Employee("Александра", "Васильева", "Владимировна", 5, 54900);
        employees[4] = new Employee("Елена", "Литвина", "Леонидовна", 2, 87600);
        employees[5] = new Employee("Андрей", "Зимин", "Артемович", 3, 63912);
        employees[6] = new Employee("Оксана", "Зимина", "Александровна", 3, 90000);
        employees[7] = new Employee("Валерий", "Крылов", "Денисович", 1, 65000);
        employees[8] = new Employee("Валентина", "Денисова", "Павловна", 4, 34000);
        employees[9] = new Employee("Анастасия", "Стрельцова", "Максимовна", 5, 45000);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц равна " + getSumSalaryPerMonth());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + getMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой " + getMaxSalary());
        System.out.println();
        System.out.println("Среднее значение зарплат равно " + getMiddleSalaryPerMonth());
    }


    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }


    public static double getMiddleSalaryPerMonth() {
        double mid = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
            mid = sum / 10;
        }
        return mid;

    }

}

