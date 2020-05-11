package oop;

public class SuperHero extends Person {

    private String alterEgo;

    public SuperHero(String fn, String ln, String alterEgo){
        super(fn, ln, true);
        this.alterEgo = alterEgo;
    }

    public String getFirstName(){
        return this.alterEgo;
    }

    public String getLastName(){
        return this.alterEgo;
    }

    public String getSecretIdentity() {
        return super.getFirstName() + " " + super.getLastName();
    }

}
