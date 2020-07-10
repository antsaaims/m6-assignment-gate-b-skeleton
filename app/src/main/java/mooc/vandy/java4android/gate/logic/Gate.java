package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
//
public class Gate {
    // TODO -- Fill in your code here
    public static final int OUT = -1;
    public static final int IN = 1;
    public static final int CLOSED = 0;

    private int mSwing;

    public Gate(){
        this.mSwing = CLOSED;
    }

    public boolean setSwing(int direction) {
        if(direction == IN || direction == OUT || direction == CLOSED) {
            this.mSwing = direction;
            return true;
        }
        return false;
    }

    public boolean open(int direction) {
        if (direction == IN || direction == OUT) {
            this.setSwing(direction);
            return true;
        }
        return false;
    }

    public void close() {
        this.mSwing = 0;
    }

    public int getSwingDirection() {
        return this.mSwing;
    }

    public int thru(int count) {
        if(this.mSwing == IN)
            return count;
        else if(this.mSwing == OUT)
            return - count;
        else
            return 0;
    }

    @Override
    public String toString() {
        if(this.mSwing ==0)
            return "This gate is closed";
        else if(this.mSwing == IN)
            return "This gate is open and swings to enter the pen only";
        else if (this.mSwing == OUT)
            return "This gate is open and swings to exit the pen only";
        else
            return "This gate has an invalid swing direction";
    }
}