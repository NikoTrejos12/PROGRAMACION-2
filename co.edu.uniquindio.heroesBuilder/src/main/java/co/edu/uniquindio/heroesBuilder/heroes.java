package co.edu.uniquindio.heroesBuilder;

public class heroes {

    private string ironman;
    private string spiderman;
    private string hulk;
    private string vision;
    private string grood;

    public heroes(string ironman,string spiderman,string hulk,string vision,string grood) {
        this.ironman=ironman;
        this.spiderman=spiderman;
        this.hulk=hulk;
        this.vision=vision;
        this.grood=grood;
    }

    public string getIronman() {
        return ironman;
    }

    public string getSpiderman() {
        return spiderman;
    }

    public string getHulk() {
        return hulk;
    }

    public string getVision() {
        return vision;
    }

    public string getGrood() {
        return grood;
    }
}
