package exec6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno extends Aluno {

	public static void main(String[] args) {
		
	// Aluno n = new Aluno("Felipe", 1991, "25/11/1991" , "Lógica", "São Paulo");
		
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de nascimento:");
		String data[] = dataCompleta.split("/");
		int diaUs = Integer.parseInt(data[0]);
		int mesUs = Integer.parseInt(data[1]);
		int anoUs = Integer.parseInt(data[2]);
	  
		DateTime dataInicial =new DateTime(anoUs, mesUs , diaUs,0,0);
		
		String ano = (new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
		String mes = (new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
		String dias = (new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));
		
		int anoAtual = Integer.parseInt(ano);
		int mesAtual = Integer.parseInt(mes);
		int diaAtual = Integer.parseInt(dias);
		
		DateTime dataFinal = new DateTime(anoAtual, mesAtual ,diaAtual,0,0);
		
		int numeroDias = Days.daysBetween(dataInicial, dataFinal).getDays();
		
		
		
		JOptionPane.showMessageDialog( null, "Seus dias são: " + numeroDias );
	

	}

}
