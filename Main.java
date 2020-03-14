package ru.gb.stream200302_lesson_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Worker work = new Worker("Petrov", 100000, 55, "Director");

        //work.surname = "Petrov";
        //work.pay = 100000;
        //work.age = 50;
        //work.position = "Director";

        System.out.println("Worker:\nSurname: "+work.getSurname ()+" Salary: " + work.getPay () + "$" + " Years old: " + work.getAge () + " Office position: " + work.getPosition () + "\n");

        work.twoValue();

      //Создать массив из 5 сотрудников.

        Worker[] workers = new Worker[5]; // Создаем масив типа worker с именем workers размером 5 элементов
        workers [0] = new Worker("Petrov", 100000, 55, "Director");
        workers [1] = new Worker("Sidorov", 90000, 50, "Deputy Director");
        workers [2] = new Worker("Oplov", 80000, 45, "Booker");
        workers [3] = new Worker("Sokolov", 70000, 40, "Leader");
        workers [4] = new Worker("Volkov", 60000, 35, "Manager");

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

         System.out.print ("(Study-5) Workers over 40 years:\n");

         for (int i=0; i<workers.length; i++)
             if (workers[i].getAge() > 40) {
                 System.out.print (workers[i].getSurname() + " - " + workers [i].getAge() + " years old");
             }
                System.out.println("\n");

        // Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

         System.out.print ("(Study-6) Index salary to all worker over 45 years of age at 5000 $:\n");

         for (int i=0; i<workers.length; i++)
            if (workers[i].getAge() > 45)
                profitSalary(workers[i]);
    }

    private static void profitSalary (Worker workers) {
            workers.setPay(workers.getPay() + 5000);
            System.out.println(workers.getPay() + 5000);
    }
}




