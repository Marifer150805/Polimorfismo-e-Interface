package Animal;

public class Principal {
	
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "M", "Branco");
		System.out.println("nome: " +lobo.getNome());
		System.out.println("sexo: " +lobo.getSexo());
		System.out.println("raça: " +lobo.getRaca());
		lobo.emitirSom();
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		
		Leao leao = new Leao("Scar", "M", "Leão");
		System.out.println("nome: " +leao.getNome());
		System.out.println("sexo: " +leao.getSexo());
		System.out.println("raça: " +leao.getRaca());
		leao.emitirSom();
		leao.caminhar();
		leao.correr();
		leao.dormir();
		
		Tigre tigre = new Tigre("Bengala", "M", "Tigre");
		System.out.println("nome: " +tigre.getNome());
		System.out.println("sexo: " +tigre.getSexo());
		System.out.println("raça: " +tigre.getRaca());
		tigre.emitirSom();
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		
		Cachorro cachorro = new Cachorro("Bob", "M", "Pastor Alemão");
		System.out.println("nome: " +cachorro.getNome());
		System.out.println("sexo: " +cachorro.getSexo());
		System.out.println("raça: " +cachorro.getRaca());
		cachorro.emitirSom();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		
		Gato gato = new Gato("Amy", "F", "Persa");
		System.out.println("nome: " +gato.getNome());
		System.out.println("sexo: " +gato.getSexo());
		System.out.println("raça: " +gato.getRaca());
		gato.emitirSom();
		gato.caminhar();
		gato.correr();
		gato.dormir();	
		
		
	}
 
}
