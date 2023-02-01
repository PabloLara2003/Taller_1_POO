package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;


public class Modificacion 
{
	public static  void saludo(String args[])
	{
		System.out.println("Hola mundo!");

	}
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	
	}
}

	