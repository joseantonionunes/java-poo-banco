
package com.mycompany.banco;

import com.mycompany.banco.Conta.ContaPoupanca;
import com.mycompany.banco.Conta.ContaCorrente;
import com.mycompany.banco.Conta.Conta;
import com.mycompany.banco.Cliente.Cliente;

public class Banco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setidade(25);

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
