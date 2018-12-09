package javaeetutorial.order.entity;


import java.util.Collection;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PERSISTENCE_COURT")
@NamedQueries({
    @NamedQuery(
        name = "findAllCourts",
        query = "SELECT co FROM Court co " +
                "ORDER BY co.court_id"
),
    @NamedQuery(
    name = "findCourtsByCategory",
    query = "SELECT co FROM Court co "
           + "WHERE co.category = :category "
           + "ORDER BY co.court_id"
)
})

public class Court implements java.io.Serializable {
    private static final long serialVersionUID = 6582105865012174694L;
    private Integer court_id;
    private Integer court_category;   //1: basketball;   2: pingpang;  3: badminton
    private Integer stadium;    //1: guangti;  2: nanti;   3: xnti;  4:guangbiaolou
    private int court_no;
    private Collection<Reserve> reserves;


    public Court() {
    }

    public Court(Integer court_id, int court_category, int stadium, int court_no) {
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

    public int getCourtCategory() {
        return court_category;
    }

    public void setCourtCategory(int court_category) {
        this.court_category = court_category;
    }

    public int getStadium() {
        return stadium;
    }

    public void setStadium(int stadium) {
        this.stadium = stadium;
    }

    public int getCourtNo() {
        return court_no;
    }

    public void setCourtNo(int court_no) {
        this.court_no = court_no;
    }

    @OneToMany(cascade=ALL, mappedBy="court")
    public Collection<Reserve> getReserves() {
        return reserves;
    }


}

