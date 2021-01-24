class Agent {

    private String matricule
    private String fname
    private String lname
    private def dateNaissance
    private InfoBancaires infoBancaires;

    Agent() {
    }

    Agent(matricule, fname, lname) {
        this.matricule = matricule
        this.fname = fname
        this.lname = lname
        dateNaissance = new Date()
    }

    InfoBancaires getInfoBancaires() {
        return infoBancaires
    }

    void setInfoBancaires(InfoBancaires infoBancaires) {
        this.infoBancaires = infoBancaires
    }

    String getMatricule() {
        return matricule
    }

    void setMatricule(String matricule) {
        this.matricule = matricule
    }

    String getFname() {
        return fname
    }

    void setFname(String fname) {
        this.fname = fname
    }

    String getLname() {
        return lname
    }

    void setLname(String lname) {
        this.lname = lname
    }

    def getDateNaissance() {
        return dateNaissance
    }

    void setDateNaissance(dateNaissance) {
        this.dateNaissance = dateNaissance
    }

    @Override
    String toString() {
        return "$fname $lname"
    }

    static class InfoBancaires {

        Long numCompte
        String nomBanque
        String swift

        InfoBancaires() {

        }

        InfoBancaires(Integer numCompte, String nomBanque, String swift) {
            this.numCompte = numCompte
            this.nomBanque = nomBanque
            this.swift = swift
        }

        Integer getNumCompte() {
            return numCompte
        }

        void setNumCompte(Integer numCompte) {
            this.numCompte = numCompte
        }

        String getNomBanque() {
            return nomBanque
        }

        void setNomBanque(String nomBanque) {
            this.nomBanque = nomBanque
        }

        String getSwift() {
            return swift
        }

        void setSwift(String swift) {
            this.swift = swift
        }

        @Override
        String toString() {
            return "$numCompte @ $nomBanque"
        }
    }

    static void main(String[] args) {
        def ronny = new Agent()
        ronny.fname = "Ronny"
        ronny.lname = "Sankinka"

        def infosBank = new InfoBancaires()
        infosBank.nomBanque = "Equity Bank"
        infosBank.numCompte = 332.4
        ronny.infoBancaires = infosBank

        println ronny
        println ronny.infoBancaires

    }
}