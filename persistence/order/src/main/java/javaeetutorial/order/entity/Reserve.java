
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

@Entity
@Table(name="PERSISTENCE_RESERVE")

public class Reserve implements Serializable {
    private static final long serialVersionUID = -3082087016342644227L;
    private int reserve_id;
    private int court_id;
    private Date start_date;
    private int start_hour;
    private String username;
    private int status;
    
    public Reserve() {}
    
    public Reserve(int reserve_id,
            int court_id,
            Date start_date,
            int start_hour,
            int user_id,
            int status) {
        this.reserve_id = reserve_id;
        this.court_id = court_id;
        this.start_date = start_date;
        this.start_hour = start_hour;
        this.username = username;
        this.status = status;
    }

    @Id
    @Column(nullable=false)
    public int getReserveId() {
        return reserve_id;
    }

    public void setReserveId(int reserve_id) {
        this.reserve_id = reserve_id;
    }

    @ManyToOne
    @JoinColumn(name="court_id")
    public Court getCourt()
    {
        return Court;
    }
    
    @Column(name="username",insertable=false,nullable=false,updatable=false)
    public int getCourtId() {
        return court_id;
    }

    public void setCourtId(int court_id) {
        this.court_id = court_id;
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
        return User;
    }
    
    @Column(name="username",insertable=false,nullable=false,updatable=false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
}