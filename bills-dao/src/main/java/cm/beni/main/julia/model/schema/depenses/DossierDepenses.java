package cm.beni.main.julia.model.schema.depenses;
// Generated 2 ao�t 2020 02:33:38 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import cm.beni.main.julia.dao.controller.ObjectIdResolver;
import cm.beni.main.julia.model.schema.dossiers.Dossier;
import cm.beni.main.julia.model.schema.factures.RubriquesFacture;

/**
 * DossierDepenses generated by hbm2java
 */
@Entity
@Table(name = "dossier_depenses", schema = "depenses")
//@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@dossierDepenses", scope = DossierDepenses.class, resolver = ObjectIdResolver.class)
@JsonIdentityInfo(generator=JSOGGenerator.class, resolver = ObjectIdResolver.class)
public class DossierDepenses implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identify;
	private Depense depense;
	private Dossier dossier;
	private Date date;
	private String libelle;
	private double montant;
	private boolean debour;
	private String destinataire;
	private Set<RubriquesFacture> rubriquesFactures = new HashSet<RubriquesFacture>(0);

	public DossierDepenses() {
	}

	public DossierDepenses(String identify, Depense depense, Dossier dossier, Date date, String libelle, double montant,
			boolean debour) {
		this.identify = identify;
		this.depense = depense;
		this.dossier = dossier;
		this.date = date;
		this.libelle = libelle;
		this.montant = montant;
		this.debour = debour;
	}

	public DossierDepenses(String identify, Depense depense, Dossier dossier, Date date, String libelle, double montant,
			boolean debour, String destinataire, Set<RubriquesFacture> rubriquesFactures) {
		this.identify = identify;
		this.depense = depense;
		this.dossier = dossier;
		this.date = date;
		this.libelle = libelle;
		this.montant = montant;
		this.debour = debour;
		this.destinataire = destinataire;
		this.rubriquesFactures = rubriquesFactures;
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
	@JoinColumn(name = "depense", nullable = false)
	public Depense getDepense() {
		return this.depense;
	}

	public void setDepense(Depense depense) {
		this.depense = depense;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dossier", nullable = false)
	public Dossier getDossier() {
		return this.dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "[date]", nullable = false, length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	@Column(name = "debour", nullable = false)
	public boolean isDebour() {
		return this.debour;
	}

	public void setDebour(boolean debour) {
		this.debour = debour;
	}

	@Column(name = "destinataire", length = 64)
	public String getDestinataire() {
		return this.destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dossierDepense")
	public Set<RubriquesFacture> getRubriquesFactures() {
		return this.rubriquesFactures;
	}

	public void setRubriquesFactures(Set<RubriquesFacture> rubriquesFactures) {
		this.rubriquesFactures = rubriquesFactures;
	}
}
