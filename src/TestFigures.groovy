import java.awt.Color

class TestFigures {

    static void main(String[] args) {
        def monJoliCarre = new CarreColore(cote: 45, nom: "dezfzef")
        // print monJoliCarre.calculPerimetre()

        def Scanner scanner = new Scanner(System.in)

        print "Entrez le coté du carré: "
        def cote = scanner.nextFloat()
        monJoliCarre.setCote(cote)
        // print monJoliCarre.calculSurface()

        monJoliCarre.applyColor(Color.BLUE)

        println monJoliCarre.color

        switch (monJoliCarre.color) {
            case Color.BLUE:
                print "Bleu"
                break
        }
    }

}
