public class Main {
    public static void main(String[] args) {

        ApplyScorpion scorpion = ApplyScorpion.getInstance();

        Scorpion character = scorpion.getCharacter();

        System.out.println("Scorpion's abilities:");
        character.performAbility();
        character.setAbility(new KunaiSpearAttackAbility());
        character.performAbility();
        character.setAbility(new BlastFireAbility());
        character.performAbility();
    }
}