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
                    "ORDER BY re.startDate"
),   
    @NamedQuery(
            name = "findReservesByTime",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.startDate = :startDate AND re.startHour = :startHour "
                    + "AND re.status = 1 ORDER BY re.court.courtId"
),
    @NamedQuery(
            name = "findReservesByCourtIDAndDate",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.court.courtId = :courtId AND re.startDate = :startDate "
                    + "AND re.status = 1 ORDER BY re.startHour"
),
    @NamedQuery(
            name = "findReservedCourtsByCategoryAndTime",
            query = "SELECT re FROM Reserve re "
                    + "WHERE re.court.courtCategory = :category AND re.startDate = :startDate "
                    + "AND re.startHour = :startHour AND re.status = 1 ORDER BY re.court.courtId"
    
),
})

public class Reserve implements Serializable {
    private static final long serialVersionUID = -3082087016342644227L;
    private int reserveId;
    private Court court;
    private Calendar startDate;
    private int startHour;
    private User user;
    private int status;     //1: success;   2: cancel;   3: fail
    
    public Reserve() {}
    
    public Reserve(Calendar start_date, int start_hour) {
        this.startDate = start_date;
        this.startHour = start_hour;
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
    public int getReserveId() {
        return reserveId;
    }
    public void setReserveId(int reserve_id) {
        this.reserveId = reserve_id;
    }

    @ManyToOne
    @JoinColumn(name="courtId")
    public Court getCourt()
    {
        return court;
    }
    public void setCourt(Court court)
    {
        this.court = court;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar start_date) {
        this.startDate = start_date;
    }
    
    
    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int start_hour) {
        this.startHour = start_hour;
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
    