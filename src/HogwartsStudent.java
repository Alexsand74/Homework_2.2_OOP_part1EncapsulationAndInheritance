import java.util.Objects;
public abstract class HogwartsStudent {
    private String name;          // имя
    private int magic;             // магия
    private int transgression;     // трансгрессия

    HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getMagic() {
        return magic;
    }

    void setMagic(int magic) {
        this.magic = magic;
    }

    int getTransgression() {
        return transgression;
    }

    void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return magic == that.magic && transgression == that.transgression && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magic, transgression);
    }

    int compareHogwarts (HogwartsStudent hogwartsStudent) {
        return  (this.magic + this.transgression - hogwartsStudent.magic - hogwartsStudent.transgression);
    }
    void compareToPrint(HogwartsStudent student) {
        int i = compareHogwarts(student);
        toPrint(i, this.getName(), student.getName());
    }

    void toPrint (int i, String firstName, String secondName){
        if (i > 0){
            System.out.printf("\n  Победил студент - %s, над студентом - %s " , firstName, secondName);
        } else if (i < 0) {
            System.out.printf("\n  Победил студент - %s, над студентом - %s " , secondName, firstName);
        } else {
            System.out.printf("\n  Ничья между студентами - %s и - %s " , firstName, secondName);
        }
        System.out.println();
    }

}
