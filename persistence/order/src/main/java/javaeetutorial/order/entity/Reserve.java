package javaeetutorial.order.entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@Entity
@Table(name="PERSISTENCE_RESERVE")
@NamedQueries({
    @NamedQuery(
            name = "findAllReserves",
            query = "SELECT re FROM Reserve re "+
                    "WHERE re.user.username = :username "+
                    "ORDER BY re.start_date"
),
    @NamedQuery(
            name = "findReservesByTime",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.start_date = :start_date AND re.start_hour = :start_hour "
                    + "re.status = 1 ORDER BY re.court.court_id"
),
    @NamedQuery(
            name = "findReservesByCourtIDAndDate",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.court.court_id = :court_id AND re.start_date = :start_date "
                    + "re.status = 1 ORDER BY re.start_hour"
),
    @NamedQuery(
            name = "findReservedCourtsByCategoryAndTime",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.court.category = :category AND re.start_date = :start_date "
                    + "AND re.start_hour = :start_hour AND re.status = 1 ORDER BY re.court.court_id"
    
),
})

public class Reserve implements Serializable {
    private static final long serialVersionUID = -3082087016342644227L;
    private Long reserve_id;
    private Court court;
    private Calendar start_date;
    private int start_hour;
    private User user;
    private int status;     //1: success;   2: cancel;   3: fail
    
    public Reserve() {}
    
    public Reserve(Calendar start_date, int start_hour) {
        this.start_date = start_date;
        this.start_hour = start_hour;
    }
    
    @TableGenerator(
            name="reserveIdGen",
            table = "RESERVE_ID_GENERATOR",
            pkColumnName="GEN_KEY",
            valueColumnName="GEN_VALUE",
            pkColumnValue="RESERVE_ID",
            initialValue = 1,
            allocationSize=1
            )
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE,
            generator="RESERVE_ID_GENERATOR")
    @Column(nullable=false)
    public Long getReserveId() {
        return reserve_id;
    }
    public void setReserveId(Long reserve_id) {
        this.reserve_id = reserve_id;
    }

    @ManyToOne
    @JoinColumn(name="court_id")
    public Court getCourt()
    {
        return court;
    }
    public void setCourt(Court court)
    {
        this.court = court;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getStart_date() {
        return start_date;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }
    
    
    public int getStartHour() {
        return start_hour;
    }

    public void setStartHour(int start_hour) {
        this.start_hour = start_hour;
    }
    
    
    @ManyToOne
    @JoinColumn(name="username")
    public User getUser()
    {
        return user;
    }
    public void setUser(User user)
    {
        this.user = user;
    }

    
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
}
    