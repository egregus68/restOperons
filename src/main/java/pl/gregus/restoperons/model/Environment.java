/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gregus.restoperons.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Grzegorz
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Environment implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ENVIRONMENT_SEQ_GEN")
    @SequenceGenerator(name = "ENVIRONMENT_SEQ_GEN", sequenceName = "ENVIRONMENT_SEQ") 
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "client_id")
    @XmlTransient
    private Client client;
    
    @Column(name = "ENVIRONMENT_TYPE", length = 20)
    @Enumerated(EnumType.STRING)
    private EnvironmentType environmentType;
    
    @Column(name = "NAME", length = 100)
    private String name;
    
    @Column(name = "INFORMATION", length = 200)
    private String information;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "APPLICATION_LAYER_ID")
    private ApplicationLayer applicationLayer;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "DATABASE_LAYER_ID")
    //@XmlTransient
    private DatabaseLayer databaseLayer;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "RMI_LAYER_ID")
    //@XmlTransient
    private RmiLayer rmiLayer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public ApplicationLayer getApplicationLayer() {
        return applicationLayer;
    }

    public void setApplicationLayer(ApplicationLayer applicationLayer) {
        this.applicationLayer = applicationLayer;
    }

    public DatabaseLayer getDatabaseLayer() {
        return databaseLayer;
    }

    public void setDatabaseLayer(DatabaseLayer databaseLayer) {
        this.databaseLayer = databaseLayer;
    }

    public RmiLayer getRmiLayer() {
        return rmiLayer;
    }

    public void setRmiLayer(RmiLayer rmiLayer) {
        this.rmiLayer = rmiLayer;
    }

    
    
}
