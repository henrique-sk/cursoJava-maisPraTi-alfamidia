package aula01e02StaticeToString;

public class Main {

	public static void main(String[] args) {
		
		Objetos.setValor2(300);
		
		System.out.println("Objeto valor2 é " + Objetos.getValor2());
		
		Objetos obj1 = new Objetos(10);
		obj1.setValor1(20);
//		Objetos.setValor2(200);
		
//		System.out.println("valores são " + obj1.getValor1() +
//				 " e " + Objetos.getValor2() + ".");
		System.out.println("valores são " + obj1.getValor1() +
				 " e " + obj1.calcula() + ".");
		
		Objetos obj2 = new Objetos(11);
		obj2.setValor1(21);
//		Objetos.setValor2(201);

//		System.out.println("valores são " + obj2.getValor1() +
//				 " e " + Objetos.getValor2() + ".");
		System.out.println("valores são " + obj2.getValor1() +
				 " e " + obj2.calcula() + ".");
		
//		System.out.println("valores são " + obj1.getValor1() +
//				 " e " + Objetos.getValor2() + ".");
		
		Objetos.setValor2(30);
		System.out.println("valores são " + obj1.getValor1() +
				 " e " + obj1.calcula() + ".");
		System.out.println("valores são " + obj2.getValor1() +
				 " e " + obj2.calcula() + ".");
		
		// precisa do toString na classe para transformaro objeto em string
		System.out.println("Este objeto é: " + obj1);
		System.out.println("Este objeto é: " + obj2);
		
	}

}
