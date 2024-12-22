import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CharacterStatistic {
public static void main(String args[]) {
        
Scanner in = new Scanner(System.in);
Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.###");
df.setRoundingMode(RoundingMode.CEILING);

System.out.println("Enter the base attack speed: ");
double base = input.nextDouble();

System.out.println("Enter the bonus attack speed %: ");
double bonus = input.nextDouble();
double bonusv2 = bonus/100;

System.out.println("Enter the level: ");
int lvl = input.nextInt();
double cas = base * (1 + (bonusv2 * (lvl - 1)));

System.out.println("The character's current attack speed is " + df.format(cas)+ ".");
    }
}
