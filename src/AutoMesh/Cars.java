package AutoMesh;

public abstract class Cars {
    protected SigModel model;

    public Cars(SigModel model) {
        this.model = model;
    }

    public abstract void installed();
}
