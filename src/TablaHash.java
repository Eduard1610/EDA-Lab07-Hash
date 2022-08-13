
public class TablaHash implements HashTable {
	
	class Node {
		protected String key;
		protected int value;
		
		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
	
	Node[] arr;
	private int capacity = 1000000;
	
    public TablaHash() {
        arr = new Node[capacity];
    }
    
 

	@Override
	public int size() {
		int espaciosOcupados = 0;
		// Al ser un arreglo basta con recorrer e identificar que espacios están ocupados
		for (int i=0; i<capacity; i++) {
			if (arr[i] != null) {
				espaciosOcupados++;
			}
		}
		return espaciosOcupados;
	}

	@Override
	public boolean isEmpty() {
		if(this.size() == 0) // Si no hay elementos "isEmpty() -> true"
			return true;
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// Aplicamos la función hash a key para que nos retorne directamente el índice
		// Si aplicamos el hash a la llave, luego buscamos ese índice en el arreglo y existe un elemento
		// Entonces retorna true
		if(arr[key.hashCode()] != null) 
			return true;
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
	
	@Override
	public int hashCode() { // Esta función genera los códigos hash para los índices
	    final int prime = 31;
	    int result = prime; // (falta definir la función) // Elijan una sencilla
	    return result;
	}
}
