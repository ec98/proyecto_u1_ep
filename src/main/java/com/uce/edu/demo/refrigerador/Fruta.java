package com.uce.edu.demo.refrigerador;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Fruta {

	private LocalDateTime fechaCreada;

	@Autowired // Inyectando atributo
	private Manzana manzana;
	@Autowired // Inyectando atributo
	private Pera pera;

	@Override
	public String toString() {
		return "Fruta [fechaCreada=" + fechaCreada + ", manzana=" + manzana + ", pera=" + pera + "]";
	}

	public String entrega(LocalDateTime fechaCreada, String tamanioManzana, float pesoManzana, String colorManzana,
			float pesoPera, String colorPera) {

		this.manzana.setTamanio(tamanioManzana);
		this.manzana.setPeso(pesoManzana);
		this.manzana.setColor(colorManzana);

		this.pera.setPeso(pesoPera);
		this.pera.setColor(colorPera);

		// creando fecha de caducidad
		this.fechaCreada = fechaCreada;

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

	public void setManzana(Manzana manzana) {
		this.manzana = manzana;
	}

	public Pera getPera() {
		return pera;
	}

	public void setPera(Pera pera) {
		this.pera = pera;
	}

}
