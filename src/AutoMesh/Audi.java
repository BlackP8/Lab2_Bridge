package AutoMesh;

public class Audi extends Cars {
    public Audi (SigModel model) {
        super(model);
    }

    @Override
    public void installed() {
        String mark = "Audi";
        System.out.println(model.selectModel() + mark);
    }
}
