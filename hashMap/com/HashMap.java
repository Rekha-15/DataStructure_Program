/**
 * @purpose Hashing Function to search a Number in a slot.
 * @author rekha
 * @version 1.0
 *  @since 15-062021
 */

package hashMap.com;

//A node of chains
public class HashMap<K, V> {
	K key;
	V value;
	HashMap<K, V> next;

	HashMap(K key, V value) {
		this.key = key;
		this.value = value;
	}
}