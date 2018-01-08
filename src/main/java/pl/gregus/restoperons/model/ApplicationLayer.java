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
@XmlRootElement
public class ApplicationLayer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "APP_LAYER_SEQ_GEN")
    @SequenceGenerator(name = "APP_LAYER_SEQ_GEN", sequenceName = "APP_LAYER_SEQ") 
    private Long id;
    
    @Column(name = "OPERATING_SYSTEM", length = 100)
    private String operatingSystem;
    
    @Column(name = "APPLICATION_SYSTEM", length = 100)
    private String applicationSystem;
    
    @Column(name = "HOST_NAME", length = 20)
    private String hostName;
    
    @Column(name = "HTTP_PORT", length = 20)
    private String httpPort;
    
    @Column(name = "PATH_NAME", length = 100)
    private String pathName;
    
    @Column(name = "APPLICATION_CONTEXT", length = 100)
    private String applicationContext;
    
    @Column(name = "SVN_BRANCH", length = 50)
    private String svnBranch;
    
    @Column(name = "INFORMATION", length = 200)
    private String information;
    
    @Column(name = "ADMIN_PORT", length = 20)
    private String adminPort;
    
    @Column(name = "ADMIN_CONTEXT", length = 20)
    private String adminContext;
    
    @Column(name = "HTTPS_PORT", length = 20)
    private String httpsPort;

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

    public String getApplicationSystem() {
        return applicationSystem;
    }

    public void setApplicationSystem(String applicationSystem) {
        this.applicationSystem = applicationSystem;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(String httpPort) {
        this.httpPort = httpPort;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(String applicationContext) {
        this.applicationContext = applicationContext;
    }

    public String getSvnBranch() {
        return svnBranch;
    }

    public void setSvnBranch(String svnBranch) {
        this.svnBranch = svnBranch;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getAdminPort() {
        return adminPort;
    }

    public void setAdminPort(String adminPort) {
        this.adminPort = adminPort;
    }

    public String getAdminContext() {
        return adminContext;
    }

    public void setAdminContext(String adminContext) {
        this.adminContext = adminContext;
    }

    public String getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
    }

    
}
