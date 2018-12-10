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
                "ORDER BY co.courtId"
),
    @NamedQuery(
    name = "findCourtsByCategory",
    query = "SELECT co FROM Court co "
           + "WHERE co.courtCategory = :category "
           + "ORDER BY co.courtId"
)
})

public class Court implements java.io.Serializable {
    private static final long serialVersionUID = 6582105865012174694L;
    private int courtId;
    private int courtCategory;   //1: basketball;   2: pingpang;  3: badminton
    private int stadium;    //1: guangti;  2: nanti;   3: xnti;  4:guangbiaolou
    private int courtNo;
    private Collection<Reserve> reserves;


    public Court() {
    }

    public Court(int court_id, int court_category, int stadium, int court_no) {
        this.courtId = court_id;
        this.courtCategory = court_category;
        this.stadium = stadium;
        this.courtNo = court_no;
    }

    @Id
    public int getCourtId() {
        return courtId;
    }

    public int getCourtCategory() {
        return courtCategory;
    }

    public int getStadium() {
        return stadium;
    }

    public int getCourtNo() {
        return courtNo;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public void setCourtCategory(int courtCategory) {
        this.courtCategory = courtCategory;
    }

    public void setStadium(int stadium) {
        this.stadium = stadium;
    }

    public void setCourtNo(int courtNo) {
        this.courtNo = courtNo;
    }

    

    @OneToMany(cascade=ALL, mappedBy="court")
    public Collection<Reserve> getReserves() {
        return reserves;

    }

    public void setReserves(Collection<Reserve> reserves) {
        this.reserves = reserves;
    }
    
}

