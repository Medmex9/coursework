public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int salary;
    private int departament;
    private static int counterId = 1;
    private int id;


    public Employee (String surname, String name, String patronymic, int salary, int departament) {
         this.surname = surname;
         this.name = name;
         this.patronymic = patronymic;
         this.salary = salary;
         this.departament = departament;
         this.id = counterId++;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public int getCounterId() {return counterId;}

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString ()  {
        return surname + ", " + name+ ", " + patronymic + ", " + salary + ", " + departament + ", " + id;
    }


}

