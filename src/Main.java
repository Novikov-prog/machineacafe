public class Main
{
    public static void main(String[] args)
    {
        int moneyAmount = 2; // valeur du portmonnaie

        int cappucinoPrice = 4;
        int lattePrice = 3;
        int espressoPrice = 2;
        int waterPrice = 2;

        boolean isMilkEnough = true;
        boolean canBuyAnything = false;

        boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;

        if (moneyEnoughForCappucino && isMilkEnough)
        {
            System.out.println("Vous pouvez acheter un cappucino");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrice && isMilkEnough)
        {
            System.out.println("Vous pouvez acheter un latte");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice)
        {
            System.out.println("Vous pouvez acheter un espresso");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice)
        {
            System.out.println("Vous pouvez acheter de l\'eau");
            canBuyAnything = true;
        }

        System.out.println(canBuyAnything ? "Choisir le boisson" : "Pas assez de moyens"); // operateur ternaire


    }
}
