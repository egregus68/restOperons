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
public class RmiLayer implements Serializable {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "RMI_LAYER_SEQ_GEN")
    @SequenceGenerator(name = "RMI_LAYER_SEQ_GEN", sequenceName = "RMI_LAYER_SEQ") 
    private Long id;
    
    @Column(name = "OPERATING_SYSTEM", length = 100)
    private String operatingSystem;
    
    @Column(name = "RMI_SYSTEM", length = 100)
    private String rmiSystem;
    
    @Column(name = "HOST_NAME", length = 20)
    private String hostName;
    
    @Column(name = "PORT", length = 20)
    private String port;
    
    @Column(name = "REPORTS_PATH", length = 100)
    private String reportsPath;
    
    @Column(name = "RMI_SERVER_PATH", length = 100)
    private String rmiServerPath;
        
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

    public String getRmiSystem() {
        return rmiSystem;
    }

    public void setRmiSystem(String rmiSystem) {
        this.rmiSystem = rmiSystem;
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

    public String getReportsPath() {
        return reportsPath;
    }

    public void setReportsPath(String reportsPath) {
        this.reportsPath = reportsPath;
    }

    public String getRmiServerPath() {
        return rmiServerPath;
    }

    public void setRmiServerPath(String rmiServerPath) {
        this.rmiServerPath = rmiServerPath;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    
}
