/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hardware;

/**
 *
 * @author redelyn
 */
public class Hardware {
    protected int id;
    protected String brand;
    protected int spec;

    public Hardware(int id, String brand, int spec) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
    }

    public int getSpec() {
        return spec;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return "Unknown";
    }

    public String interpretSpec() {
        return spec + "";
    }
}

