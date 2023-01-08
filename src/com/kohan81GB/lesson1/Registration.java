package com.kohan81GB.lesson1;

public class Registration {

    Member member;
    Registration(Member member){
        this.member = member;
    }

    boolean check(Member member){
        return member.admittance();
    }
}
