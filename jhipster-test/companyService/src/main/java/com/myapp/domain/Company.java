package com.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Company.
 */
@Entity
@Table(name = "company")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cnpj")
    private Integer cnpj;

    @Column(name = "cnae")
    private Integer cnae;

    @Column(name = "principal_activity")
    private String principalActivity;

    @OneToOne
    @JoinColumn(unique = true)
    private Owner owner;

    @OneToOne
    @JoinColumn(unique = true)
    private Address address;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Company id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Company name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCnpj() {
        return this.cnpj;
    }

    public Company cnpj(Integer cnpj) {
        this.setCnpj(cnpj);
        return this;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getCnae() {
        return this.cnae;
    }

    public Company cnae(Integer cnae) {
        this.setCnae(cnae);
        return this;
    }

    public void setCnae(Integer cnae) {
        this.cnae = cnae;
    }

    public String getPrincipalActivity() {
        return this.principalActivity;
    }

    public Company principalActivity(String principalActivity) {
        this.setPrincipalActivity(principalActivity);
        return this;
    }

    public void setPrincipalActivity(String principalActivity) {
        this.principalActivity = principalActivity;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Company owner(Owner owner) {
        this.setOwner(owner);
        return this;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company address(Address address) {
        this.setAddress(address);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Company)) {
            return false;
        }
        return id != null && id.equals(((Company) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Company{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", cnpj=" + getCnpj() +
            ", cnae=" + getCnae() +
            ", principalActivity='" + getPrincipalActivity() + "'" +
            "}";
    }
}
