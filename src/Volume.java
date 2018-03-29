class Volume extends Square {

    double mDepth;

    // конструктор параллелепипеда
    Volume (double width, double hight, double depth) {
        super(width, hight);
        mDepth = depth;
    }

    // конструктор куба
    Volume (double length) {
        super(length);
        mDepth = length;
    }

    // вычисляем и возвращаем объем
    double volume () {
        return super.square() * mDepth;
    }
}
