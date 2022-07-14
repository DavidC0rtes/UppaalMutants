package Parser.Mutation;

public class ChanType {
    private String name;
    private int dimension;

    private String prefix;
    public ChanType(String nameIn, int dimensionIn, String prefix){
        this.name = nameIn;
        this.dimension = dimensionIn;
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
