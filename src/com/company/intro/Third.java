package com.company.intro;

 class Third {
    //Class to create prototype for meals
    private int cost;
    private String name;
    private String classOfFood;

    Third(int cost, String name, String classOfFood){
        this.cost = cost;
        this.name = name;
        this.classOfFood= classOfFood;
    }

    public String cookBeans(String one, String two){
     return " use  " + one + " and " +  two;
    }

    public String cookRice(String one, String two){
        return "use " + one + " and " + two;
    }

    public String fryEggs(String one, String two){
        return "use " + one + " and " + two;
    }
    public String bakeBread(String one, String two,String three){
        return "use " + one + " " + two + " and " + three;
    }

    public String bakeBread(String one, String two,String three, String four){
        return "use " + one + " " + two + " " + three + " and " + four;
    }

    public int sum(int one , int two){
        int hold = one + two;
        return hold;
    }

     protected void sum(float top , float up){
         float hold = top + up;
    }


     public static void main(String[] args) {
        //Create object of Third class
        Third meal1 = new Third(350,"bread","carbs");
        Third meal2 = new Third(500,"beans","protein");
        Third meal3 = new Third(600,"rice","carbs");
        Third meal4 = new Third(400,"eggs","protein");


        String hold = meal1.bakeBread("oil", "flour","sugar");
        System.out.println(hold);

        System.out.println(meal2.cookBeans("fish", "OIL"));

        System.out.println(meal3.cookRice("BOIL","SIEVE"));

        System.out.println(meal4.fryEggs("OIL","EGG"));
  }



}
