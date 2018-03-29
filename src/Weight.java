class Weight extends Volume {

    double mDensity;

    // конструктор параллелепипеда
    Weight(double width, double hight, double depth, double density) {
        super(width, hight, depth);
        mDensity = density;
    }

    // конструктор куба
    Weight(double length, double density) {
        super(length);
        mDensity = density;
    }

    // вычисляем и возвращаем массу
    double weight () {
        return super.volume() * mDensity;
    }
}
