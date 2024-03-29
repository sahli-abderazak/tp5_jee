package metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILMS")
public class Film implements Serializable{
	@Id
	@Column (name="ID_FILMS")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idFilm;
	
	@Column (name="NOM_FILMS")
	private String nomFilm;
	
	@Column (name="RATE_FILMS")
	private float rateFilm;
	
	@Column (name="GENRE")
	private String genreFilm;
	
	public Film() {
		super();
	}
	public Film(String nomFilm,float rateFilm,String genreFilm) {
		super();
		this.nomFilm=nomFilm;
		this.rateFilm=rateFilm;
		this.genreFilm=genreFilm;
		
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public float getRateFilm() {
		return rateFilm;
	}
	public void setRateFilm(float rateFilm) {
		this.rateFilm = rateFilm;
	}
	public String getGenreFilm() {
		return genreFilm;
	}
	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", rateFilm=" + rateFilm + ", genreFilm=" + genreFilm
				+ "]";
	}
	
	
}