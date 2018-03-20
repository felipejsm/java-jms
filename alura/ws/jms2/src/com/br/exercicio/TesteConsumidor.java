package com.br.exercicio;

	import java.util.Scanner;
	
	import javax.jms.Connection;
	import javax.jms.ConnectionFactory;
	import javax.naming.InitialContext;
	
	public class TesteConsumidor {
		public static void main(String[] args) throws Exception {
			InitialContext context = new InitialContext();
			ConnectionFactory cf = (ConnectionFactory) context.lookup("ConnectionFactory");
			Connection conexao = cf.createConnection();
			conexao.start();
			new Scanner(System.in).nextLine();
			conexao.close();
			context.close();
			
		}
	}
