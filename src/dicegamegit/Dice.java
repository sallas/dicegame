package dicegamegit;

import java.util.Random;

public class Dice
{
    private int eyes;
    private int die1, die2;
    
    public void roll()
    {
        Random generator = new Random();
        die1 = generator.nextInt(6) + 1;
        die2 = generator.nextInt(6) + 1;
        eyes = die1 + die2;
    }
    
        public int getDie1()
    {
        return die1;
    }

    public int getDie2()
    {
        return die2;
    }

    public int getEyes()
    {
        return eyes;
    }
}
