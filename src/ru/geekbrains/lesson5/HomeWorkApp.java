package ru.geekbrains.lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("First One", "CEO", "first@mail.com", 111_11_11, 3000, 30);
        empArray[1] = new Employee("Second One", "CIO", "seccond@mail.com", 222_22_222, 2000, 43);
        empArray[2] = new Employee("Third One", "Engineer", "third@mail.com", 333_333_333, 2500, 28);
        empArray[3] = new Employee("Fourth One", "vendor", "fourth@mail.com", 444_44_444, 1500, 33);
        empArray[4] = new Employee("Fifth One", "BDM", "fifth@mail.com", 555_55_555, 2200, 31);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age > 40) {
                System.out.println(empArray[i]);
            }
        }


    }
}
