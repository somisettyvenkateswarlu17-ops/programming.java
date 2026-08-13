package day15;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HandsOnTable {
    public static void main(String[] args) {
        Map<Long,Double> cards = new Hashtable<>()
        cards.putIfAbsent(98776653554564L,0.0);
        cards.put(765456765645L,55000.0);
        cards.put(45678765678L,91000.0);
        cards.put(345678987654321L,78000.0);
      //System.out.println(cards);
      //System.out.println(cards.get(987654567876L));
      System.out.println(cards.getOrDefault(987766535545647L, 0.0));
      cards.put(987766535545647L,25000.0);
      cards.remove(345678987654321L);
      System.out.println(cards.containsValue(78000.0));
      System.out.println(cards.containsKey(345678987654321L));
      Set<Long> customers = cards.keySet();
      System.out.println("Credit card Customer are "+customers);
      Collection<Double> limits = cards.values();


    }
}
