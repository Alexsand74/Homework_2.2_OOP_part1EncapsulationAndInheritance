import java.util.Objects;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility; // благородство
    private int honor;    // честь
    private int bravery;  // храбрость

    GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    int getNobility() {
        return nobility;
    }

    void setNobility(int nobility) {
        this.nobility = nobility;
    }

    int getHonor() {
        return honor;
    }

    void setHonor(int honor) {
        this.honor = honor;
    }

    int getBravery() {
        return bravery;
    }

    void setBravery(int bravery) {
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

    protected int compareHogwarts(HogwartsStudent student) {
        return super.compareHogwarts(student);
    }

    void compareHogwartsToPrint(HogwartsStudent student) {
        int i = compareHogwarts(student);
        super.toPrint(i, this.getName(), student.getName());
    }

    private int compareGryffindor(GryffindorStudent gryffindorStudent) {
        return compareHogwarts(gryffindorStudent) + this.nobility + this.honor + this.bravery
                - gryffindorStudent.nobility - gryffindorStudent.honor - gryffindorStudent.bravery;
    }

    void compareGryffindorToPrint(GryffindorStudent gryffindorStudent) {
        int i = compareGryffindor(gryffindorStudent);
        super.toPrint(i, this.getName(), gryffindorStudent.getName());
    }

    static GryffindorStudent generateGryffindorStudent(String name) {

        return new GryffindorStudent(
                name,
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100)
        );
    }
}
