// Generated with g9.

package com.dwa.foro.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="replica")
public class Replica implements Serializable {

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
    @Column(nullable=false)
    private String contenido;
    @ManyToOne(optional=false)
    @JoinColumn(name="idtema", nullable=false)
    private Tema tema;
    @ManyToOne(optional=false)
    @JoinColumn(name="idautor", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Replica() {
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
     * Access method for contenido.
     *
     * @return the current value of contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter method for contenido.
     *
     * @param aContenido the new value for contenido
     */
    public void setContenido(String aContenido) {
        contenido = aContenido;
    }

    /**
     * Access method for tema.
     *
     * @return the current value of tema
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * Setter method for tema.
     *
     * @param aTema the new value for tema
     */
    public void setTema(Tema aTema) {
        tema = aTema;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Replica.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Replica and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Replica)) {
            return false;
        }
        Replica that = (Replica) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Replica.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Replica)) return false;
        return this.equalKeys(other) && ((Replica)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Replica |");
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
