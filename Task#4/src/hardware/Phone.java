/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hardware;

/**
 *
 * @author redelyn
 */
public class Phone extends Hardware {

    public Phone(int id, String brand, int spec) {
        super(id, brand, spec);
    }

    @Override
    public String getType() {
        return "Phone";
    }

    @Override
    public String interpretSpec() {
        return spec + " Megapixels";
    }
}

