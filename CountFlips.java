import java.util.Random;

public class CountFlips
{
    public static void main(String[] args)
    {
        int heads = 0;
        int tails = 0;
        int flips = 0;
        Coin coin = new Coin();
        while (heads < 100 && tails < 100)
        {
            coin.flip();
            if (coin.isHeads())
            {
                heads++;
                System.out.println("heads");
            }
            else
            {
                tails++;
                System.out.println("tails");
            }
            flips++;
        }
        System.out.println("It took " + flips + " flips to get 100 heads or 100 tails.");
    }
}

class Coin {
    private static final int HEADS = 0;
    private static final int TAILS = 1;
    private int face;
    private Random rand;

    public Coin() {
        rand = new Random();
        flip();
    }

    public void flip() {
        face = rand.nextInt(2);
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public boolean isTails() {
        return (face == TAILS);
    }
}
