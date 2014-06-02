/**
 * 
 */
package br.com.redhorse.moussecake.database;

import java.util.ArrayList;
import java.util.List;

import br.com.redhorse.moussecake.entities.Categorias;
import br.com.redhorse.moussecake.entities.Item;

/**
 * @author andreluizvannucci
 *
 */
public class ItensDataBase {

	public static List<Item> bebidas()
	{
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("Suco de Laranja", "Suco natural", 4.5));
		list.add(new Item("Suco de Morango", "Suco natural com água", 4.5));
		list.add(new Item("Suco de Abacaxi com Hortelã", "Suco natural com água", 4.5));
		list.add(new Item("Coca Cola", "Refri em lata", 4));
		list.add(new Item("Fanta Uva", "Refri em lata", 2));
		list.add(new Item("Sprite", "Refri em lata", 2));
		list.add(new Item("Itubaina", "Refri em garrafa de 60 0ml", 1.5));
		list.add(new Item("Água", "Bebida Natural da fonte da sanasa", 0.5));		
		return list;
	}

	public static List<Item> bolos()
	{
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("Bolo de Laranja", "Bolo com Laranja e creme de baunilha", 4.5));
		list.add(new Item("Torta de Morango", "Torta com cobertura de chocolate", 4.5));
		list.add(new Item("Bolo de Abacaxi", "Bolo de abacaxi com hortelã", 4.5));
		list.add(new Item("Bolo de Cenoura", "Bolo com cobertura de chocolate", 4));
		list.add(new Item("Cupcake de Morango", "Com pedaços de morango", 2));
		list.add(new Item("Cupcake de Banana", "Com cobertura de chocolate", 2));	
		return list;
	}

	public static List<Item> saladas()
	{
		//saladas
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("Folhas Verdes", "Alface, rúcula e lascas de manga", 18.90));
		list.add(new Item("Rúcula", "Rúcula, molho de mel e lascas de parmessão", 18.90));
		list.add(new Item("Caesar", "Alface, molho cheese, cubos de bacon e crótons", 19.50));
		list.add(new Item("Palmito e Maasdam", "Alface, Rúcula, tomate, queijo maasdam e palmito", 23.50));	
		return list;
	}

	public static List<Item> crepe () 
	{
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Alcachofra", "champignon, queijo maasdam e azeitona preta", 36.90)); 
		list.add(new Item("Alho Poró", "palmito, creme de queijo e queijo prato", 31.90));
		list.add(new Item("Búfala", "tomate fresco e manjeiricão", 31.90)); 
		list.add(new Item("Frango", "frango, queijo prato, requeijão, tomate, salsa e orégano", 31.90)); list.add(new Item("Palmito", "palmito, aspargo fresco, queijo gouda e requeijão", 31.90)); return list;
	}

	public static List<Item> massas () 
	{ 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Fettucine ao Funghi", "molho branco, funghi, salsa e rosbife", 39.90)); 
		list.add(new Item("Rondeli de Presunto e Queijo", "Molhos de tomate fresco e manjericão, quatro queijos, ao sugo e branco", 38.90));
		list.add(new Item("Fettucine com Camarão", "camarão ao molho de tomate fresco e manjericão", 48.90)); 
		list.add(new Item("Fettucine com Salmão", " salmão, mostarda, mel, brie e ervas ", 31.90)); list.add(new Item("Fettuccine Italiana", "alcachofra, shitake, champignon, azeite e parmesão", 31.90)); return list;
	}

	public static List<Item> sanduiche () 
	{ 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Búfala", "tomate seco ou fresco, rucula e cream cheese", 22.50)); 
		list.add(new Item("Carne e Queijo", "file mignon, queijo prato e tomate", 27.50));
		list.add(new Item("Misto Quente", "queijo prato, presunto e tomate", 18.50)); 
		list.add(new Item("Rosbife", "queijo maasdam, rucula e tomate ", 22.50)); 
		return list;
	}

	public static List<Item> beirute () 
	{ 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Frango", "queijo prato, catupiry, alface, tomate e salsa", 27.90)); 
		list.add(new Item("Presunto e Queijo", "presunto, queijo prato, alface e tomate", 27.90));
		list.add(new Item("File Mignon", "catupiry, tomate, queijo prato e alface", 33.50)); 
		list.add(new Item("Rosbife", "queijo prato, alface e tomate ", 27.90)); 
		return list;
	}

	public static List<Item> carnes () { 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("File Shimeji", "acompanha shitake com pure de mandioquinha e arroz negro", 56.90)); 
		list.add(new Item("File Grelhado", "acompanha risoto de limão siciliano com macadâmia", 51.90));
		list.add(new Item("File Grelhado com Fettuccine", "acompanhado ao molho de shitake", 51.90)); 
		list.add(new Item("File de Cordeiro", "acompanhado ao molho de hortelã e pure de mandioquinha ", 69.50)); 
		return list;
	}

	public static List<Item> aves () { 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("File de Frango", "acompanhado ao molho de frutas vermelhas e risoto de queijo brie e aspargo fresco", 49.90)); 
		list.add(new Item("Confit de pato", "acompanha pure de mandioquinha e arroz negro na manteiga com cebolinha", 72.00));
		return list;
	}

	public static List<Item> frutosDoMar () { 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Abadejo", "acompanhado com crosta de pistache e risoto de damasco com queijo brie", 57.90)); 
		list.add(new Item("Lombo de bacalhau", "acompanha risoto de limão", 86.90));
		list.add(new Item("Camarão alho e oleo", "acompanha risoto de queijo brie e aspargo fresco", 87.00));
		return list;
	}
	public static List<Item> doces () { 
		List<Item> list = new ArrayList<Item>(); 
		list.add(new Item("Brownie", "bolo de chocolate com nozes, sorvete de creme e calda de chocolate quente", 29.90)); 
		list.add(new Item("Waffe", "Sabores: frutas vermelhas, doce de leite, brigadeiro e morango. Acompanha sorvete de creme e calda de chocolate quente", 23.90));
		list.add(new Item("Petit Gateau", "mini bolo com recheio cremoso, com sorvete de creme e calda de chocolate", 22.90));
		list.add(new Item("Taça", "Sabores: Mousse Cake I , Mousse Cake II, Brownie e Doce de Leite. Acompanha trufa, morango, chantilly ou banana e calda de chocolate", 26.90));
		return list; 
	}
	
	public static List<Categorias> categorias()
	{
		List<Categorias> list = new ArrayList<Categorias>();
		Categorias bebidas = new Categorias("Bebidas", bebidas());
		Categorias bolos = new Categorias("Bolos", bolos());
		Categorias saladas = new Categorias("Saladas", saladas());
		Categorias crepes = new Categorias("Crepes", crepe());
		Categorias massas = new Categorias("Massas", massas());
		Categorias sanduiche = new Categorias("Sanduiche", sanduiche());
		Categorias beirute = new Categorias("Beirute", beirute());
		Categorias carnes = new Categorias("Carnes", carnes());
		Categorias aves = new Categorias("Aves", aves());
		Categorias frutosDoMar = new Categorias("Frutos do Mar", frutosDoMar());
		Categorias doces = new Categorias("Doces", doces());
		
		list.add(aves);
		list.add(bebidas);
		list.add(beirute);
		list.add(bolos);
		list.add(carnes);
		list.add(crepes);
		list.add(doces);
		list.add(massas);
		list.add(frutosDoMar);
		list.add(saladas);
		list.add(sanduiche);
		
		return list;
	}

}
