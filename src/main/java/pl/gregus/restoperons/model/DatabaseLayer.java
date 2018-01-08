/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gregus.restoperons.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grzegorz
 */
@Entity
public class DatabaseLayer implements Serializable {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DB_LAYER_SEQ_GEN")
    @SequenceGenerator(name = "DB_LAYER_SEQ_GEN", sequenceName = "DB_LAYER_SEQ") 
    private Long id;

    @Column(name = "OPERATING_SYSTEM", length = 100)
    private String operatingSystem;
    
    @Column(name = "DATABASE_SYSTEM", length = 100)
    private String databaseSystem;
    
    @Column(name = "HOST_NAME", length = 20)
    private String hostName;
    
    @Column(name = "PORT", length = 20)
    private String port;
    
    @Column(name = "SERVICE_NAME", length = 50)
    private String serviceName;
    
    @Column(name = "SCHEMA_NAME", length = 20)
    private String schemaName;
        
    @Column(name = "INFORMATION", length = 200)
    private String information;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getDatabaseSystem() {
        return databaseSystem;
    }

    public void setDatabaseSystem(String databaseSystem) {
        this.databaseSystem = databaseSystem;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    
}
