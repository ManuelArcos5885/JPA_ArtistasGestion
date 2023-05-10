package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the artista database table.
 * 
 */
@Entity
@NamedQuery(name="Artista.findAll", query="SELECT a FROM Artista a")
public class Artista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String nombre;

	//bi-directional many-to-one association to Disciplina
	@ManyToOne
	@JoinColumn(name="idDisciplina")
	private Disciplina disciplina;

	//bi-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="idMunicipio")
	private Municipio municipio;

	public Artista() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	

}