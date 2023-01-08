package com.kohan81GB.lesson1;

import java.util.ArrayList;

public class Compitition {

    Member members[];

    ArrayList<Member> membersList;

    void compitition(Barriers barrier, Member ... members){

        membersList = new ArrayList<>();
        getMembers(members);

        for (Member member : membersList){
            if (barrier instanceof Wall) {
                    member.toJump(((Wall) barrier).getHight());
                }else if (barrier instanceof Treadmill) {
                    member.toRun(((Treadmill) barrier).getDistance());
                }
        }
    }

    public ArrayList<Member> getMembers(Member ... members) {
        for (Member member : members){
            if (new Registration(member).check(member)) membersList.add(member);
        }
        return membersList;
    }
}
