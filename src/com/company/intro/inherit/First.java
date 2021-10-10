package com.company.intro.inherit;

public class First  {
//A class that prototypes a person
    private String name;
    private int age;
    private String address;
    private String hobby;
    private String occupation;

    //Method of the class to serve as behavior
    protected int calAge(int birthDate, int currentDate){
        return currentDate - birthDate;
    }

    //Overloading constructor
    First(String name, int age, String address, String hobby, String occupation){
        this.name = name;
        this.address = address;
        this.hobby= hobby;
        this.age = age;
        this.occupation= occupation;
    }

    //Constructor of class First, which enables me construct instances
//    First(String name, int age, String address, String hobby, String occupation, int itemCost, String item){
//        super(itemCost,item);
//        this.name = name;
//        this.address = address;
//        this.hobby= hobby;
//        this.age = age;
//        this.occupation= occupation;
//    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String buyItem(String cat) {
        return "wholesales";
    }


    public static void main(String[] args) {
//    First one = new First("Segun",24,"Lekki","cooking","designing", 4500,"beverages");
//    First two = new First("Sandra",20,"Ogun","sewing","Tailor", 3000,"sanitary");
//    First three = new First("Ranti",25,"Imo","cooking","chef", 2500,"seasoning");
//    First four = new First("Anayo",27,"Delta","drumming","musician",5000,"beatz");
//    First five = new First("Musa",24,"Kano","selling","shop-owner",5600,"millet");

        First one = new First("Segun",24,"Lekki","cooking","designing");
        First two = new First("Sandra",20,"Ogun","sewing","Tailor");
        First three = new First("Ranti",25,"Imo","cooking","chef");
        First four = new First("Anayo",27,"Delta","drumming","musician");
        First five = new First("Musa",24,"Kano","selling","shop-owner");

        int holder = four.calAge(2003, 2021);
        System.out.println(holder);


    }
}
