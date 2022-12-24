import javax.swing.*;

public class MainProgram{
	public static void main (String[] args){
		
		JFrame jFrame;
		
		jFrame = new JFrame();
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
		
		JOptionPane.showMessageDialog(jFrame, "Hai, Apa Kabar?");
		
		String name =JOptionPane.showInputDialog(jFrame, "Nama Lengkap : ");
		while (name.isEmpty()){
			JOptionPane.showMessageDialog(jFrame, "Tolong Masukkan Nama Lengkap");
			name = JOptionPane.showInputDialog(jFrame, "Nama Lengkap :");
		}
		
		String yearStr = JOptionPane.showInputDialog(jFrame, "Tahun Lahir :");
		while (yearStr.isEmpty()) {
			JOptionPane.showMessageDialog(jFrame, "Tolong Masukkan Tahun Lahir");
			yearStr = JOptionPane.showInputDialog(jFrame, "Tahun Lahir :");
		}
		int year = Integer.parseInt(yearStr);
		int age = 2022 - year;
		
		JOptionPane.showMessageDialog(jFrame, "Halo " + name + ", umur anda " + age + " tahun.");
		jFrame.dispose();
		
		JOptionPane.showMessageDialog(null, "Sampai Jumpa");
		
	}
	
}