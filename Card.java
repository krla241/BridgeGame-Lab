//Card is abstract because it's not completely implemented, and since it's not complete it cannot be used to
//instantiate objects. It contains at least one abstract method.

public abstract class Card
{
  public char face;
  
  
  public Card(char face)
  {
    this.face=face;
  }
  public char getFace()
  {
    return this.face; 
  }
  public String toString()
  {
    String name= Character.toString(this.face);
    return name + " ";
  }
  
  abstract public int getPoints();
}