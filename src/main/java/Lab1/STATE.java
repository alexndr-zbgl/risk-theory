package Lab1;

public enum STATE {

    VERY_GOOD(10),
    GOOD(8),
    OK(5),
    BAD(2),
    VERY_BAD(1);

    public int number;

    STATE(int number){
        this.number = number;
    }

}
