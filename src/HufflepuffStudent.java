import java.util.Objects;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;  // усердие
    private int loyalty;    // верность
    private int honesty;    // честность

    HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    int getDiligence() {
        return diligence;
    }

    void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    int getLoyalty() {
        return loyalty;
    }

    void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    int getHonesty() {
        return honesty;
    }

    void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "HufflepuffStudent {" +
                " name='" + super.getName() + '\'' +
                ", magic=" + super.getMagic() +
                ", transgression=" + super.getTransgression() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HufflepuffStudent that = (HufflepuffStudent) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honesty);
    }
    protected int compareHogwarts(HogwartsStudent student) {
        return super.compareHogwarts(student);
    }

    void compareHogwartsToPrint(HogwartsStudent student) {
        int i = compareHogwarts(student);
        super.toPrint(i, this.getName(), student.getName());
    }
     private int compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        return compareHogwarts(hufflepuffStudent) + this.diligence + this.honesty + this.loyalty
                - hufflepuffStudent.loyalty - hufflepuffStudent.honesty - hufflepuffStudent.loyalty;
    }

    void compareHufflepuffToPrint(HufflepuffStudent hufflepuffStudent) {
        int i = compareHufflepuff(hufflepuffStudent);
        super.toPrint(i, this.getName(), hufflepuffStudent.getName());
    }

    static HufflepuffStudent generateHufflepuffStudent(String name) {

        return new HufflepuffStudent(
                name,
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100)
        );
    }

}
