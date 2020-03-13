import java.util.ArrayList;
import java.util.List;

public class Deck {

    private int size;

    private List<Card> cards;

    // Constructor misses King(s)
    // Copy toString method from starter code
    public Deck(/* set these to an Array !!! NVM !!!*/ ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values)
    {
        this.cards = new ArrayList<Card>(ranks.size() * suits.size());
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
        System.out.println(this.size);

        shuffle();
        // shuffle the deck (ACTIVITY 4)
    }

    public void shuffle()
    {
        for (int k = this.cards.size()-1; k > 0; k--)
        {
            int r;
            r = (int)(Math.random() * (k + 1));
            Card temp = this.cards.get(k);
            this.cards.set(k, this.cards.get(r));
            this.cards.set(r, temp);
        }

        this.size = cards.size();
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

        Card dealt = this.cards.get(this.size-1);
        this.size--;

        return dealt;
    }

    public int size()
    {
        return this.size;
    }

    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }

}
