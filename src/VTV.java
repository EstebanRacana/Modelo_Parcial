import java.time.LocalDate;

import javax.swing.JOptionPane;

public class VTV {
    private int motor;
    private int frenos;
    private int s_d_s;
    private String registro;
    
public void setMotor(int motor) {
	
	this.motor=motor;
}
public int getMotor() {
	return this.motor;
}
public void setFrenos(int frenos) {
	this.frenos=frenos;
}
public int getFrenos() {
	return this.frenos;
}
public void setSDS(int s_d_s) {
	this.s_d_s = s_d_s;
}
public int getSDS() {
	return this.s_d_s;
}
public void Registro(String registro)
{
	LocalDate fecha = LocalDate.now();
	this.registro=registro+fecha.plusYears(1);
	JOptionPane.showMessageDialog(null, fecha);
}
public String getRegistro() {
	return this.registro;
}


public boolean verdadero_o_falso(int motor, int frenos, int s_d_s) {
	if(motor<0 || motor<70 || motor>100 ) {
		JOptionPane.showMessageDialog(null, "No valido, el motor tiene menos del 70% o por encima del 100% o esta por debajo del estandar, necesita reparaciones");
	    return false;
}   else if(frenos<0 || frenos<70 || frenos>100){
	 JOptionPane.showMessageDialog(null, "No valido, los frenenos tiene menos del 70% o por encima del 100% esta por debajo del estandar, necesita reparaciones");
	 return false;
	
}else if(s_d_s<0 || s_d_s<70 || s_d_s>100) {
	JOptionPane.showMessageDialog(null, "No valido, el sistema de suspension tiene menos del 70% o por encima del 100% o esta por debajo del estandar, necesita reparaciones");
	return false;
}else {
	JOptionPane.showMessageDialog(null, "Felicidades, pasaste para VTV");
	return true;
}		
}
}
//Problema para mostrar el registro osea fecha de la VTV



