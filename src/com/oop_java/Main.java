package com.oop_java;

public class Main {

    public static void main(String[] args)
    {
    Student st = new Student();
    st.getTotal();
    st.getName("Yasas");
    st.getTotal();
    st.addQuiz(78);
    st.addQuiz(22);
    st.addQuiz(2);
    st.getTotal();
    st.getAvg();
    }
}
