import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VTV motores = new VTV();
		int motor;
		do {
			motor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el motor: "));

		} while ((motor < 0));
		motores.setMotor(motor);
		int frenos;
		VTV freno = new VTV();
		do {
			frenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para los frenos: "));

		} while ((frenos < 0));

		freno.setFrenos(frenos);

		int s_d_s;
		do {
			s_d_s = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para la suspension: "));
			;
		} while ((s_d_s < 0));
		motores.setSDS(s_d_s);
		JOptionPane.showMessageDialog(null, motores);

	}

}
