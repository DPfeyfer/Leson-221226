public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("if your age = " + age + " then you are an adult!");}
        else { System.out.println("if your age = " + age + " then you are not an adult!");}


        //task 2
        System.out.println("task 2");
        int outsideTemp = 6;
        if (outsideTemp <= 5) {
            System.out.println("Today is cool " + outsideTemp + " degrees, your need cap");}
        else {
            System.out.println("Today is warmly " + outsideTemp + " degrees, your not need cap");}


        //task 3
        System.out.println("task 3");
        int speed = 70;
        if (speed <= 60) {
            System.out.println("if your speed " + speed + " is good");}
        else {
            System.out.println("if your speed " + speed + " is not good");}


        //task 4
        System.out.println("task 4");
        int personAge = 7;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("your need to go to kindergarten");}
        else if (personAge >= 7 && personAge < 18) {
            System.out.println("your need to go to school");}
        else if (personAge >= 18 && personAge < 24) {
            System.out.println("your need to go to university");}
        else {
            System.out.println("your need to go to work");}

        //if (personAge >= 24) {
        // System.out.println("your need to go to work");}


        //task 5
        System.out.println("task 5");
        int childAge = 15;
        if (childAge <= 5) {
            System.out.println("if child age " + childAge + " you can't ride the ride");}
        else if (childAge > 5 && childAge <= 14) {
            System.out.println("if child age " + childAge + " you can ride the ride with adult");}
        else {
            System.out.println("if child age " + childAge + " you can ride the ride without adult");}



        //task 6
        System.out.println("task 6");
        int wagonCapacity = 102;
        if (wagonCapacity <= 60) {
            System.out.println("there is a sit place in the wagon");}
        else if (wagonCapacity <= 102) {
            System.out.println("there is a place in the wagon");}
        else {
            System.out.println("there is not a place in the wagon");
        }




        //task 7
        System.out.println("task 7");
        int one = 75;
        int two = 705;
        int three = 80;
        if (one >= two && one >= three) {
            System.out.println(one + " is most");}
        else if (two >= one && two >= three) {
            System.out.println(two + " is most");}
        else {
            System.out.println(three + " is most");}

}}