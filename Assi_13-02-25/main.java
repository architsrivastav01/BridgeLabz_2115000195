
import java.util.*;
class HashMapImplementation<K, V> {
   private static final int SIZE = 16;
   private List<Entry<K, V>>[] buckets;
   public HashMapImplementation() {
       buckets = new List[SIZE];
       for (int i = 0; i < SIZE; i++) {
           buckets[i] = new LinkedList<>();
       }
   }
   private int getIndex(K key) {
       return key.hashCode() % SIZE;
   }
   public void put(K key, V value) {
       int index = getIndex(key);
       for (Entry<K, V> entry : buckets[index]) {
           if (entry.key.equals(key)) {
               entry.value = value;
               return;
           }
       }
       buckets[index].add(new Entry<>(key, value));
   }
   public V get(K key) {
       int index = getIndex(key);
       for (Entry<K, V> entry : buckets[index]) {
           if (entry.key.equals(key)) {
               return entry.value;
           }
       }
       return null;
   }
   public void remove(K key) {
       int index = getIndex(key);
       buckets[index].removeIf(entry -> entry.key.equals(key));
   }
   private static class Entry<K, V> {
       K key;
       V value;
       Entry(K key, V value) {
           this.key = key;
           this.value = value;
       }
   }
   public static void main(String[] args) {
   	HashMapImplementation<String, Integer> map = new HashMapImplementation<>();
       map.put("one", 1);
       map.put("two", 2);
       System.out.println(map.get("one"));
       map.remove("one");
       System.out.println(map.get("one"));
   }
}

