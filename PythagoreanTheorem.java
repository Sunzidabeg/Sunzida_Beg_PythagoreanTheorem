package pythagorean.theorem;


public class PythagoreanTheorem {
    public double CalcHyp (double legA, double legB) {
       double legC = (legA*legA + legB*legB);
       double squareroot = Math.sqrt(legC);
       return squareroot;
   }
}
