package CadastroDePessoas;

import java.util.UUID;

public class Fisica extends Pessoa {
	
	private String cpf;
	private String rg;
		
	public Fisica(UUID id, String nome, String cpf, String rg) {
		super(id, nome);		
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	
	

	

}