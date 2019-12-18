package calculadora;
import java.util.Scanner;


public class Calculadora {
	
	Scanner scan = new Scanner(System.in);
	int n_Quantidades=0;
	
	
	//metodo somar
	public double somar()
	{
		double somaTotal=0;
		
		
		//quantos números deseja somar
		System.out.println("Deseja realizar quantas somas subsequentes?");
		this.n_Quantidades=scan.nextInt();
		
		//vetor que armazenará os números escolhidos
		double numeros_Somar[]= new double[n_Quantidades];
		
		for(int i=0;i<numeros_Somar.length;i++)
		{
			System.out.println("O "+ (i+1)+" º número:");
			numeros_Somar[i]=scan.nextDouble();
		}
		for(int j=0;j<numeros_Somar.length;j++)
		{
			
			somaTotal+=numeros_Somar[j];
		}
		
		return somaTotal;
	}
	
	//metodo subtrair
	public double subtrair()
	{
		double subTotal=0;
		
		System.out.println("Deseja realizar quantas subtrações subsequentes?");
		this.n_Quantidades=scan.nextInt();
		
		//vetor que armazenará os números escolhidos
		double numeros_Sub[]= new double[n_Quantidades];
		
		for(int i=0;i<numeros_Sub.length;i++)
		{
			System.out.println("O "+ (i+1)+" º número:");
			numeros_Sub[i]=scan.nextDouble();
		}
		for(int j=0;j<numeros_Sub.length-1;j++)
		{
			subTotal=numeros_Sub[j];
			subTotal=subTotal-numeros_Sub[j+1];
		}
		return subTotal;
		
	}
	//metodo multiplicação
	public double multiplicar()
	{
		double multTotal=1;
		
		System.out.println("Deseja realizar quantas multiplicações subsequentes?");
		this.n_Quantidades=scan.nextInt();
		
		//vetor que armazenará os números escolhidos
		double numeros_Mult[]= new double[n_Quantidades];
		
		for(int i=0;i<numeros_Mult.length;i++)
		{
			System.out.println("O "+ (i+1)+" º número:");
			numeros_Mult[i]=scan.nextDouble();
		}
		for(int j=0;j<numeros_Mult.length;j++)
		{
			
			multTotal*=numeros_Mult[j];
		}
		return multTotal;
		
	}
	//metodo divisao
	public double dividir()
	{
		double divTotal=0;
		
		System.out.println("Deseja realizar quantas divisões subsequentes?");
		this.n_Quantidades=scan.nextInt();
		
		//vetor que armazenará os números escolhidos
		double numeros_Div[]= new double[n_Quantidades];
		
		for(int i=0;i<numeros_Div.length;i++)
		{
			System.out.println("O "+ (i+1)+" º número:");
			numeros_Div[i]=scan.nextDouble();
			
		}
		for(int j=0;j<numeros_Div.length;j++)
		{
			divTotal=numeros_Div[0+j];
			divTotal/=numeros_Div[j];
		}
		return divTotal;
	}
	//metodo de fatorial
	public double fatorando()
	{
		double fatTotal=1;
		double numeroFatorial;
		System.out.println("Deseja descobrir o fatorial de qual número?");
		numeroFatorial=scan.nextDouble();
		
		
		
		for(int i=1;i<=numeroFatorial;i++)
		{
			fatTotal*=i;
		}
		
		return fatTotal;		
	}
	

	public static void main(String[] args) {
			
		String escolha;
		
		Calculadora calc = new Calculadora();
		
		Scanner scan = new Scanner(System.in);
        
		while(true) {
        System.out.println("SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO, DIVISÃO, FATORIAL///// DIGITE 'SAIR' para finalizar o programa");
        escolha=scan.next();
        
        
        if(escolha.equalsIgnoreCase("SOMA"))
        {
        	System.out.println("Total= "+ calc.somar());
        }
        else if(escolha.equalsIgnoreCase("SUBTRAÇÃO"))
        {
        	System.out.println(calc.subtrair());
        }
        
        else if(escolha.equalsIgnoreCase("MULTIPLICAÇÃO"))
        {
        	System.out.println(calc.multiplicar());
        }
        else if(escolha.equalsIgnoreCase("DIVISÃO"))
        {
        	System.out.println(calc.dividir());
        }
        else if(escolha.equalsIgnoreCase("FATORIAL"))
        {
        	System.out.println(calc.fatorando());
        }
        else if(escolha.equalsIgnoreCase("SAIR"))
        {
        	break;
        }
        else
        {
        	System.out.println("OPÇÃO INVÁLIDA");
        }
             						
		}
		System.out.println("PROGRAMA FINALIZADO!!");
	}

	

}
