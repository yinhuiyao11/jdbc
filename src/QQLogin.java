import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class QQLogin extends JFrame implements ActionListener{
	
	
	public QQLogin(){
		//���ô�������
		this.setSize(500 ,500);
		this.setLocation(400, 300);
		this.setTitle("ѧ����Ϣ����ϵͳ");
		
		//newһ������
		JLabel labNum = new JLabel("ѧ�ţ�") ;
		JLabel labName = new JLabel("������") ;
		JLabel labSex = new JLabel("�Ա�") ;
		JLabel labAddress = new JLabel("��ַ��") ;
		JLabel labPhone = new JLabel("�绰��") ;
		JLabel labMajor = new JLabel("רҵ��") ;

		JButton btnLogin = new JButton("��Ϣ¼��") ;
		JButton btnQuery = new JButton("��Ϣ��ѯ") ;
		JButton btnUpdate = new JButton("��Ϣ����") ;
		JButton btnCancel = new JButton("��Ϣɾ��") ;
		JButton btnBack = new JButton("�˳�ϵͳ") ;
		JButton btnEnter=new JButton("¼��");
		JButton btnReset=new  JButton("����");
		
		JTextField txtNum = new JTextField() ;
		JTextField txtName = new JTextField() ;
		JTextField txtSex = new JTextField() ;
		JTextField txtAddress = new JTextField() ;
		JTextField txtPhone = new JTextField() ;
		JTextField txtMajor = new JTextField() ;

		JTextField txtUser = new JTextField() ;




		//ע���¼�
		btnLogin.addActionListener(this); 
		btnQuery.addActionListener(this); 
		btnCancel.addActionListener(this);
		
		//�����������
		JPanel panInput = new JPanel() ;
		panInput.setLayout(new GridLayout(6,1));
		
		panInput.add(labNum) ;
		panInput.add(txtNum) ;
		
		panInput.add(labName) ;
		panInput.add(txtName) ;
		
		panInput.add(labSex) ;
		panInput.add(txtSex) ;
		
		panInput.add(labAddress) ;
		panInput.add(txtAddress) ;
		
		panInput.add(labPhone) ;
		panInput.add(txtPhone) ;
		
		panInput.add(labMajor) ;
		panInput.add(txtMajor) ;
		
		//���ð�ť���
		JPanel panButton = new JPanel() ;
		panButton.setLayout(new FlowLayout());
		
		panButton.add(btnLogin) ;
		panButton.add(btnQuery) ;
		panButton.add(btnUpdate) ;
		panButton.add(btnCancel) ;
		panButton.add(btnBack) ;

		//��������İ�ť���
		JPanel panButton_South=new JPanel();
		panButton.setLayout(new FlowLayout());
		
		panButton.add(btnEnter);
		panButton.add(btnReset);
		
		//�������ݺͰ�ť���
		JPanel texButton=new JPanel();
		texButton.setLayout(new BorderLayout());
		
		texButton.add(panInput,BorderLayout.CENTER);
		texButton.add(panButton_South,BorderLayout.SOUTH);
		//���ô���
		this.setLayout(new BorderLayout());
		
		this.add(panButton, BorderLayout.NORTH) ;
		//this.add(panInput , BorderLayout.) ;
		//this.add(panButton_South,BorderLayout.SOUTH);
		this.add(texButton,BorderLayout.CENTER);


	}
	public static void main(String args[]){
		QQLogin w = new QQLogin() ;
        w.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}