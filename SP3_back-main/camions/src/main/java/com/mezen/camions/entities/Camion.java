package com.mezen.camions.entities;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity 
public class Camion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcamion;
	private String nomcamion;
	private Double prixcamion;
	private String description;
	@ManyToOne
	private Marque marque;
	 
	 
	 @OneToMany (mappedBy = "camion")
	 private List<Image> images;
	 
	 private String imagePath;

	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Camion() {
		super();
		}
		public Camion(String nomcamion, Double prixcamion,String description) {
		super();
		this.nomcamion = nomcamion;
		this.prixcamion = prixcamion;
		this.description = description;
		}
		public Long getidcamion() {
			return idcamion;
			}
			public void setidcamion(Long idcamion) {
			this.idcamion = idcamion;
			}
			public String getnomcamion() {
			return nomcamion;
			}
			public void setnomcamion(String nomcamion) {
			this.nomcamion = nomcamion;
			}
			public Double getprixcamion() {
			return prixcamion;
			}
			public void setprixcamion(Double prixcamion) {
			this.prixcamion = prixcamion;
			}
			public String getdescription() {
			return description;
			}
			public void setdescription(String description) {
			this.description = description;
			}
			public Marque getmarque() {
				return marque;
				}
				public void setmarque(Marque marque) {
				this.marque = marque;
				}
			

		

			public List<Image> getImages() {
					return images;
				}
				public void setImages(List<Image> images) {
					this.images = images;
				}
			@Override
			public String toString() {
			return "camion [idcamion=" + idcamion + ", nomcamion=" +
			nomcamion + ", prixcamion=" + prixcamion
			+ ", description=" + description + "]";
			}





}
