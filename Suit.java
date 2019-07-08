import java.util.ArrayList;

public class Suit
{
  private ArrayList<Card>cards;
  private String suitStr;
  private final int MIN_LONG=1;
  private final int VOID_POINTS=3;
  private final int SINGLETON_POINTS=2;
  private final int DOUBLETON_POINTS=1;
  
  public Suit(String suitStr) //name of suite
  {
    this.cards=new ArrayList<Card>(); //instantiates with default array list constructor
    this.suitStr=suitStr; //sets to value
  }
  public void addCard(char face)
  {
    //creates appropriate card object (card with number or card with figure)and adds it to the list

      if(face<=57 && face >=50)
      {
        CardWithNumber number=new CardWithNumber(face);
        this.cards.add(number);

      }
      else
      {
        CardWithFigure figure=new CardWithFigure(face);
       this.cards.add(figure);
      }

  }


  public void printSuit()
  {

    System.out.print(this.suitStr + ": ");

    for( Card c: this.cards){

      System.out.print(c.toString());

      }


       System.out.println();

  }
  public int suitPoints()
  {
    int points=0;

    for(Card c: this.cards)
    {
      if(c instanceof CardWithFigure){
        points += c.getPoints();}
      else if(c instanceof CardWithNumber){
        points +=c.getPoints();
      }

    }

    return points;
  }
}
