/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rajgaurav
 */
@Entity
@Table(name = "login_record")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "LoginRecord.findAll", query = "SELECT l FROM LoginRecord l"),
  @NamedQuery(name = "LoginRecord.findById", query = "SELECT l FROM LoginRecord l WHERE l.id = :id"),
  @NamedQuery(name = "LoginRecord.findByUname", query = "SELECT l FROM LoginRecord l WHERE l.uname = :uname"),
  @NamedQuery(name = "LoginRecord.findByPass", query = "SELECT l FROM LoginRecord l WHERE l.pass = :pass"),
  @NamedQuery(name = "LoginRecord.findByRole", query = "SELECT l FROM LoginRecord l WHERE l.role = :role")})
public class LoginRecord implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 90)
  @Column(name = "uname")
  private String uname;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 45)
  @Column(name = "pass")
  private String pass;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 45)
  @Column(name = "role")
  private String role;

  public LoginRecord() {
  }

  public LoginRecord(Integer id) {
    this.id = id;
  }

  public LoginRecord(Integer id, String uname, String pass, String role) {
    this.id = id;
    this.uname = uname;
    this.pass = pass;
    this.role = role;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
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
    if (!(object instanceof LoginRecord)) {
      return false;
    }
    LoginRecord other = (LoginRecord) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "sp.model.LoginRecord[ id=" + id + " ]";
  }
  
}
