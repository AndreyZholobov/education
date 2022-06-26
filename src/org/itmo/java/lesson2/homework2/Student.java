package org.itmo.java.lesson2.homework2;

public class Student {
    private String name;
    private String serName;
    private String midName;
    private int kursNum;
    private int raiting;

    public Student(String name, String serName, String midName, int kursNum, int rairing) {
        this.name = name;
        this.serName = serName;
        this.midName = midName;
        this.kursNum = kursNum;
        this.raiting = rairing;
    }

    public Student() {
        this.name = "";
        this.serName = "";
        this.midName = "";
        this.kursNum = 0;
        this.raiting = 0;
    }

    //public void ShowInfo() {
    //    System.out.println("Name = " + this.getName() + " , Sername = " + this.getSerName() + " , Midname = "
    //            + this.getMidName() + " , kursNum = " + this.getKursNum() + " , raiting = " + this.getRainting() + " , id =");
    //}

    public String getName() {
        return name;
    }

    public String getSerName() {
        return serName;
    }

    public String getMidName() {
        return midName;
    }

    public int getKursNum() {
        return kursNum;
    }

    public int getRainting() {
        return raiting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerName(String setName) {
        this.serName = setName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setKursNum(int kursNum) {
        this.kursNum = kursNum;
    }

    public void setRainting(int raiting) {
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                ", midName='" + midName + '\'' +
                ", kursNum=" + kursNum +
                ", raiting=" + raiting +
                '}';
    }
}