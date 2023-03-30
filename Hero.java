public class Hero {
    private String name;
    private double health;
    private double attack;
    private double defense;

    public Hero(String name, double health, double attack, double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }
    public Hero() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getHealth() {
        return health;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getAttack() {
        return attack;
    }
    public void setDefense(double defense){
        this.defense = defense;
    }

    public double getDefense(){
        return this.defense;
    }

    public void menyerang(Hero musuh){

        if(this.getHealth() != 0 && musuh.getHealth()!=0) {
            System.out.println(this.getName() + " menyerang " + musuh.getName() );
            System.out.println(this.getName() + " menyerang sebesar " + this.getAttack());
            System.out.println(musuh.getName() + " memiliki pertahanan sebesar " + musuh.getDefense());
            if (musuh.getDefense() > this.getAttack()) {
                musuh.setHealth(musuh.getHealth());

            }
            else musuh.setHealth(musuh.getHealth() - (this.getAttack() - musuh.getDefense()));

            if (this.health < 0) this.health = 0;
            if (musuh.getHealth() < 0) musuh.setHealth(0);
            System.out.println("Stats " + this.getName() );
            System.out.println("Health Point = "+this.getHealth());
            System.out.println("Stats "+musuh.getName() );
            System.out.println("Health Point = "+musuh.getHealth());
            System.out.println("====================");
        }
    }
}