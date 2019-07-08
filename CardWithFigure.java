public class CardWithFigure extends Card
{
  private final String MAPPING = "TJQKA";

  CardWithFigure(char face)
  {
    super(face);
  }


  public int getPoints() {

    int points = 0;
    for( int i = 0; i<MAPPING.length(); i++)
    {
      switch(MAPPING.charAt(i))
      {
        case 'T':
          points = i;
          break;
        case 'J':
          points = i;
          break;
        case 'Q':
          points = i;
          break;
        case 'K':
          points = i;
          break;
        case 'A':
          points = i;
          break;
      }
    }
         return points;

  }
}