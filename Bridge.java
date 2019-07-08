  public class Bridge
  {
    private String[] SUIT_STRINGS;
    private String SUIT_CHARS;
    private Suit[] hand; //array of suit objects

    public Bridge(String hand)
    {
      SUIT_STRINGS= new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
      SUIT_CHARS="CDHS";


      //1. instantiate the instance variable hand. (ARRAY OF SUIT OBJECTS)
      this.hand = new Suit[4];

      //2. takes the input line and fills the hand with appropriate data
      // *populate array with suit objects


      //Create suit objects

      Suit clubs = new Suit("Clubs");
      Suit diamonds = new Suit("Diamonds");
      Suit hearts = new Suit("Hearts");
      Suit spades = new Suit("Spades");

      //Check every character in the hand string. Depending on the letter, save the data in the
      //corresponding suit object.
      for(int i=0; i<hand.length(); i++)
      {
        switch (hand.charAt(i)) {
        case 'C':
          clubs.addCard(hand.charAt(i-1));
          break;
        case 'D':
          diamonds.addCard(hand.charAt(i-1));
          break;
        case 'H':
          hearts.addCard(hand.charAt(i-1));
          break;
        case 'S':
          spades.addCard(hand.charAt(i-1));
          break;
        default:
          break;
      }

    }
      //Populate the hand array with  club objects
        this.hand[0] = clubs;
        this.hand[1] = diamonds;
        this.hand[2] = hearts;
        this.hand[3] = spades;
    }


    public void printHand() {

      for (int i = 0; i < this.hand.length; i++)
            this.hand[i].printSuit();
    }


    public void printTotalPoints()
    {
       int points=0;
//      for( int i=0; i<this.hand.length; i++)
//      {
//        points = this.hand[i].suitPoints();
//      }
      points=this.hand[0].suitPoints();
      System.out.println("Total points: " + points);

    }

  }