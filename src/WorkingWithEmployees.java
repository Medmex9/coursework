public class WorkingWithEmployees {
    public static void listOfEmployees(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int summationSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);
        return totalSalary;
    }

    public static int minSalary(Employee[] employees) {
        int minSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSum || i == 0) {
                    minSum = employees[i].getSalary();
                }
            }
        }

            System.out.println("Минимальная зарплата у сотрудника " +minSum);
        return minSum;
        }

    public static int maxSalary (Employee[] employees) {
        int maxSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSum) {
                    maxSum = employees[i].getSalary();
                }

            }
        }
        System.out.println("Максимальная зарплата у сотрудника " +maxSum);
        return maxSum;

    }
    public static double AverageSalary (Employee[]employees) {
        int averageSum;
        int count = 0;
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        averageSum = totalSalary/count;
        System.out.println("Cреднее значение зарплат " + averageSum);
return averageSum;
    }
    public static void FullName (Employee[]employees) {
        String fullName;
        for (Employee employee : employees) {
            if (employee != null) {
                fullName = employee.getSurname() + " " + employee.getSurname() + " " + employee.getPatronymic();
                System.out.println(fullName);
            }
        }

    }


    }






