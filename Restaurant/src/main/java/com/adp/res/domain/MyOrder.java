package com.adp.res.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "myorders")
public class MyOrder implements Serializable {

	private static final long serialVersionUID = 23215645L;

	@javax.persistence.Id
    @GeneratedValue
    private Long id;

	private String customerName;
	private String customerPhone;
 	
    @ElementCollection
    @CollectionTable(name = "myorders_appetizers", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "appetizer")
    private Set<Appetizer> appetizers = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "myorders_entrees", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "entree")
    private Set<Entree> entrees = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "myorders_beverages", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "beverages")
    private Set<Beverages> beverages = new HashSet<>();
        
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
    public Set<Appetizer> getAppetizers() {
 		return appetizers;
 	}

 	public void setAppetizers(Set<Appetizer> appetizers) {
 		this.appetizers = appetizers;
 	}

	public Set<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(Set<Entree> entrees) {
		this.entrees = entrees;
	}

	public Set<Beverages> getBeverages() {
		return beverages;
	}

	public void setBeverages(Set<Beverages> beverages) {
		this.beverages = beverages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appetizers == null) ? 0 : appetizers.hashCode());
		result = prime * result + ((beverages == null) ? 0 : beverages.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result + ((entrees == null) ? 0 : entrees.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyOrder other = (MyOrder) obj;
		if (appetizers == null) {
			if (other.appetizers != null)
				return false;
		} else if (!appetizers.equals(other.appetizers))
			return false;
		if (beverages == null) {
			if (other.beverages != null)
				return false;
		} else if (!beverages.equals(other.beverages))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		if (entrees == null) {
			if (other.entrees != null)
				return false;
		} else if (!entrees.equals(other.entrees))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}	
 	
}
