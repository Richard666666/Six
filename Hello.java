import javax.swing.JFrame;
import javax.swing.JButton;

class  Hello
{
	public static void main(String[] args) 
	{

		JFrame f=new JFrame();
		f.setTitle("big ball eat small ball");
		f.setSize(800,600);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);


		JButton b=new JButton("confirm");
		b.setBounds(300,500,100,200);
		f.add(b);


	}
}
