package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс описывающий поток студентов
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> steam, Integer idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public Integer getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "steam=" + steam +
                ", idSteam=" + idSteam +
                '}';

    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steam);
    }

}
