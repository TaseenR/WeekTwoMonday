package qa.practise.sky;

import java.util.* ;


public class Runner
{
    public static void main(String[] args)
    {
        Weapon sword = new Weapon(100, 2000,true, false, 20,"Slash?");
        System.out.println(sword.getDurabillity());
    }
}