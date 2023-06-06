package pl.psi;

import lombok.Value;

@Value
public class Point {

    private final int x;
    private final int y;

    public Point(int aX, int aY) {
        this.x = aX;
        this.y = aY;
    }

    public double distance( Point aPoint )
    {
        return distance( aPoint.getX(), aPoint.getY() );
    }

    public double distance( double px, double py )
    {
        px -= getX();
        py -= getY();
        return Math.sqrt( px * px + py * py );
    }

}
