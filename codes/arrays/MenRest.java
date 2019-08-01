import java.util.*;
class MenRest{
	public static void main(String[] args) {
    int numStalls = 10; // get it from user input if you like
    BitSet bs = new BitSet();
    // set the leftmost and the rightmost bits (which represent walls)
    bs.set(0);
    bs.set(numStalls+1);
    // now we have 10 bits gap, which represent stalls
    // like this: X__________X
    for(int i=0; i<numStalls; i++) {
        bs.set(nextStall(bs));
        printStalls(bs);
    }
}

public static int nextStall(BitSet bs) {
    int bestPos = 0, maxDist = bs.nextSetBit(0);
    // iterate over the set bits
    for(int pos = maxDist; pos != -1; pos = bs.nextSetBit(pos+1)) {
        int dist = bs.nextSetBit(pos+1) - pos;
        // track the position of the stall with biggest gap on the right
        if(dist > maxDist) {
            maxDist = dist;
            bestPos = pos;
        }
    }
    // return the position on the middle of the best gap
    return bestPos+maxDist/2;
}

public static void printStalls(BitSet bs) {
    StringBuilder sb = new StringBuilder();
    // Iterate over all the bit positions except the walls
    // walls have positions 0 and bs.length()
    for(int i=1; i<bs.length()-1; i++) {
        sb.append(bs.get(i) ? "X" : "_");
    }
    System.out.println(sb);
}
}