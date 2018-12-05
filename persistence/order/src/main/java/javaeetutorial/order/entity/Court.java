package javaeetutorial.order.entity;


import java.util.Collection;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PERSISTENCE_COURT")
@NamedQuery(
        name="findAllCourts",
        query="SELECT co FROM Court co " +
                "ORDER BY co.court_id"
)
public class Court implements java.io.Serializable {
    private static final long serialVersionUID = 6582105865012174694L;
    private Integer court_id;
    private char court_category;
    private char stadium;
    private int court_no;


    public Court() {
    }

    public Court(Integer court_id, char court_category, char stadium,
                         int court_no) {
        this.court_id = court_id;
        this.court_category = court_category;
        this.stadium = stadium;
        this.court_no = court_no;
    }

    @Id
    public Integer getCourtId() {
        return court_id;
    }

    public void setCourtId(Integer court_id) {
        this.court_id = court_id;
    }

    public char getCourtCategory() {
        return court_category;
    }

    public void setCourtCategory(char court_category) {
        this.court_category = court_category;
    }

    public char getStadium() {
        return stadium;
    }

    public void setStadium(char stadium) {
        this.stadium = stadium;
    }

    public int getCourtNo() {
        return court_no;
    }

    public void setCourtNo(int court_no) {
        this.court_no = court_no;
    }

    @OneToMany(cascade=ALL, mappedBy="court")
    public Collection<LineItem> getReserves() {
        return reserves;
    }


}

