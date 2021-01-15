package cm.beni.main.julia.model.schema.factures;
// Generated 2 ao�t 2020 02:36:36 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import cm.beni.main.julia.dao.controller.ObjectIdResolver;
import cm.beni.main.julia.model.schema.depenses.DossierDepenses;

/**
 * RubriquesFacture generated by hbm2java
 */
@Entity
@Table(name = "rubriques_facture", schema = "factures")
//@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@rubriquesFacture", scope = RubriquesFacture.class, resolver = ObjectIdResolver.class)
@JsonIdentityInfo(generator=JSOGGenerator.class, resolver = ObjectIdResolver.class)
public class RubriquesFacture implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identify;
	private Facture facture;
	private String libelle;
	private double montant;
	private boolean taxable;
	private Rubrique rubrique;
	private DossierDepenses dossierDepense;
	private Double unite;
	private String referenceUnite;
	private Double taux;
	private String referenceTaux;

	public RubriquesFacture(String identify, Facture facture, String libelle, double montant, boolean taxable) {
		this.identify = identify;
		this.facture = facture;
		this.libelle = libelle;
		this.montant = montant;
		this.taxable = taxable;
	}

	public RubriquesFacture(String identify, Facture facture, String libelle, double montant, boolean taxable,
			Rubrique rubrique, DossierDepenses dossierDepense, Double unite, String referenceUnite, Double taux,
			String referenceTaux) {
		this.identify = identify;
		this.facture = facture;
		this.libelle = libelle;
		this.montant = montant;
		this.taxable = taxable;
		this.rubrique = rubrique;
		this.dossierDepense = dossierDepense;
		this.unite = unite;
		this.referenceUnite = referenceUnite;
		this.taux = taux;
		this.referenceTaux = referenceTaux;
	}

	@Id

	@Column(name = "identify", unique = true, nullable = false, length = 64)
	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "facture", nullable = false)
	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	@Column(name = "libelle", nullable = false, length = 200)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "montant", nullable = false, scale = 0)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Column(name = "taxable", nullable = false)
	public boolean isTaxable() {
		return this.taxable;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dossier_depense")
	public DossierDepenses getDossierDepense() {
		return this.dossierDepense;
	}

	public void setDossierDepense(DossierDepenses dossierDepense) {
		this.dossierDepense = dossierDepense;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rubrique")
	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

	@Column(name = "unite", precision = 17, scale = 17)
	public Double getUnite() {
		return this.unite;
	}

	public void setUnite(Double unite) {
		this.unite = unite;
	}

	@Column(name = "reference_unite", length = 200)
	public String getReferenceUnite() {
		return referenceUnite;
	}

	public void setReferenceUnite(String referenceUnite) {
		this.referenceUnite = referenceUnite;
	}

	@Column(name = "taux", precision = 17, scale = 17)
	public Double getTaux() {
		return this.taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	@Column(name = "reference_taux", length = 200)
	public String getReferenceTaux() {
		return referenceTaux;
	}

	public void setReferenceTaux(String referenceTaux) {
		this.referenceTaux = referenceTaux;
	}
}
