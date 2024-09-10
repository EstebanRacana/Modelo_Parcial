import java.time.LocalDate;

import javax.swing.JOptionPane;

public class VTV {
    private int motor;
    private int frenos;
    private int s_d_s;
    
public void setMotor(int motor) {
	LocalDate fecha = LocalDate.now();
	fecha.plusYears(1);
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
public boolean verdadero_o_falso(int motor, int frenos, int s_d_s) {
	if(motor<0 || motor<70 || frenos<0 || frenos<70 || s_d_s<0 || s_d_s<70) {
	    return false;
}   else {
	 JOptionPane.showMessageDialog(null, "Feliciades");
	 return true;
	
}
		
	}
@Override
public String toString() {
	return "VTV [motor=" + motor + ", frenos=" + frenos + ", s_d_s=" + s_d_s + "]";
}
}



