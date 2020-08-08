class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean SubtractionFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }

    void info() {
        System.out.println("plate: " + food);
    }

    void setFood() {
        if (food < 0) {
            System.out.println(food + "Plate refill ");
            int food = +100;
        }
    }
}

