class Carre extends FigureGeo {

    private float cote

    Carre() {
    }

    Carre(cote) {
        this.cote = cote
        nom = "Carré"
    }

    @Override
    float calculSurface() {
        return cote**2
    }

    @Override
    float calculPerimetre() {
        return cote * 4
    }

    float getCote() {
        return cote
    }

    void setCote(float cote) {
        this.cote = cote
    }
}
