import java.awt.Color

class CarreColore extends Carre implements Coloriable{

    Color color

    CarreColore(cote) {
        super(cote)
    }

    CarreColore(nom,cote){
        super(cote)
        this.nom = "Carré Coloré"
    }

    CarreColore(){
        this("Carre sans couleur", 0)
    }

    @Override
    void applyColor(Color c) {
        this.color = c
    }
}
