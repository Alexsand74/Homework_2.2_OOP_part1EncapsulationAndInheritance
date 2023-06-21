import java.util.Objects;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;         // хитрость
    private int determination;   // решительность
    private int ambition;        // амбициозность
    private int ingenuity;       // изобретательность
    private int thirstForPower;  // жажда власти

    private SlytherinStudent(String name, int magic, int transgression, int cunning, int determination,
                     int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                " name='" + super.getName() + '\'' +
                ", magic=" + super.getMagic() +
                ", transgression=" + super.getTransgression() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SlytherinStudent that = (SlytherinStudent) o;
        return cunning == that.cunning && determination == that.determination && ambition == that.ambition
                && ingenuity == that.ingenuity && thirstForPower == that.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, ingenuity, thirstForPower);
    }

    public void compareToPrint(SlytherinStudent student) {
        int i = (super.getMagic() + super.getTransgression() - student.getMagic() - student.getTransgression())
                + this.cunning + this.determination + this.ambition + this.ingenuity + this.thirstForPower
                - student.cunning - student.determination - student.ambition - student.ingenuity
                - student.thirstForPower;
        super.toPrint(i, this.getName(), student.getName());
    }

    public static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM(),
                GetRandon.getIntRANDOM()
        );
    }
}
