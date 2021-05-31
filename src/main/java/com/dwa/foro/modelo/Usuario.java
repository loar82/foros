// Generated with g9.

package com.dwa.foro.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="usuario")
public class Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=15)
    private String alias;
    @Column(nullable=false, length=100)
    private String correoe;
    @Column(nullable=false, length=50)
    private String nombre;
    @Column(nullable=false, length=20)
    private byte[] claveacceso;
    @OneToMany(mappedBy="usuario")
    private Set<Replica> replica;
    @OneToMany(mappedBy="usuario")
    private Set<Tema> tema;

    /** Default constructor. */
    public Usuario() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for alias.
     *
     * @return the current value of alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Setter method for alias.
     *
     * @param aAlias the new value for alias
     */
    public void setAlias(String aAlias) {
        alias = aAlias;
    }

    /**
     * Access method for correoe.
     *
     * @return the current value of correoe
     */
    public String getCorreoe() {
        return correoe;
    }

    /**
     * Setter method for correoe.
     *
     * @param aCorreoe the new value for correoe
     */
    public void setCorreoe(String aCorreoe) {
        correoe = aCorreoe;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for claveacceso.
     *
     * @return the current value of claveacceso
     */
    public byte[] getClaveacceso() {
        return claveacceso;
    }

    /**
     * Setter method for claveacceso.
     *
     * @param aClaveacceso the new value for claveacceso
     */
    public void setClaveacceso(byte[] aClaveacceso) {
        claveacceso = aClaveacceso;
    }

    /**
     * Access method for replica.
     *
     * @return the current value of replica
     */
    public Set<Replica> getReplica() {
        return replica;
    }

    /**
     * Setter method for replica.
     *
     * @param aReplica the new value for replica
     */
    public void setReplica(Set<Replica> aReplica) {
        replica = aReplica;
    }

    /**
     * Access method for tema.
     *
     * @return the current value of tema
     */
    public Set<Tema> getTema() {
        return tema;
    }

    /**
     * Setter method for tema.
     *
     * @param aTema the new value for tema
     */
    public void setTema(Set<Tema> aTema) {
        tema = aTema;
    }

    /**
     * Compares the key for this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuario)) {
            return false;
        }
        Usuario that = (Usuario) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuario)) return false;
        return this.equalKeys(other) && ((Usuario)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Usuario |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
