import java.util.Objects;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;  // усердие
    private int loyalty;    // верность
    private int honesty;    // честность

    private HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
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

    void compareToPrint(HufflepuffStudent student) {
        int i = (super.getMagic() + super.getTransgression() - student.getMagic() - student.getTransgression())
        + this.diligence + this.honesty + this.loyalty - student.loyalty - student.honesty - student.loyalty;
        super.toPrint(i, this.getName(), student.getName());
    }

    public static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM()
        );
    }

}
