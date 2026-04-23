package basics;

public class PhaseOMatic{
    public static void main(String[] args){
        String[] wordListOne = {"agonistic","ai enabled","agent based","strongly typed"};
        String[] wordListTwo = {"loosly coupled","Iot","serverless","microservices"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;

        java.util.Random randomGenertaor = new java.util.Random();
        int rand1 = randomGenertaor.nextInt(oneLength);
        int rand2 = randomGenertaor.nextInt(twoLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2];

        System.err.println("What we need is a " + phrase); 
    }
}
