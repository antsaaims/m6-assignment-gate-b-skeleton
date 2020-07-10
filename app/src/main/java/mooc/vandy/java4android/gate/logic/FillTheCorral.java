package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here

    public void setCorralGates(Gate[] gate,  Random selectDirection){//method that is passed an array of Gate objects and a Random
        //object and sets the direction of each gate’s swing.
    for(Gate mygate: gate){
        int newsing=selectDirection.nextInt(2)-1;//this will select number from 0 to 2
        // so decreasing it by 1 will allow us to have -1, 0, 1
        mygate.mSwing=  newsing;

         }


    }

    public Boolean anyCorralAvailable(Gate[] gate){
      Boolean mytest=false;
      int seed=1
      do {
          int mycount = 0
          do {
              int swing = gate[i].mSwing();
              i = i + 1;
              if (swing == 1)
                  mytest = true;
          } while (mytest == false && i <= gate.size())



      }while(mytest==false)// We need at least one IN gate

      Random selectDirection=new Random();
      selectDirection.setSeed(seed);
      setCorralGates( gate, selectDirection);
      seed+=1;

      return mytest;
    }
    public int corralSnails(Gate[] gate, Random rnd){//Create corralSnails() that is passed an array of Gate objects and a Random object and
        //runs the simulation, as follows:
       int numsnails=5; //o The method begins with 5 snails out to pasture
       int numberattempts=0;

      do {
          int s = rnd.nextInt(numsnails + 1);   //o Generate a random number of snails s, not to exceed the number already out to
          //      pasture

          int numgate = rnd.nextInt(gate.size() + 1)
          Gate mygate = gate[numgate];     //o Randomly select one of the four Gate objects G

          int goin = mygate.thru(s);  //o Attempt to move s snails through gate G and adjust the number of snails out to
          //Pasture.
          if (goin > 0) {
              numsnails -= s;

          }
          mOut.println(new StringBuilder().append(s.toString()).append(" are trying to move through corral").append(numgate.toString()).toString());
          numberattempts+=1;
      }while(numsnails>0)

    mOut.print( numberattempts.toString()+"" )
     return numberattempts;
    }





    //o For each iteration, use mOut.println() to display the attempted movement of
    //snails. The simulation ends when all of the snails have been corralled.
    //o Finally, this method prints and returns the number of attempts that were
    //required to corral all the snails (see sample output below)








}
