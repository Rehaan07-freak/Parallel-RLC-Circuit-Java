import java.util.Scanner;
public class Parallel_RLC {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input values
 System.out.print("Enter the resistance (Ohms): ");
 double resistance = scanner.nextDouble();
 System.out.print("Enter the inductance (Henries): ");
 double inductance = scanner.nextDouble();
 System.out.print("Enter the capacitance (Farads): ");
 double capacitance = scanner.nextDouble();
 System.out.print("Enter the frequency (Hz): ");
 double frequency = scanner.nextDouble();
 System.out.print("Enter the value of maximum current (Amps): ");
 double maxCurrent = scanner.nextDouble();
 scanner.close();
 // Calculate individual admittances
 double Y_r = 1.0 / resistance;
 double Y_l = 1.0 / (2 * Math.PI * frequency * inductance);
 double Y_c = 2 * Math.PI * frequency * capacitance;

 // Total admittance and impedance
 double Y_total = Y_r + Y_l + Y_c;
 double Z_total = 1.0 / Y_total;
 // RMS Voltage
 double Vrms = maxCurrent / Math.sqrt(2.0) * Z_total;
 // Currents in each branch
 double I_r = Vrms * Y_r;
 double I_l = Vrms * Y_l;
 double I_c = Vrms * Y_c;
 // Output results
 System.out.printf("\nCalculated Values:\n");
 System.out.printf("Total Admittance: %.6f S\n", Y_total);
 System.out.printf("Total Impedance: %.6f Ohms\n", Z_total);
 System.out.printf("Source RMS Voltage: %.6f V\n", Vrms);
 System.out.printf("Current through Resistor: %.6f A\n", I_r);
 System.out.printf("Current through Inductor: %.6f A\n", I_l);
 System.out.printf("Current through Capacitor: %.6f A\n", I_c);
 }
}