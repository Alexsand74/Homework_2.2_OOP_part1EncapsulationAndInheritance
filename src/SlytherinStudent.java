import java.util.Objects;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;         // хитрость
    private int determination;   // решительность
    private int ambition;        // амбициозность
    private int ingenuity;       // изобретательность
    private int thirstForPower;  // жажда власти

    SlytherinStudent(String name, int magic, int transgression, int cunning, int determination,
                            int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    int getCunning() {
        return cunning;
    }

    void setCunning(int cunning) {
        this.cunning = cunning;
    }

    int getDetermination() {
        return determination;
    }

    void setDetermination(int determination) {
        this.determination = determination;
    }

    int getAmbition() {
        return ambition;
    }

    void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    int getIngenuity() {
        return ingenuity;
    }

    void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    int getThirstForPower() {
        return thirstForPower;
    }

    void setThirstForPower(int thirstForPower) {
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
    @Override
    protected int compareHogwarts(HogwartsStudent student) {
        return super.compareHogwarts(student);
    }

    void compareHogwartsToPrint(HogwartsStudent student) {
        int i = compareHogwarts(student);
        super.toPrint(i, this.getName(), student.getName());
    }

    private int compareSlytherin(SlytherinStudent slytherinStudent) {
        return compareHogwarts(slytherinStudent) + this.cunning + this.determination + this.ambition + this.ingenuity
                + this.thirstForPower - slytherinStudent.cunning - slytherinStudent.determination
                - slytherinStudent.ambition - slytherinStudent.ingenuity - slytherinStudent.thirstForPower;
    }

    void compareSlytherinToPrint(SlytherinStudent slytherinStudent) {
        int i = compareSlytherin(slytherinStudent);
        super.toPrint(i, this.getName(), slytherinStudent.getName());
    }

    static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100),
                GetRandon.setRANDOM().nextInt(100)
        );
    }
}
