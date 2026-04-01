/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hardware;

/**
 *
 * @author redelyn
 */
public class Laptop extends Hardware {

    public Laptop(int id, String brand, int spec) {
        super(id, brand, spec);
    }

    @Override
    public String getType() {
        return "Laptop";
    }

    @Override
    public String interpretSpec() {
        return spec + "GB RAM";
    }
}

