
public class Square {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object object) {
        Square other = (Square) object;
        return (other.side) == this.side;
    }


}
