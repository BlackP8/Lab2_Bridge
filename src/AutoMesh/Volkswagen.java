package AutoMesh;

public class Volkswagen extends Cars {
    public Volkswagen (SigModel model) {
        super(model);
    }

    @Override
    public void installed() {
        String mark = "Volkswagen";
        System.out.println(model.selectModel() + mark);
    }
}
