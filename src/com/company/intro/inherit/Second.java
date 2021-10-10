package com.company.intro.inherit;

public class Second extends First {
    private int salary;

    public String hobby(String getHobby){
        return getHobby;
    }
    Second(int salary, String name, int age, String address,String hobby, String occupation){
        super(name,age,address,hobby,occupation);
        this.salary= salary;
    }


    @Override
    public int calAge(int birthYear, int currentYear){
        int hold = currentYear-birthYear;
        return hold;
    }


    public static void main(String[] args) {
    Second person = new Second(23000, "AdeFemi",45,"Osun","teaching","teacher");
    Second person1 = new Second(14900,"Ngozi",34,"Imo","singing","music-tutor");
    Second person2 = new Second(15000,"Sam",22,"Lagos","running","athlete");
    Second person3 = new Second(25000,"Esther",25,"benin","illustrating","tailor");

    int test = person.calAge(2005,2021);
        System.out.println(test);

        person.hobby("Baseball");

    }

//    public void display(){
//        int test = calAge(2005,2021);
//        System.out.println(test);
//
//        int test1 = super.calAge();
//
//    }
}
