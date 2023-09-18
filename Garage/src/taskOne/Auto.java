package taskOne;

public class Auto {

        private String firm; //название фирмы автомобиля
        private int maxSpeed;//максимальная скорость автомобиля
    private String stateNumber;

        //метод класса для задания значения фирмы автомобиля
        public void setFirm(String firma) {
            firm = firma;
        }

        //метод класса для задания значения максимальной скорости автомобиля
        public void setMaxSpeed(int speed) {
            maxSpeed = speed;
        }
        public void setStateNumber(String numbers){
            stateNumber = numbers;
    }
    public String getStateNumber(){
            return stateNumber;
    }

        //метод класса для вывода значения максимальной скорости
        public int getMaxSpeed() {
            return maxSpeed;
        }

        //метод класса для вывода значения заданной фирмы
        public String getFirm()	{
            return firm;
        }

        //конструктор класса (без параметров)
        public Auto() {
            firm = "Без названия";
            maxSpeed = 0;
            stateNumber = "Без названия";
        }

        //конструктор класса (с параметрами)
        public Auto(String firma, int speed, String number) {
            firm = firma;
            maxSpeed = speed;
            stateNumber = number;
        }
    }



