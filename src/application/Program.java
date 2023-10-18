package application;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args){
        Connection conn = DB.getConnection(); //QUANDO PRECISAR DE UMA CONEXAO COM O BANCO DE DADOS BASTA DIGITAR ISSO
        DB.closeConnection();
    }
}
