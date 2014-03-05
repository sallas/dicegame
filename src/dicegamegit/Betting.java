package dicegamegit;


public class Betting
{
    private int bet;
    
    public Betting()
    {
        
    }
    
    public void makeBet(int bet)
    {
        this.bet = bet;
    }
    
    public int giveWinnings()
    {
        return bet * 2;
    }
    
}
