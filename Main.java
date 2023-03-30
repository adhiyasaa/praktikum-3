import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Silakan masukkan hero Anda!");

        Hero hero1 = new Hero();
        do {

            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("========== Hero 1 ===========");
            System.out.print("Nama          = ");
            hero1.setName(input.nextLine());
            System.out.print("Healthpoint   = ");
            hero1.setHealth(input.nextDouble());
            System.out.print("Attack        = ");
            hero1.setAttack(input.nextDouble());
            System.out.print("Defence       = ");
            hero1.setDefense(input.nextDouble());
            input.nextLine();

        } while (hero1.getHealth() > 500 || hero1.getAttack() > 500 || hero1.getDefense()>500 );
        String nama2;
        double hp2,atk2,def2;
        do {
            System.out.println("========== Hero 2 ==========");
            System.out.print("Nama          = ");
            nama2 = input.nextLine();
            System.out.print("Healthpoint   = ");
            hp2 = input.nextDouble();
            System.out.print("Attack        = ");
            atk2 = input.nextDouble();
            System.out.print("Defense       = ");
            def2 = input.nextDouble();
            input.nextLine();


        }while (hp2 > 500 || atk2 > 500 || def2 >500 );

        Hero hero2 = new Hero(nama2,hp2,atk2,def2);

        int ronde = 1;

            while (hero1.getHealth() > 0 && hero2.getHealth()>0){
                System.out.println("==========ROUND "+ronde+ " ==========");
                hero1.menyerang(hero2);
                hero2.menyerang(hero1);
                ronde++;
            }

            if (hero1.getHealth()> hero2.getHealth()){
                System.out.println("GAME OVER! " + hero1.getName() + " WIN");

            } else {
                System.out.println("GAME OVER! " + hero2.getName() + " WIN");

            }
        }
    }
