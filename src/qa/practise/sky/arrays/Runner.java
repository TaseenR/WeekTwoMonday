package qa.practise.sky.arrays;


public class Runner
{
    public static void main(String[] args)
    {
        Weapon sword = new Weapon(true, false,"Slash", 200, 20,2000,"sword");
        Weapon gun = new Weapon(true,true,"slash",200,200,2000,"gun");
        Weapon knife = new Weapon(true,true,"slash",200,200,2000,"knife");
        Weapon baseballBat = new Weapon(true,true,"slash",200,200,2000,"baseball bat");
        Weapon Yoyo = new Weapon(true,true,"slash",200,200,2000 ,"yoyo");
        Weapon katana = new Weapon(true,true,"slash",200,200,2000,"katana");
        Weapon helloKittyBag = new Weapon(true,true,"slash",200,200,2000,"hello kitty bag");

        Weapon[] weaponList = {sword,gun,knife,baseballBat,Yoyo,katana,helloKittyBag};

        for (int i = 0; i < weaponList.length; i++) {
            System.out.println(weaponList[i]);
        }


        StringBuilder builder = new StringBuilder(100);

        builder.append("Hello ");
        builder.append("world");
        builder.append("!");

        System.out.println(builder.toString());
        System.out.println(builder.toString().equals("Hello world!"));
    }
}