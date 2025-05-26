//* Jackie W */
//* J.kalisz */
class Rectangle {
    
    private double length;
    private double width;
    //* intalizes variables */
    //* @param width, width of the shape */
    //* @param length, length of the shape */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        

    }
//* my rectangle with a width of 4.0 and length of 8.0 */
    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }
//* now the length is a variable */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8.0;
    }

//* @return give back length  */
//* @return give back width */
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}