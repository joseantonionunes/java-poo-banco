
package com.mycompany.banco.Conta;

import com.mycompany.banco.Cliente.Cliente;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
