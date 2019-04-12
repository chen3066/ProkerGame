/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;
import java.util.ArrayList;
/**
 *
 * @author zhang
 */
public class Hand implements Draw{
    private ArrayList<Card> hand = new ArrayList<>();
    
    
    public void addCard(Deck cards)
    {
        hand.add(cards.getTop());
        cards.removeTop();
    }
    
    public Card seeIndexHand(int index)
    {
        return hand.get(index);
    }
    
    public int[] seeAllHandRank()
    {
        int ary_index[] = new int[6];
        for(int i=0; i<hand.size(); i++){
            if(Integer.parseInt(hand.get(i).toString())==11||Integer.parseInt(hand.get(i).toString())==12||Integer.parseInt(hand.get(i).toString())==13)
            ary_index[i]=10;
            else
            ary_index[i]=(Integer.parseInt(hand.get(i).toString()));
        }
        return ary_index;           
    }
    
    
    public void toRound(Round rd, int index)
    {
        rd.addCard(hand.get(index));
    }
}
