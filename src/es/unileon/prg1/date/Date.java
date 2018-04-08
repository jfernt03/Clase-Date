package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	

	public int getMonth(){
		return this.month;
	}
	

	public int getDay(){
		return this.day;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonth(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	boolean isSameDay(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSame (Date another){
		if ( this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear()){
			return true;
		}
		return false;
	}
	
	
//sin IFs
	
	boolean isSameYear2(Date another){
		return this.year == another.getYear();
	}
	
	boolean isSameMonth2(Date another){
		return this.month == another.getMonth();
	}
	
	boolean isSameDay2(Date another){
		return this.day == another.getDay() ;
	}
	
	boolean isSame2 (Date another){
		return this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear();
	}
	
	
//imprime nombre del mes
	void nameMonth(){
		String nombre=null;
		switch(this.month){
		case 1:
			nombre="enero";
			break;
		case 2:
			nombre="febrero";
			break;
		case 3:
			nombre="marzo";
			break;
		case 4:
			nombre="abril";
			break;
		case 5:
			nombre="mayo";
			break;
		case 6:
			nombre="junio";
			break;
		case 7:
			nombre="julio";
			break;
		case 8:
			nombre="agosto";
			break;
		case 9:
			nombre="septiembre";
			break;
		case 10:
			nombre="octubre";
			break;
		case 11:
			nombre="noviembre";
			break;
		case 12:
			nombre="diciembre";
			break;
		}
		
		System.out.println(nombre);
	}
	
	
//dia del mes correcto
	
	boolean correctDay(){
		if(month==1 && month==3 && month==5 && month==7 && month==8 && month==10 &&month==12){
		if(this.day>0 && this.day<32) return true;
		}else if(month==2){
			if(this.day>0 && this.day<30) return true;
		}else{
			if(this.day>0 && this.day<31) return true;
		}
		return false;
	}
	
	boolean correctDay(Date another){
		int day = another.getDay();
		int month = another.getMonth();
		if(month==1 && month==3 && month==5 && month==7 && month==8 && month==10 &&month==12){
		if(day>0 && day<32) return true;
		}else if(month==2){
			if(day>0 && day<30) return true;
		}else{
			if(day>0 && day<31) return true;
		}
		return false;
	}
	
	
//estación del año
	void season(){
		if(month==1 || month==2 || month==3 && day<21 || month==12 && day>20) System.out.println("invierno");
		else if(month==4 || month==5 || month==6 && day<21 || month==3 && day>20) System.out.println("primavera");
		else if(month==7 || month==8 || month==9 && day<23 || month==6 && day>20) System.out.println("verano");
		else if(month==10 || month==11 || month==12 && day<21 || month==9 && day>22) System.out.println("otoño");
	}
	
//meses hasta fin de año
	
	void untilEndYear(Date another){
		System.out.println("Faltan "+ (12 - another.getMonth()) + " meses para fin de año.");
	}
	
//imprimir la fecha
	void print(){
		System.out.println(toString());
	}
	
	void print(Date another){
		System.out.println(another.toString());
	}
	
	
//fechas para el fin de mes
	
	void untilEndMonth(){
		for (int i = this.day+1; i < 32; i++) {
			Date fecha = new Date(i, month, year);
			if(fecha.correctDay()) System.out.println(fecha.toString());
		}
	}
	
	void untilEndMonth(Date another){
		int day = another.getDay();
		int month = another.getMonth();
		int year = another.getYear();
		for (int i = day+1; i < 32; i++) {
			Date fecha = new Date(i, month, year);
			if(fecha.correctDay()) System.out.println(fecha.toString());
		}
	}
	
//meses con mismo numero de dias
	
	
	void monthsWithSameDays(){
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("enero, marzo, mayo, julio, agosto, octubre, diciembre.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("abril, junio, septiempre, noviembre.");
			break;
		case 2:
			System.out.println("febrero");
			
		}
	}
	
	void monthsWithSameDays(Date another){
		int month = another.getMonth();
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("enero, marzo, mayo, julio, agosto, octubre, diciembre.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("abril, junio, septiempre, noviembre.");
			break;
		case 2:
			System.out.println("febrero");
			
		}
	}
	
	
//dias hasta el primer dia del año
	int fromFirstDay(){
		int mes = month;
		int dias = 0;
		
		if(mes>1) dias+=31;
		if(mes>2) dias+=28;
		if(mes>3) dias+=31;
		if(mes>4) dias+=30;
		if(mes>5) dias+=31;
		if(mes>6) dias+=30;
		if(mes>7) dias+=31;
		if(mes>8) dias+=31;
		if(mes>9) dias+=30;
		if(mes>10) dias+=31;
		if(mes>11) dias+=30;
		
		dias+=day;
		
		return(dias);
	}
	
	int fromFirstDay(Date another){
		int mes = another.getMonth();
		int day = another.getDay();
		int dias = 0;
		
		if(mes>1) dias+=31;
		if(mes>2) dias+=28;
		if(mes>3) dias+=31;
		if(mes>4) dias+=30;
		if(mes>5) dias+=31;
		if(mes>6) dias+=30;
		if(mes>7) dias+=31;
		if(mes>8) dias+=31;
		if(mes>9) dias+=30;
		if(mes>10) dias+=31;
		if(mes>11) dias+=30;
		
		dias+=day;
		
		return(dias);
	}
	
//numero de intentos
	
	// con while
	
	void attemptsWithDo(){
		
		boolean acierto = false;
		int contador=0;
		
		java.util.Random rand = new java.util.Random();
		
		do{
			int dia = rand.nextInt(31);
			int mes = rand.nextInt(12);
			
			if(dia==day && mes == month) acierto = true;
			
			contador++;
		}while(acierto==false);
		System.out.println(contador + " intentos.");
	}
	
	void attemptsWithDo(Date another){
		int day = another.getDay();
		int month= another.getMonth();
		
		boolean acierto = false;
		int contador=0;
		
		java.util.Random rand = new java.util.Random();
		
		do{
			int dia = rand.nextInt(31);
			int mes = rand.nextInt(12);
			
			if(dia==day && mes == month) acierto = true;
			
			contador++;
		}while(acierto==false);
		System.out.println(contador + " intentos.");
	}
	
	
	//con do-while

	void attempts(){
		
		boolean acierto = false;
		int contador=0;
		
		java.util.Random rand = new java.util.Random();
		
		while(acierto==false){
			int dia = rand.nextInt(31);
			int mes = rand.nextInt(12);
			
			if(dia==day && mes == month) acierto = true;
			
			contador++;
		}
		System.out.println(contador + " intentos.");
	}
	
	void attempts(Date another){
		int day = another.getDay();
		int month= another.getMonth();
		
		boolean acierto = false;
		int contador=0;
		
		java.util.Random rand = new java.util.Random();
		
		while(acierto==false){
			int dia = rand.nextInt(31);
			int mes = rand.nextInt(12);
			
			if(dia==day && mes == month) acierto = true;
			
			contador++;
		}
		System.out.println(contador + " intentos.");
	}
	
	
	
//dia de la semana sabiendo que dia de la semana fue el primer dia del año
	
	void dayOfWeek(int firstDay){
		int dias = fromFirstDay();
		int resto = (dias + firstDay-1) % 7;
		
		switch(resto){
		case 1: 
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3: 
			System.out.println("miercoles");
			break;
		case 4: 
			System.out.println("jueves");
			break;
		case 5: 
			System.out.println("viernes");
			break;
		case 6: 
			System.out.println("sabado");
			break;
		case 0: 
			System.out.println("domingo");
			break;
		
		}
	}
	
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
