
package br.ufsm.guilherme;

import br.ufsm.guilherme.connection.ConnectionFactory;

import java.sql.Connection;

public class ProgramacaoComercial {

    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();

        if (connection!=null)
            System.out.println("Conectado com sucesso!");
    }
}
