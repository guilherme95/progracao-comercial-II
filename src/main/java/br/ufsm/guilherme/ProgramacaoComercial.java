/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

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
