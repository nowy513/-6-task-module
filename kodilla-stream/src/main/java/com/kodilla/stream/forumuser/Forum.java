package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theList = new ArrayList<>();
    public  Forum(){
        theList.add(new ForumUser(5367,"Jan24", 'M', 1998, 5, 23, 4));
        theList.add(new ForumUser(4892, "Ser4",'M',2005,6,24,16));
        theList.add(new ForumUser(3253,"Dian",'F',2000,12,2,4));
        theList.add(new ForumUser(2413,"Laur",'F',1994,11,4,0));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theList);
    }
}
