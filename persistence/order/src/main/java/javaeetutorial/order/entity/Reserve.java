
package javaeetutorial.order.entity;

import java.io.Serializable;
import java.util.Date;
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
    name="findAllReservedCourts",
    query="SELECT r FROM Reserve r "+
    	"WHERE r.user.username=:username "+
    	"ORDER BY r.username"
),
    @NamedQuery(
    name="findAllReserves",
    query="SELECT r FROM reserve r ORDER BY r.reserve_id"
)
})

public class Reserve implements Serializable {
    private static final long serialVersionUID = -3082087016342644227L;
    private Long reserve_id;
    private Court court;
    private Date start_date;
    private int start_hour;
    private User user;
    private int status;
    
    public Reserve() {}
    
    public Reserve(Date start_date,
            int start_hour,
            int status) {
        this.start_date = start_date;
        this.start_hour = start_hour;
        this.status = status;
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
    
    @Temporal(DATE)
    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
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
    
    
