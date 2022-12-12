public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Уткин", "Василий", "Петрович",
                75300, 1);
        employee[1] = new Employee("Прялкин", "Николай", "Александрович",
                77200, 1);
        employee[2] = new Employee("Жуков", "Дмитрий", "Никодимович",
                67000, 4);
        employee[3] = new Employee("Достоевский", "Николай", "Михайлович",
                89000, 3);
        employee[4] = new Employee("Петраков", "Роман", "Геннадиевич",
                67030, 4);
        employee[5] = new Employee("Аббакумов", "Леонид", "Тихонович",
                102000, 2);
        employee[6] = new Employee("Рэперов", "Тупак ", "Шокурович",
                50000, 5);
        employee[7] = new Employee("Меньшиков", "Петр", "Петрович",
                21500, 6);
        employee[8] = new Employee("Найдёнов", "Андрей", "Андреевич",
                22200, 6);
        employee[9] = new Employee("Попов", "Артём", "Сергеевич",
                63000, 4);

        WorkingWithEmployees.listOfEmployees(employee);
        WorkingWithEmployees.summationSalary(employee);
        WorkingWithEmployees.minSalary(employee);
        WorkingWithEmployees.maxSalary(employee);
        WorkingWithEmployees.AverageSalary(employee);
        WorkingWithEmployees.FullName(employee);





    }
}