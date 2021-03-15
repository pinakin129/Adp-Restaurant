package com.adp.res.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class Beverages implements Serializable {

	private static final long serialVersionUID = 78232145L;
	
    private Long bevId;
    private String name;
	private String description;
    private BigDecimal price;
        
    public Beverages() {
        super();
    }
    
    public Beverages(Long bevId) {
        super();
        this.bevId=bevId;
    }
 
    public Beverages(String name, String description, BigDecimal price) {
          super();      
          this.name=name;          
          this.description=description;
          this.price=price;        
    }
    
    public Beverages(Long bevId, String name, String description, BigDecimal price) {
          super();
          this.bevId=bevId;
          this.name=name;
          this.description=description;
          this.price=price;        
    }
     
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public Long getBevId() {
        return bevId;
    }

    public void setBevId(Long bevId) {
        this.bevId = bevId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((bevId == null) ? 0 : bevId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Beverages other = (Beverages) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (bevId == null) {
			if (other.bevId != null)
				return false;
		} else if (!bevId.equals(other.bevId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}       
	
}
