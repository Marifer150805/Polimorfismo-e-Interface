package Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		
		Horista horista = new Horista("Id", "Manuella", "996655884", "582563147", "Rua Expedicionario");
		System.out.println("nome: " +horista.getId());
		System.out.println("sexo: " +horista.getNome());
		System.out.println("raça: " +horista.getTelefone());
		System.out.println("raça: " +horista.getMatricula());
		System.out.println("raça: " +horista.getEndereco());
		horista.id();
		horista.nome();
		horista.telefone();
		horista.matricula();
		horista.endereco();
		
		Jornada jornada = new jornada("Id", "Manu", "996655884", "582563147", "Rua Expedicionario");
		System.out.println("nome: " +jornada.getId());
		System.out.println("sexo: " +jornada.getNome());
		System.out.println("raça: " +jornada.getTelefone());
		System.out.println("raça: " +jornada.getMatricula());
		System.out.println("raça: " +jornada.getEndereco());
		jornada.id();
		jornada.nome();
		jornada.telefone();
		jornada.matricula();
		jornada.endereco();
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("Id", "Manu", "996655884", "582563147", "Rua Expedicionario");
		System.out.println("nome: " +PessoaJuridica.getId());
		System.out.println("sexo: " +PessoaJuridica.getNome());
		System.out.println("raça: " +PessoaJuridica.getTelefone());
		System.out.println("raça: " +PessoaJuridica.getMatricula());
		System.out.println("raça: " +PessoaJuridica.getEndereco());
		pessoaJuridica.id();
		pessoaJuridica.nome();
		pessoaJuridica.telefone();
		pessoaJuridica.matricula();
		pessoaJuridica.endereco();
}
}