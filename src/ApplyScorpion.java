public class ApplyScorpion {
    private static ApplyScorpion instance;
    private Scorpion character;

    private ApplyScorpion(){
        character = new Scorpion();
    }

    public static ApplyScorpion getInstance(){
        if(instance == null){
            instance = new ApplyScorpion();
        }
        return instance;
    }

    public Scorpion getCharacter(){
        return character;
    }
}
