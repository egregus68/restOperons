/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gregus.restoperons.model;

/**
 *
 * @author Grzegorz
 */
public enum EnvironmentType {

    DEVELOPMENT("Rozwojowe"),
    PRODUCTION("Produkcyjne");

    private final String name;

    private EnvironmentType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
;
}
