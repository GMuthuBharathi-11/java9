sealed class Shop permits Biscuits, Icecream {
    int numOfPieces()
    {
        return 0;
    }
}

final class Biscuits extends Shop {
    public int numOfPieces()
    {
        return 10;
    }
}
sealed class Icecream extends Shop permits Chocolate {
    public int numOfPieces()
    {
        return 20;
    }
}

non-sealed class Chocolate extends Icecream {
    public int numOfPieces()
    {
        return 50;
    }
}


public class Q12 {

    public static void main(String[] args) {
        Chocolate chocolate =new Chocolate();
        Icecream  Icecream          =new Icecream();
        Biscuits  Biscuits               =new Biscuits();
        System.out.println("Pieces served of Biscuits: "+Biscuits.numOfPieces());
        System.out.println("Pieces served of Icecream: "+Icecream.numOfPieces());
        System.out.println("Pieces served of Chocolate: "+chocolate.numOfPieces());
    }

}

