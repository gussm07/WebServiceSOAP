
package WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Calculadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Calculadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dato1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dato2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calculadora", propOrder = {
    "dato1",
    "dato2",
    "operador"
})
public class Calculadora_Type {

    protected int dato1;
    protected int dato2;
    protected int operador;

    /**
     * Obtiene el valor de la propiedad dato1.
     * 
     */
    public int getDato1() {
        return dato1;
    }

    /**
     * Define el valor de la propiedad dato1.
     * 
     */
    public void setDato1(int value) {
        this.dato1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dato2.
     * 
     */
    public int getDato2() {
        return dato2;
    }

    /**
     * Define el valor de la propiedad dato2.
     * 
     */
    public void setDato2(int value) {
        this.dato2 = value;
    }

    /**
     * Obtiene el valor de la propiedad operador.
     * 
     */
    public int getOperador() {
        return operador;
    }

    /**
     * Define el valor de la propiedad operador.
     * 
     */
    public void setOperador(int value) {
        this.operador = value;
    }

}
