package ma.enova.rdv.workflow.demanderdv.save;

import ma.enova.rdv.ws.dto.*;
import ma.enova.rdv.zynerator.process.AbstractProcessInput;

public class DemandeRdvSaveInput extends AbstractProcessInput {

    private String reference;
    private String ipp;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String cin;
    private String codeRamed;
    private String observation;
    private String ficheReferencePath;
    private String dateDemandeRdv;
    private String datePrevu;
    private Integer nombreReccurenceTotal = 0;
    private Integer nombreReccurenceValide = 0;
    private Integer nombreReccurenceRejet = 0;

    private PatientDto patient;
    private OperateurDto operateur;
    private HopitalDto hopital;
    private UniteAdministrativeDto uniteAdministrative;
    private PrestationDto prestation;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getIpp() {
        return ipp;
    }

    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCodeRamed() {
        return codeRamed;
    }

    public void setCodeRamed(String codeRamed) {
        this.codeRamed = codeRamed;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getFicheReferencePath() {
        return ficheReferencePath;
    }

    public void setFicheReferencePath(String ficheReferencePath) {
        this.ficheReferencePath = ficheReferencePath;
    }

    public String getDateDemandeRdv() {
        return dateDemandeRdv;
    }

    public void setDateDemandeRdv(String dateDemandeRdv) {
        this.dateDemandeRdv = dateDemandeRdv;
    }

    public String getDatePrevu() {
        return datePrevu;
    }

    public void setDatePrevu(String datePrevu) {
        this.datePrevu = datePrevu;
    }

    public Integer getNombreReccurenceTotal() {
        return nombreReccurenceTotal;
    }

    public void setNombreReccurenceTotal(Integer nombreReccurenceTotal) {
        this.nombreReccurenceTotal = nombreReccurenceTotal;
    }

    public Integer getNombreReccurenceValide() {
        return nombreReccurenceValide;
    }

    public void setNombreReccurenceValide(Integer nombreReccurenceValide) {
        this.nombreReccurenceValide = nombreReccurenceValide;
    }

    public Integer getNombreReccurenceRejet() {
        return nombreReccurenceRejet;
    }

    public void setNombreReccurenceRejet(Integer nombreReccurenceRejet) {
        this.nombreReccurenceRejet = nombreReccurenceRejet;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public OperateurDto getOperateur() {
        return operateur;
    }

    public void setOperateur(OperateurDto operateur) {
        this.operateur = operateur;
    }

    public HopitalDto getHopital() {
        return hopital;
    }

    public void setHopital(HopitalDto hopital) {
        this.hopital = hopital;
    }

    public UniteAdministrativeDto getUniteAdministrative() {
        return uniteAdministrative;
    }

    public void setUniteAdministrative(UniteAdministrativeDto uniteAdministrative) {
        this.uniteAdministrative = uniteAdministrative;
    }

    public PrestationDto getPrestation() {
        return prestation;
    }

    public void setPrestation(PrestationDto prestation) {
        this.prestation = prestation;
    }

}
