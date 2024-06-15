
package com.mycompany.banco;

import com.mycompany.banco.Conta.Conta;
import java.util.List;

public class BancoB {
    
    private String nome;
    private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
