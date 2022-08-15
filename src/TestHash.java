
public class TestHash {

	public static void main(String[] args) {
		// Clase de testeo
		TablaHash tablaEnteros = new TablaHash();
		//Testeo: Funcion isEmpty
		System.out.println((tablaEnteros.isEmpty())?"La tabla Hash esta vacia":"La tabla Hash tiene elementos");
		//Testeo: Funcion put
		for(int i = 0; i < 15; i++){
			System.put.println("Valor " + tablaEnteros.put(""+i, i+100) + " agregado con exito a la tabla Hash");
		}
		//Testeo: Funcion size
		System.out.println("Tamaño de la Tabla Hash : " + tablaEnteros.size());
		//Testeo: Funcion containsKey
		String llave = "20"; //Ud. puede modificar el valor de esta variable para fines de testeo
		if(tablaEnteros.containsKey(llave))
			System.out.println("La llave " + llave + " se encuentra en la tabla Hash");
		else
			System.out.println("No se encontro la llave");
		//Testeo: Funcion containsValue
		int valor = 110; //Ud. puede modificar el valor de esta variable para fines de testeo
		if(tablaEnteros.containsValue(valor))
			System.out.println("El valor " + valor + " se encuentra en la tabla Hash");
		else
			System.out.println("No se encontro el valor");
		//Testeo: Funcion get
		String llaveGet = "10";
		int valueGet = tablaEnteros.get(llaveGet);
		if (valueGet != null)
			System.out.println("La llave " + llaveGet + " le corresponde el valor de " + valueGet);
		else
			System.out.println("No existe un valor asociado para la llave " + llaveGet);
		//Testeo: Funcion remove
		String llaveRemove = "5";
		int valueRemove = tablaEnteros.get(llaveRemove);
		if (valueRemove != null)
			System.out.println("Se removio con exito el valor " + valueRemove);
		else
			System.out.println("No existe un valor asociado para la llave " + llaveRemove);
		//Testeo: Funcion clear
		//tablaEnteros.clear();
		System.out.println("Se removio con exito todos los valores de la tabla Hash");
	}

}
