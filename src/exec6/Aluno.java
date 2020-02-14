package exec6;
/**
 * Classe responsavel pelo cadastro dos alunos
 * @author fcorrea
 * @since 12/02/2020
 * @version 0.1
 */

import java.time.Year;
import java.util.Date;
//import org.joda.time.DateTime;
public class Aluno {
	
	String nome;
	int anoNascimento;
	String dataNasc;
	String curso;
	String cidade;
	
	public Aluno() {
	}
	
	public Aluno(String nome, int anoNascimento, String dataNasc, String curso, String cidade) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.dataNasc = dataNasc;
		this.curso = curso;
		this.cidade = cidade;
		mostrar();
	}	
	
	
//	public int calAno() {
//		Year y = Year.now();
//		int ano = y.getValue();
//		return ano - this.anoNascimento;
//		
//	}
	
	
	public int calAno(){
		String data =(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
		int dT = Integer.parseInt(data);
		
		String datas[] = dataNasc.split("/");
		String d = datas[2] + datas[1] + datas[0];
		
		int dU = Integer.parseInt(d);
		
		int idade = ((dT - dU))/10000;
		
		return idade;
		
		
	}
	
	
	
	public int calDiasDeVida(){
	
		String ano = (new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
		String mes = (new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
		String dias = (new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));
		
		int anoAtual = Integer.parseInt(ano);
		int mesAtual = Integer.parseInt(mes);
		int diaAtual = Integer.parseInt(dias);
		
		
		
		String datas[] = dataNasc.split("/");
		
		int diaUs = Integer.parseInt(datas[0]);
		int mesUs = Integer.parseInt(datas[1]);
		int anoUs = Integer.parseInt(datas[2]);
		
		int totDias = ((anoAtual - anoUs)*365) + ((mesAtual - mesUs)*30) + (diaAtual - diaUs); 
		
		return totDias;
		
		
		
		//int dias = Days.daysBetween(nascimento,dataAtual).getDays();
		
		
	}
	
	
	public void mostrar() {
		System.out.println(this.nome);
		System.out.println("Idade: " + calAno());
		System.out.println("Curso: " + this.curso);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Dias totais: "+ calDiasDeVida() );
	}
	
	
	
	
	
	
}
