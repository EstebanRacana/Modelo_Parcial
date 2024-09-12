import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VTV todo = new VTV();
		int motor;
		do {
			motor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el motor: "));

		} while ((motor < 0));
		todo.setMotor(motor);
		int frenos;
		do {
			frenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para los frenos: "));

		} while ((frenos < 0));

		todo.setFrenos(frenos);

		int s_d_s;
		do {
			s_d_s = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para la suspension: "));
			;
		} while ((s_d_s < 0));
		todo.setSDS(s_d_s);
		JOptionPane.showMessageDialog(null, todo.verdadero_o_falso(motor, frenos, s_d_s));
        
	}

}
