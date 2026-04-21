class plant
{
    void nourish()
    {
        System.out.println("Plant is small and is taking sunlight");
    }
}
class tree extends plant
{
    void develop()
    {
        System.out.println("Plant is developing trunk");
    }
}
class AppleTree extends tree
{
    void fruit()
    {
        System.out.println("The tree is giving apples");
    }
}
public class PlantHierarchy {
    public static void main(String args[]){
        AppleTree at = new AppleTree();
        at.nourish();
        at.develop();
        at.fruit();
    }
}
