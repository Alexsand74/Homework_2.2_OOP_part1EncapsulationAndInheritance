import java.util.Objects;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility; // благородство
    private int honor;    // честь
    private int bravery;  // храбрость

    private GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                " name='" + super.getName() + '\'' +
                ", magic=" + super.getMagic() +
                ", transgression=" + super.getTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GryffindorStudent that = (GryffindorStudent) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }


    public void compareToPrint(GryffindorStudent student) {
        int i =(super.getMagic() + super.getTransgression() - student.getMagic() - student.getTransgression())
        + this.nobility + this.honor + this.bravery - student.nobility - student.honor - student.bravery;
        super.toPrint(i, this.getName(), student.getName());
    }

    public static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM()
        );
    }
}
