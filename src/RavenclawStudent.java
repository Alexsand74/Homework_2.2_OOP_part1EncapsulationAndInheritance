import java.util.Objects;

public class RavenclawStudent extends HogwartsStudent {
    private int cleverness;   // сообразительность
    private int wisdom;       // мудрость
    private int wit;          // остроумие
    private int creativity;   // креативность

    RavenclawStudent(String name, int magic, int transgression, int cleverness,
                            int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    int getCleverness() {
        return cleverness;
    }

    void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    int getWisdom() {
        return wisdom;
    }

    void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    int getWit() {
        return wit;
    }

    void setWit(int wit) {
        this.wit = wit;
    }

    int getCreativity() {
        return creativity;
    }

    void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                " name='" + super.getName() + '\'' +
                ", magic=" + super.getMagic() +
                ", transgression=" + super.getTransgression() +
                ", cleverness=" + cleverness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RavenclawStudent that = (RavenclawStudent) o;
        return cleverness == that.cleverness && wisdom == that.wisdom && wit == that.wit && creativity == that.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, wisdom, wit, creativity);
    }
    @Override
    protected int compareHogwarts(HogwartsStudent student) {
        return super.compareHogwarts(student);
    }
    void compareHogwartsToPrint(HogwartsStudent student) {
        int i = compareHogwarts(student);
        super.toPrint(i, this.getName(), student.getName());
    }

    private int compareRavenclaw(RavenclawStudent ravenclawStudent) {
        return compareHogwarts(ravenclawStudent) + this.cleverness + this.wisdom + this.wit + this.creativity
                - ravenclawStudent.creativity - ravenclawStudent.wisdom - this.wit - this.creativity;
    }

    void compareRavenclawToPrint(RavenclawStudent ravenclawStudent) {
        int i = compareRavenclaw(ravenclawStudent);
        super.toPrint(i, this.getName(), ravenclawStudent.getName());
    }

    static RavenclawStudent generateRavenclawStudent(String name) {

        return new RavenclawStudent(
                name,
                GetRandon.setRANDOM(),
                GetRandon.setRANDOM(),
                GetRandon.setRANDOM(),
                GetRandon.setRANDOM(),
                GetRandon.setRANDOM(),
                GetRandon.setRANDOM()
        );
    }
}
