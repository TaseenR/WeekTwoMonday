package qa.practise.sky;

public class Weapon {
    private int damageOutput;
    private int price;
    private boolean isOneHanded;
    private boolean singleOperator;
    private int durabillity;
    private String damangeType;

    public Weapon(int damageOutput, int price, int durabillity) {
        super();
        this.damageOutput = damageOutput;
        this.price = price;
        this.durabillity = durabillity;
    }

    public Weapon(boolean isOneHanded,boolean singleOperator,String s1,int i, int i1,int i2){
        this(i,i1,i2);
        this.isOneHanded = isOneHanded;
        this.singleOperator = singleOperator;
        this.damangeType = s1;

    }
    public int getDamageOutput() {
        return damageOutput;
    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isSingleOperator() {
        return singleOperator;
    }

    public void setSingleOperator(boolean singleOperator) {
        this.singleOperator = singleOperator;
    }

    public int getDurabillity() {
        return durabillity;
    }

    public void setDurabillity(int durabillity) {
        this.durabillity = durabillity;
    }

    public String getDamangeType() {
        return damangeType;
    }

    public void setDamangeType(String damangeType) {
        this.damangeType = damangeType;
    }

    @override
    public String toString(){
        return "I do " + this.getDamangeType() + " My damage stat is " + this.getDamageOutput() + "My durabillity is " +this.getDurabillity();
    }
}
