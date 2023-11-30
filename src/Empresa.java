import java.util.ArrayList;

public class Empresa {

    private String code;
    private String name;
    private String address;

    private ArrayList<Descuento> descuentoList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Descuento> getDescuentoList() {
        return descuentoList;
    }

    public void setDescuentoList(ArrayList<Descuento> descuentoList) {
        this.descuentoList = descuentoList;
    }

    public void add(Descuento descuento){
        descuentoList.add(descuento);
    }
}
