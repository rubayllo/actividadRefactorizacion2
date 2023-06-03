package extractClass;

import java.util.Date;

/*
 * En la clase ClienteRedactor
 * 
 * Selecciono el nombre de la clase "ClienteRefactor" y con el botón derecho
 * del ratón selecciono "Refactor" -> "Extract Class" allí elijo los atributos 
 * que utilizaré en la nueva clase y a la clase nueva le doy el nombre
 * "TarjetaCredito", creando getters y setters. Acepto y realizo el test.
 */

public class TarjetaCredito {
	private String tarjetaCredito;
	private Date fechaTarjetaCredito;
	private int numeroControTarjetaCredito;

	public TarjetaCredito() {
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public Date getFechaTarjetaCredito() {
		return fechaTarjetaCredito;
	}

	public void setFechaTarjetaCredito(Date fechaTarjetaCredito) {
		this.fechaTarjetaCredito = fechaTarjetaCredito;
	}

	public int getNumeroControTarjetaCredito() {
		return numeroControTarjetaCredito;
	}

	public void setNumeroControTarjetaCredito(int numeroControTarjetaCredito) {
		this.numeroControTarjetaCredito = numeroControTarjetaCredito;
	}
}