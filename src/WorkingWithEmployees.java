public class WorkingWithEmployees {
    public static void listOfEmployees(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void summationSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);
    }

    public static void minSalary(Employee[] employees) {
        int minSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSum||i==0) {
                minSum = employees[i].getSalary();
            }
        }

            System.out.println("Минимальная зарплата у сотрудника " +minSum);
        }

    public static void maxSalary (Employee[] employees) {
        int maxSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary()>maxSum) {
                maxSum = employees[i].getSalary();
            }

        }
        System.out.println("Максимальная зарплата у сотрудника " +maxSum);

    }
    public static double AverageSalary (Employee[]employees) {
        int averageSum;
        int count = 0;
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            count++;
            }
        averageSum = totalSalary/count;
        System.out.println("Cреднее значение зарплат " + averageSum);
return averageSum;
    }
    public static void FullName (Employee[]employees) {
        String fullName;
        for (Employee employee : employees) {
            fullName = employee.getSurname() + " " + employee.getSurname() + " " + employee.getPatronymic();
            System.out.println(fullName);
        }

    }


    }






