package ma.enova.rdv.workflow.demanderdv.save;

import ma.enova.rdv.ws.dto.*;

public class DemandeRdvSaveOutput {

    private String reference  ;
    private String ipp  ;
    private String nom  ;
    private String prenom  ;
    private String adresse  ;
    private String email  ;
    private String cin  ;
    private String codeRamed  ;
    private String observation  ;
    private String ficheReferencePath  ;
    private String dateDemandeRdv ;
    private String datePrevu ;
    private String dateEffective ;
    private String dateValidation ;
    private String dateRejet ;
    private Integer nombreReccurenceTotal  = 0 ;
    private Integer nombreReccurenceValide  = 0 ;
    private Integer nombreReccurenceRejet  = 0 ;

    private PatientDto patient ;
    private OperateurDto operateur ;
    private HopitalDto hopital ;
    private UniteAdministrativeDto uniteAdministrative ;
    private PrestationDto prestation ;
    private StatusRdvDto statusRdv ;
    private TemplateEmailConfirmationDto templateEmailConfirmation ;

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

    public String getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(String dateEffective) {
        this.dateEffective = dateEffective;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getDateRejet() {
        return dateRejet;
    }

    public void setDateRejet(String dateRejet) {
        this.dateRejet = dateRejet;
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

    public StatusRdvDto getStatusRdv() {
        return statusRdv;
    }

    public void setStatusRdv(StatusRdvDto statusRdv) {
        this.statusRdv = statusRdv;
    }

    public TemplateEmailConfirmationDto getTemplateEmailConfirmation() {
        return templateEmailConfirmation;
    }

    public void setTemplateEmailConfirmation(TemplateEmailConfirmationDto templateEmailConfirmation) {
        this.templateEmailConfirmation = templateEmailConfirmation;
    }
}
