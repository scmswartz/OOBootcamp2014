public class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int width, int height) {
        if(width < 0 || height < 0)
        {
            throw new IllegalArgumentException();
        }
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object object) {
        Rectangle other = (Rectangle) object;
        return (other.height) == this.height && (other.width) == this.width;
    }

    public int area() {
        return this.width*this.height;
    }

    public int perimeter() {
        return 2*(this.width+this.height);
    }

    public Rectangle makeSquare(int side)
    {
        return new Rectangle(side,side);
    }
    //type checking
    public boolean isSquare()
    {
        return this.height == this.width;
    }

}
