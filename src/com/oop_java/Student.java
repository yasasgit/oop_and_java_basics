package com.oop_java;

public class Student {
    private  String name;
    private int score, quizzes;
    public Student()
    {
        name="default_name";
        quizzes=0;
        score=0;
    }
    public void getName(String name)
    {
        this.name=name;
    }
    public void addQuiz(int score)
    {
        this.score=this.score+score;
        quizzes++;
    }
    public void getTotal()
    {
        System.out.println(name+"'s total is "+score+" for "+quizzes+" quizzes");
    }
    public void getAvg()
    {
        System.out.println(name+"'s average is "+score/quizzes);
    }
}
