class Factorielle {

    static Scanner scanner = new Scanner(System.in)

    static Integer factorielle(Integer n) {
        if (n == 0 || n == 1) {
            return 1
        }
        int f = n * factorielle(n - 1)
        return f
    }

    static void main(String[] args) {
        print "entrez un nombre positif: "
        int nb = scanner.nextInt()
        print factorielle(nb)
    }
}
