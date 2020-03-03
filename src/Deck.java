import java.util.ArrayList;
import java.util.List;

public class Deck {

    private int size;

    private List<Card> cards;

    // Constructor misses King(s)
    // Copy toString method from starter code
    public Deck(/* set these to an Array !!! NVM !!!*/ ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values)
    {
        this.cards = new ArrayList<Card>();
        //this.cards.size() = ranks.size()-1 * suits.size()-1;
        for (int suit = 0; suit < suits.size(); suit++)
            {
            for (int rank = 0; rank < ranks.size(); rank++)
            {
                Card card = new Card(ranks.get(rank), suits.get(suit), values.get(rank));
                this.cards.add(card);
            }
        }

        this.size = cards.size();
        // shuffle the deck (ACTIVITY 4)
    }

    public boolean isEmpty()
    {
        if (this.size > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Card deal()
    {
        if (isEmpty())
        {
            return null;
        }
        // is this correct?

        this.size--;
        Card dealt = this.cards.get(this.size-1);

        return dealt;
    }

}
