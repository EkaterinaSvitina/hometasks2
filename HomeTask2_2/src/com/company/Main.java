package com.company;
import com.company.People;
import com.company.Functions;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList();

        People people1 = new People(15, "Катя", "Скибенко", 25);
        People people2 = new People(20, "Петр", "Иванов", 31);
        People people3 = new People(3, "Ольга", "Марсалова", 45);
        People people4 = new People(31, "Ольга", "Мирная", 18);
        People people5 = new People(47, "Иван", "Иванов", 27);
        People people6 = new People(5, "Евгений", "Денисов", 22);
        People people7 = new People(52, "Татьяна", "Петрова", 54);
        People people8 = new People(13, "Анна", "Куртикова", 32);
        People people9 = new People(1, "Евгений", "Романов", 25);
        People people10 = new People(17, "Олег", "Сидоров", 13);

        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);
        peoples.add(people6);
        peoples.add(people7);
        peoples.add(people8);
        peoples.add(people9);
        peoples.add(people10);

        Functions function = new Functions();
        function.SortById(peoples);

        System.out.println("Список людей, отсортированный по id: ");
        for(People people : peoples){
            System.out.println(people);

        }

        System.out.println("Среднее арифметическое по возрасту: " +  function.averageAge(peoples));

        System.out.println("Введите первую букву фамилии: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Люди с фамилией на заданную букву: ");
        function.SearchByLetter(peoples,str);


    }
        }


