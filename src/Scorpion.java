public class Scorpion {
    private IPerformAbility currentAbility;

    public Scorpion(){
        currentAbility = new GetOverHereAbility();
    }

    public void setAbility(IPerformAbility ability){
        this.currentAbility = ability;
    }

    public void performAbility(){
        currentAbility.performAbility();
    }
}
