package it.uniroma3.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Quadro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
	private String titolo;
    
    @NotEmpty
	private int anno;
    
    @NotEmpty
	private String tecnica;
    @NotEmpty
    private String dimensioni;
    @NotEmpty
    @ManyToOne
	private Autore autore;
	
	
	protected Quadro() {	
	}
	
	public Quadro(String titolo, int anno,String tecnica,String dimensioni,Autore autore){
		this.titolo=titolo;
		this.anno=anno;
		this.tecnica=tecnica;
		this.dimensioni=dimensioni;
		this.autore=autore;
	}
	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public Autore getAutore() {
		return autore;
	}
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
}
