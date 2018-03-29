public class Square {
    double mWidth;
    double mHight;

    // конструктор прямоугольника, использующий все размеры
    Square (double width, double hight) {
        mWidth = width;
        mHight = hight;
    }

    // конструктор для квадрата
    Square (double length) {
       mWidth = mHight = length;
    }

    // вычисляем и возвращаем площадь
    double square () {
        return mWidth * mHight;
    }

}
