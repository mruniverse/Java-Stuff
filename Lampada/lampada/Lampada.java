
package lampada;

public class Lampada {

    private boolean state;
    private int potency;
    private String marca;


    public Lampada(){
        state = false;
        potency = 100;
    }

    //   void on(){
    //     state = true;
    // }
    //
    //   void off(){
    //     state = false;
    //  }

     public boolean getState(){
         return state;
     }

     public boolean setState(boolean state){
         this.state = state;
        return state;
     }

     public int getPotency(){
         return potency;
     }

     public int setPotency(int potency){
         this.potency = potency;
        return potency;
     }
}
