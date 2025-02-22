public class card
{
    protected boolean IsFacingUp;
    protected int CardNumber;
    protected String Type;

    //Encapsulate boolean
    public boolean GetFacing()
    {
        return IsFacingUp;
    }

    public void SetFacing(boolean up)
    {
        IsFacingUp = up;
    }

    public void PrintNumber()
    {
        System.out.println(CardNumber + " of " + Type);
    }

    public String GetCardData()
    {
        return CardNumber + " of " + Type;
    }

    public card (int cardNumber)
    {
        this.CardNumber = cardNumber;
        IsFacingUp = false;
    }

    public card (int cardNumber, String type)
    {
        this.CardNumber = cardNumber;
        IsFacingUp = false;

        Type = type;
    }

    public card()
    {
        IsFacingUp = false;
    }
}
