package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public static final int HERD=24;//the size of our escargatoire
    public int inside=24;//number of snails currently inside the pen. There is no need for a variable outside since it is 24-inside
    //Create a simulateHerd() method that accepts a Random object as an input parameter.



    public void simulateHerd(Random Rnd){
         int size=HERD;  // Set a local variable inside of simulateHerd() equal to the size of the HERD.
         //int numberofiteration=10; //The method will run ten iterations of the simulation.

         for(int i=1; i<=10;i++){

             if(inside==24){// If there is no snails out for pastures
                 usegate(mEastGate,  Rnd, size);
             }
             else{

                 Boolean bool=Rnd.nextBoolean();// Randomly select the gate
                 if(bool==true){  //the snails will go out
                     usegate(mEastGate,  Rnd, size);
                 }
                 else{

                     usegate(mWestGate,  Rnd, size);
                 }

             }

          mOut.println("There are currently " + Integer.toString(inside)+" snails in the pen and "+ Integer.toString(24-inside)+" snails in the pasture");

              }


          }


    public void usegate(Gate gate, Random Rnd, int size ){
        int mynumber;

        if(gate.getSwingDirection()==Gate.OUT){
            mynumber=Rnd.nextInt(inside+1);
            inside-=mynumber;// the snails will go out the number of snails inside will diminish

        }
        else{
            mynumber=Rnd.nextInt(size-inside+1);
            inside+=mynumber;// the snails will go in the number of snails inside will increase

        }

    }
}
