/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rajgaurav
 */
@Entity
@Table(name = "feedback")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f"),
  @NamedQuery(name = "Feedback.findById", query = "SELECT f FROM Feedback f WHERE f.id = :id"),
  @NamedQuery(name = "Feedback.findByName", query = "SELECT f FROM Feedback f WHERE f.name = :name"),
  @NamedQuery(name = "Feedback.findByEmail", query = "SELECT f FROM Feedback f WHERE f.email = :email"),
  @NamedQuery(name = "Feedback.findByFeedback", query = "SELECT f FROM Feedback f WHERE f.feedback = :feedback"),
  @NamedQuery(name = "Feedback.findByFdate", query = "SELECT f FROM Feedback f WHERE f.fdate = :fdate")})
public class Feedback implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 45)
  @Column(name = "name")
  private String name;
  // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 90)
  @Column(name = "email")
  private String email;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 1000)
  @Column(name = "feedback")
  private String feedback;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fdate")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fdate;

  public Feedback() {
  }

  public Feedback(Integer id) {
    this.id = id;
  }

  public Feedback(Integer id, String name, String email, String feedback, Date fdate) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.feedback = feedback;
    this.fdate = fdate;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public Date getFdate() {
    return fdate;
  }

  public void setFdate(Date fdate) {
    this.fdate = fdate;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Feedback)) {
      return false;
    }
    Feedback other = (Feedback) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "sp.model.Feedback[ id=" + id + " ]";
  }
  
}
