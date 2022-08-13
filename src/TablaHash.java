
public class TablaHash implements HashTable {
	int[] arr;
	private int capacity = 1000000;
	
    public TablaHash() {
        arr = new int[capacity];
        // Llenamos el arreglo para no tener campos null
        for (int i = 0; i < capacity; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer put(String key, Integer value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
