package deep.generic;

public class Pair<K, V> {

  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  /**
   * @param key the key to set
   */
  public void setKey(K key) {
    this.key = key;
  }

  /**
   * @return the key
   */
  public K getKey() {
    return key;
  }
  /**
   * @param value the value to set
   */
  public void setValue(V value) {
    this.value = value;
  }

  /**
   * @return the value
   */
  public V getValue() {
    return value;
  }
}