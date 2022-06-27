package org.itmo.java.lesson3.homework3;

import org.itmo.java.lesson2.Color;

public class mainLesson3 {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println();

        someClass car1 = new someClass();
        someClass car2 = new someClass(Color.BLACK, 35);
        someClass car3 = new someClass(56);
        System.out.println(car1.printInformation());
        System.out.println(car2.printInformation());
        System.out.println(car3.printInformation());
        System.out.println();

        House house1 = new House();
        house1.setHouse(9, 1999, "house1");
        System.out.println(house1.printHouse() + ". Years from build " + house1.yearFromBuild());
        House house2 = new House();
        house2.setHouse(22, 2016, "house2");
        System.out.println(house2.printHouse() + ". Years from build " + house2.yearFromBuild());
        System.out.println();

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(48, "Дерево1");
        Tree tree3 = new Tree(32, true, "Дерево2");
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
