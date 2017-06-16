package it.uniroma3.spring.model;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "AUTORE")
public class Autore {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String cognome;
    
    @NotEmpty
    private String nazionalita;
    
    @NotEmpty
    private String dataDiNascita;
    
    
    private String dataDiMorte;

	protected Autore() {
		
	}
	
	public Autore(String nome,String cognome,String nazionalita,String dataDiNascita,String dataDiMorte){
		this.nome=nome;
		this.cognome=cognome;
		this.nazionalita=nazionalita;
		this.dataDiNascita=dataDiNascita;
		this.dataDiMorte=dataDiMorte;
	}
	public Autore(String nome,String cognome,String nazionalita,String dataDiNascita){
		this.nome=nome;
		this.cognome=cognome;
		this.nazionalita=nazionalita;
		this.dataDiNascita=dataDiNascita;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getDataDiMorte() {
		return dataDiMorte;
	}

	public void setDataDiMorte(String dataDiMorte) {
		this.dataDiMorte = dataDiMorte;
	}


}



