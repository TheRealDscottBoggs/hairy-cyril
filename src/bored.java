import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bored extends JFrame
{
   private JCheckBox oil;
   private JCheckBox lube;
   private JCheckBox radiator;
   private JCheckBox transmission;
   private JCheckBox inspection;
   private JCheckBox muffler;
   private JCheckBox tire;
   private JLabel blank;
   private JLabel laborLabel;
   private JLabel partsLabel;
   private JTextField laborTextField;
   private JTextField partsTextField;
   private final int WINDOW_WIDTH = 500;
   private final int WINDOW_HEIGHT = 100;

   public bored()
   {
		setTitle("Fuck Joe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl = new GridLayout(7,2);
		JPanel panel = new JPanel();
		panel.setLayout(gl);
		oil				= new JCheckBox("Oil");
		lube			= new JCheckBox("Lube");
		radiator		= new JCheckBox("Radiator");
		transmission	= new JCheckBox("Transmission");
		inspection		= new JCheckBox("Inspection");
		muffler			= new JCheckBox("Muffler");
		tire			= new JCheckBox("Tire");
		blank           = new JLabel(" ");
		laborLabel		= new JLabel("Gay Labor");
		laborTextField	= new JTextField(3);
		partsLabel      = new JLabel("parts");
		partsTextField = new JTextField(3);
		JButton button1 = new JButton("Total");
		button1.addActionListener(new ButtonListener());
		panel.add(oil);
		panel.add(lube);
		panel.add(radiator);
		panel.add(transmission);
		panel.add(inspection);
		panel.add(muffler);
		panel.add(tire);
		panel.add(blank);
		panel.add(partsLabel);
		panel.add(partsTextField);
		panel.add(laborLabel);
		panel.add(laborTextField);
		panel.add(button1);
		add(panel);
		pack();
		setVisible(true);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String input;
			double nonRoutineCost;
			double subTotal = 0;
			if ( oil.isSelected() )				subTotal += 26;
			if ( lube.isSelected() )			subTotal += 18;
			if ( radiator.isSelected() )		subTotal += 30;
			if ( transmission.isSelected() )	subTotal += 80;
			if ( inspection.isSelected() )		subTotal += 15;
			if ( muffler.isSelected() )			subTotal += 100;
			if ( tire.isSelected() )			subTotal += 20;
			subTotal += Double.parseDouble(laborTextField.getText())*20;
			subTotal += Double.parseDouble(partsTextField.getText());
			JOptionPane.showMessageDialog(null, "GIVE ME $" + subTotal);
		}
	}
	public static void main(String[] args)
	{
	  new bored();
	}
}