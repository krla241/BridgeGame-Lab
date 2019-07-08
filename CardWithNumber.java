public class CardWithNumber extends Card
{
  public CardWithNumber(char face)
  {
    super(face);
    
    
  }
  
  public int getPoints()
  {
    int points = Character.getNumericValue(this.face);

    return points;
    
  }
}