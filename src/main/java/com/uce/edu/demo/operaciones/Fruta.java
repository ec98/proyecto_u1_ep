package com.uce.edu.demo.operaciones;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // tomando el control de un estereotipo Service
public class Fruta {

	private LocalDateTime fechaCreada;

//	// 1) Inyectando atributo con Autowired
//	@Autowired // Inyectando atributo
//	private Manzana manzana;
//	@Autowired // Inyectando atributo
//	private Pera pera;

//	// 2) Realizando DI por constructor
//	private Manzana manzana;
//	private Pera pera;
//
//	public Fruta(Manzana manzana, Pera pera) {
//		this.manzana = manzana;
//		this.pera = pera;
//	}

	// 3) Realizando DI por METODOS SET
	private Manzana manzana;
	private Pera pera;

	public String entrega(LocalDateTime fechaCreada, String tamanioManzana, float pesoManzana, String colorManzana,
			float pesoPera, String colorPera) {

		this.manzana.setTamanio(tamanioManzana);
		this.manzana.setPeso(pesoManzana);
		this.manzana.setColor(colorManzana);

		this.pera.setPeso(pesoPera);
		this.pera.setColor(colorPera);

		// creando fecha de caducidad
		this.fechaCreada = fechaCreada;

//		// 1) Ejemplo 1 DI con atributos
//		float Total = (float) (Math.round((pesoManzana * 0.15 + pesoPera * 0.15)));
//		System.out.println("	****FACTURA****\n" + "" + "Manzana	 -> " + pesoManzana + "\nPera	 -> " + pesoPera
//				+ "\nIVA	 -> 15%" + "\nTotal a pagar	 -> " + Total);

		// 2) Ejemplo 2 DI con constructor
//		float aumentoPesoModificado = 3;
//
//		if (aumentoPesoModificado < pesoManzana) {
//			aumentoPesoModificado = 10 * pesoManzana;
//			System.out.println("Se ha aumentado el numero de peso en Manzana " + aumentoPesoModificado);
//		} else {
//			aumentoPesoModificado = 15 * pesoPera;
//			System.out.println("Se ha aumentado el numero de peso en Pera " + aumentoPesoModificado);
//		}

		// 3 Ejemplo 3 DI con metodosSET
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				System.out.println("Obteniendo cantidad aleatoria [" + i + "]" + "en Manzana -> "
						+ (int) (Math.random() * 52 - 1));
			} else if (i > 5) {
				System.out.println(
						"Obteniendo cantidad aleatoria [" + i + "]" + "en Pera -> " + (int) (Math.random() * 25 - 1));

			}
		}

		// Insertando base de datos
		return "Frutas agregadas al canasto";
	}

	// GETTERS AND SETTERS
	public LocalDateTime getFechaCreada() {
		return fechaCreada;
	}

	public void setFechaCreada(LocalDateTime fechaCreada) {
		this.fechaCreada = fechaCreada;
	}

	public Manzana getManzana() {
		return manzana;
	}

	@Autowired // inyectando atributo metodo SET
	public void setManzana(Manzana manzana) {
		this.manzana = manzana;
	}

	public Pera getPera() {
		return pera;
	}

	@Autowired // inyectando atributo metodo SET
	public void setPera(Pera pera) {
		this.pera = pera;
	}

}
