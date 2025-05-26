//* Jackie W */
//* J kalisz */
//*Chair */
public class Chair {
    private int legs;
    private String material;
//* Intializes values */
//* @param legs, the amount of legs a chair has. (4) */
//* @param material, what the chair is made outta of */
    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }
//* constructor, creates a chair made of wood and with 4 legs */
    public Chair(){
        this.legs = 4;
        this.material = "wood";
    }
//* @param legs int. the amount of legs a chair has */
    public Chair(int legs){
        this.legs = legs;
        this.material = "wood";
    }
//* @return the number of legs the chair has as an int */
    public int getLegs(){
        return this.legs;
    }

//* return the mateiral as a string */
    public String getMaterial(){
        return this.material;
    }
}