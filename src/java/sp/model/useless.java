/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RG
 */
@Entity
@Table(name = "student_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentDetails.findAll", query = "SELECT s FROM StudentDetails s"),
    @NamedQuery(name = "StudentDetails.findByUname", query = "SELECT s FROM StudentDetails s WHERE s.uname = :uname"),
    @NamedQuery(name = "StudentDetails.findByName", query = "SELECT s FROM StudentDetails s WHERE s.name = :name"),
    @NamedQuery(name = "StudentDetails.findByFname", query = "SELECT s FROM StudentDetails s WHERE s.fname = :fname"),
    @NamedQuery(name = "StudentDetails.findByMname", query = "SELECT s FROM StudentDetails s WHERE s.mname = :mname"),
    @NamedQuery(name = "StudentDetails.findByBranch", query = "SELECT s FROM StudentDetails s WHERE s.branch = :branch"),
    @NamedQuery(name = "StudentDetails.findByYear", query = "SELECT s FROM StudentDetails s WHERE s.year = :year"),
    @NamedQuery(name = "StudentDetails.findByMobno", query = "SELECT s FROM StudentDetails s WHERE s.mobno = :mobno"),
    @NamedQuery(name = "StudentDetails.findByEmail", query = "SELECT s FROM StudentDetails s WHERE s.email = :email"),
    @NamedQuery(name = "StudentDetails.findByRollno", query = "SELECT s FROM StudentDetails s WHERE s.rollno = :rollno")})
public class useless implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "uname")
    private String uname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mname")
    private String mname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "branch")
    private String branch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private short year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobno")
    private int mobno;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rollno")
    private int rollno;

    public useless() {
    }

    public useless(String uname) {
        this.uname = uname;
    }

    public useless(String uname, String name, String fname, String mname, String branch, short year, int mobno, String email, int rollno) {
        this.uname = uname;
        this.name = name;
        this.fname = fname;
        this.mname = mname;
        this.branch = branch;
        this.year = year;
        this.mobno = mobno;
        this.email = email;
        this.rollno = rollno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getMobno() {
        return mobno;
    }

    public void setMobno(int mobno) {
        this.mobno = mobno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uname != null ? uname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof useless)) {
            return false;
        }
        useless other = (useless) object;
        if ((this.uname == null && other.uname != null) || (this.uname != null && !this.uname.equals(other.uname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.StudentDetails[ uname=" + uname + " ]";
    }
    
}
