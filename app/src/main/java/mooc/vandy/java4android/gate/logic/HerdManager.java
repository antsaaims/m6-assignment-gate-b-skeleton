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
         int numberofiteration=10; //The method will run ten iterations of the simulation.

         for(int i=1; i<=numberofiteration;i++){

             if(inside==24){
                 usegate(mEastGate);
             }
             else{

                 Boolean bool=Rnd.nextBoolean();
                 if(bool=false){ //the snails will go out
                     usegate(mEastGate);
                 }
                 else{

                     usegate(mWestGate);
                 }

             }

          mOut.printf("There are currently  %d snails in the pen and %d snails in the pasture", inside, 24-inside);




              }


          }

    public void usegate(Gate gate, Random Rnd, int size ){
        int mynumber;
        if(gate.mSwing==-1){
            mynumber=Rnd.nextInt(inside+1);
            inside-=mynumber;// the snails will go out the number of snails inside will diminish

        }
        else{
            mynumber=Rnd.nextInt(size-inside+1);
            inside+=mynumber;// the snails will go in the number of snails inside will increase

        }

    }

  //  In each iteration, use the Random object
   // passed as a parameter to the method to randomly select one of the pen gates and move
   // a random number of snails through that gate (IN or OUT depending on the gate’s swing
     //       state), thereby changing the number of snails in the pen and out to pasture.
  //  You must be sure that neither of the numbers “in the pen” or “out to pasture” is ever
    //negative and that the sum total of snails is always equal to the size of the HERD. If there
    //are no snails currently out to pasture during some iteration do not randomly select a
   // gate, but instead move a random number of snails out of the pen and into the pasteur
   // using your OUT gate (mEastGate).
   // The range of random numbers generated will change according to which gate you
  //  have selected and how many snails are currently available to go through that selected
 //   gate, but should always be greater than 0. Print out the necessary information for each
   // iteration as shown in the sample run of HerdManager.java below. Note that the first
   // output line has been included in your skeleton program. Your output format must
  //  match the sample exactly as shown below.




}
