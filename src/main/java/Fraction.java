class Fraction {
    int num, den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}