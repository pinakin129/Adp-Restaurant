package com.adp.res.domain;

import java.io.Serializable;

import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class Entree implements Serializable {

	private static final long serialVersionUID = 78232145L;
	
    private Long entrId;
    private String name;
    private String description;
    private BigDecimal price;
        
    public Entree() {
        super();
    }
    
    public Entree(Long entrId) {
        super();
        this.entrId=entrId;
    }
 
    public Entree(String name,  String description, BigDecimal price) {
          super();      
          this.name=name;
          this.description=description;
          this.price=price;        
    }
    
    public Entree(Long entrId, String name, String description, BigDecimal price) {
          super();
          this.entrId=entrId;
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
    
    public Long getEntrId() {
        return entrId;
    }

    public void setEntrId(Long entrId) {
        this.entrId = entrId;
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
		result = prime * result + ((entrId == null) ? 0 : entrId.hashCode());
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
		Entree other = (Entree) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (entrId == null) {
			if (other.entrId != null)
				return false;
		} else if (!entrId.equals(other.entrId))
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
