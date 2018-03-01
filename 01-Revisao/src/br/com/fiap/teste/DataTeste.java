package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTeste {
	
	public static void main(String []args){
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar hoje = Calendar.getInstance();
		
		//DataNormal(hoje);
		//TransformandoEmString(df);
		PegandoDataEspecifica(hoje , df);
		
		
	}

	private static void PegandoDataEspecifica(Calendar hoje , SimpleDateFormat df) {
		//Pegando data especifica
		Calendar formatura = new GregorianCalendar(2018, Calendar.FEBRUARY, 02);
		System.out.println(df.format(formatura.getTime()));
		
	}

	@SuppressWarnings("unused")
	private static void TransformandoEmString(SimpleDateFormat df) {
		
		//Transformar uma string em data
		
		String aniversarioLulu = "27/02/1998 15:30";
		try{
			System.out.println(df.parse(aniversarioLulu));
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
	}

	@SuppressWarnings("unused")
	private static void DataNormal(Calendar hoje) {
		
		//Criar objeto para formatar a data
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println(df.format(hoje.getTime()));
		System.out.println(hoje.getTime());
	}

}
