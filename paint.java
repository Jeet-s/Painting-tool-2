import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class paint
{
public static void main(String[] args)
{
	Icon iconpencil = new ImageIcon("pencil.png");
	Icon iconerasor = new ImageIcon("erasor.png");
	Icon iconline = new ImageIcon("line.png");
	Icon iconbrush = new ImageIcon("brush.png");
	Icon iconrect = new ImageIcon("rect.png");
	Icon iconfillrect = new ImageIcon("fillrect.png");
	Icon iconoval = new ImageIcon("oval.png");
	Icon iconfiloval = new ImageIcon("filloval.png");
	Icon iconroundrect = new ImageIcon("roundrect.png");
	Icon iconpolygon = new ImageIcon("polygon.png");
	Icon iconarc = new ImageIcon("arc.png");
	Icon iconfillarc = new ImageIcon("fillarc.png");
	ImageIcon icon = new ImageIcon("Icon.png");
	JFrame frame = new JFrame("Painting tool");
	frame.setIconImage(icon.getImage());
	Container content = frame.getContentPane();
	content.setLayout(new BorderLayout());
	DrawArea da= new DrawArea();	
	content.add(da, BorderLayout.CENTER);
	JPanel panel = new JPanel();
	panel.setLayout(null);
	panel.setPreferredSize(new Dimension(200,300));
	JButton clearButton = new JButton("CLEAR");
	Font f = new Font("Arial",Font.PLAIN,15);
	clearButton.setFont(f);
	clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.clear();
				}
				});
	JButton brushButton = new JButton(iconbrush);
	brushButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.brush();
				}
				});
	JButton eraseButton = new JButton(iconerasor);
	eraseButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.erase();
				}
				});
	JButton rectButton = new JButton(iconrect);
	rectButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.rect();
				}
				});
	JButton roundRectButton = new JButton(iconroundrect);
	roundRectButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.roundRect();
				}
				});
	JButton rect2Button = new JButton(iconfillrect);
	rect2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.rect2();
				}
				});
	JButton ovalButton = new JButton(iconoval);
	ovalButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.oval();
				}
				});
	JButton oval2Button = new JButton(iconfiloval);
	oval2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.oval2();
				}
				});
		JButton penButton = new JButton(iconpencil);
		penButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.pen();
				}
				});
		JButton lineButton = new JButton(iconline);
		lineButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.line();
				}
				});
		JButton polygonButton = new JButton(iconpolygon);
		polygonButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.polygon();
				}
				});
		JButton arcButton = new JButton(iconarc);
		arcButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.arc();
				}
				});
		JButton fillarcButton = new JButton(iconfillarc);
		fillarcButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.fillarc();
				}
				});
		
		JButton thinButton = new JButton("1");
		thinButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.thin();
				}
				});
		JButton thickButton = new JButton("20");
		thickButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.thick();
				}
				});
		JButton mediumButton = new JButton("7");
		mediumButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.medium();
				}
				});
		JButton redButton = new JButton();
		redButton.setBackground(Color.red);
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.red();
				}
				});
		JButton blackButton = new JButton();
		blackButton.setBackground(Color.black);
		blackButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.black();
				}
				});
		JButton magentaButton = new JButton();
		magentaButton.setBackground(Color.magenta);
		magentaButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.magenta();
				}
				});
		JButton blueButton = new JButton();
		blueButton.setBackground(Color.blue);
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.blue();
				}
				});
		JButton greenButton = new JButton();
		greenButton.setBackground(Color.green);
		greenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.green();
				}
				});
		JButton greyButton = new JButton();
		greyButton.setBackground(Color.gray);
		greyButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.grey();
				}
				});
		JButton whiteButton = new JButton();
		whiteButton.setBackground(Color.white);
		whiteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.white();
				}
				});
		JButton yellowButton = new JButton();
		yellowButton.setBackground(Color.yellow);
		yellowButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.yellow();
				}
				});
		JButton orangeButton = new JButton();
		orangeButton.setBackground(Color.orange);
		orangeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.orange();
				}
				});
		JButton cyanButton = new JButton();
		cyanButton.setBackground(Color.cyan);
		cyanButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.cyan();
				}
				});
		JButton pinkButton = new JButton();
		pinkButton.setBackground(Color.pink);
		pinkButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.pink();
				}
				});
		JButton brownButton = new JButton();
		brownButton.setBackground(new Color(163,101,67));
		brownButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.brown();
				}
				});
		JButton darkgreenButton = new JButton();
		darkgreenButton.setBackground(new Color(0,121,0));
		darkgreenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.darkgreen();
				}
				});
		JButton purpleButton = new JButton();
		purpleButton.setBackground(new Color(197,138,255));
		purpleButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.purple();
				}
				});		
		JButton skyblueButton = new JButton();
		skyblueButton.setBackground(new Color(138,197,255));
		skyblueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.skyBlue();
				}
				});		
		JButton orange2Button = new JButton();
		orange2Button.setBackground(new Color(250,101,29));
		orange2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.orange2();
				}
				});
		JButton red2Button = new JButton();
		red2Button.setBackground(new Color(255,72,72));
		red2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.red2();
				}
				});
		JButton blue2Button = new JButton();
		blue2Button.setBackground(new Color(0,187,187));
		blue2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.Blue2();
				}
				});		
		JButton brown2Button = new JButton();
		brown2Button.setBackground(new Color(91,46,0));
		brown2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.brown2();
				}
				});
		JButton green2Button = new JButton();
		green2Button.setBackground(new Color(128,128,0));
		green2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				da.green2();
				}
				});
		JLabel size = new JLabel("Size :- ");
		blackButton.setBounds(5,530,30,30);
		magentaButton.setBounds(5,610,30,30);
		redButton.setBounds(45,570,30,30);
		blueButton.setBounds(85,570,30,30);
		greenButton.setBounds(165,570,30,30);
		greyButton.setBounds(45,530,30,30);
		whiteButton.setBounds(85,530,30,30);
		yellowButton.setBounds(5,570,30,30);
		orangeButton.setBounds(125,570,30,30);
		cyanButton.setBounds(125,530,30,30);
		pinkButton.setBounds(165,530,30,30);
		brownButton.setBounds(45,610,30,30);
		darkgreenButton.setBounds(85,610,30,30);
		skyblueButton.setBounds(125,610,30,30);
		purpleButton.setBounds(165,610,30,30);
		orange2Button.setBounds(5,650,30,30);
		red2Button.setBounds(45,650,30,30);
		blue2Button.setBounds(85,650,30,30);
		brown2Button.setBounds(125,650,30,30);
		green2Button.setBounds(165,650,30,30);
		clearButton.setBounds(25,490,150,30);
		brushButton.setBounds(105,95,70,60);
		eraseButton.setBounds(105,25,70,60);
		lineButton.setBounds(25,95,70,60);
		rectButton.setBounds(25,165,70,60);
		rect2Button.setBounds(105,165,70,60);
		penButton.setBounds(25,25,70,60);
		ovalButton.setBounds(25,235,70,60);
		roundRectButton.setBounds(25,305,70,60);
		oval2Button.setBounds(105,235,70,60);
		polygonButton.setBounds(105,305,70,60);
		arcButton.setBounds(25,375,70,60);
		fillarcButton.setBounds(105,375,70,60);
		thinButton.setBounds(25,460,48,20);
		thickButton.setBounds(127,460,48,20);
		mediumButton.setBounds(76,460,48,20);
		size.setBounds(25,440,100,20);
		panel.add(clearButton);
		panel.add(eraseButton);
		panel.add(penButton);
		panel.add(lineButton);
		panel.add(rectButton);
		panel.add(rect2Button);
		panel.add(ovalButton);
		panel.add(oval2Button);
		panel.add(brushButton);
		panel.add(roundRectButton);
		panel.add(polygonButton);
		panel.add(arcButton);
		panel.add(fillarcButton);
		panel.add(thinButton);
		panel.add(mediumButton);
		panel.add(thickButton);
		panel.add(size);		
		panel.add(blackButton);
		panel.add(greyButton);
		panel.add(whiteButton);
		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(cyanButton);
		panel.add(magentaButton);
		panel.add(pinkButton);
		panel.add(orangeButton);
		panel.add(yellowButton);
		panel.add(brownButton);
	    panel.add(darkgreenButton);
		panel.add(skyblueButton);
		panel.add(purpleButton);
		panel.add(orange2Button);
		panel.add(red2Button);
		panel.add(blue2Button);
		panel.add(brown2Button);
		panel.add(green2Button);
		content.add(panel, BorderLayout.WEST);
		frame.setSize(1030, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class DrawArea extends JComponent
{
	Image image;
	Graphics2D graphics2D;
	public int currentX, currentY, oldX, oldY,x1,y1,x2,y2,w,h,a1,a2,b1,b2,c1,d1,c2,d2,e1,f1,e2,f2,r1,s1,ch,m1,n1,fl,k1,k2=1,cc1,dd1,cc2,dd2,aa1,aa2,bb1,bb2,brs1,brs2,bre1,bre2,ra1,ra2,rb1,rb2,ara1,ara2,arb1,arb2,fara1,fara2,farb1,farb2;
	public void pen()
	{
		k1=1;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				oldX = e.getX();
				oldY = e.getY();
				}
				});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				currentX = e.getX();
				currentY = e.getY();
				if(graphics2D != null && k1==1)
				graphics2D.drawLine(oldX, oldY, currentX,currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
				repaint();
				}
				});
	}
	public void line()
	{
		k1=2;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				x1=m.getX();
				y1=m.getY();
			}
			public void mouseReleased(MouseEvent m)
			{
				x2=m.getX();
				y2=m.getY();
				if(graphics2D != null && k1==2)
				graphics2D.drawLine(x1,y1, x2,y2);
				repaint();
			}
			});
	}
	public void rect()
	{
		k1=3;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				a1=m.getX();
				b1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				a2=m.getX();
				b2=m.getY();
				if (a1>a2)
				{
					int z=a1;
					a1=a2;
					a2=z;
				}
				if (b1>b2)
				{
					int z=b1;
					b1=b2;
					b2=z;
				}
				w=a2-a1;
				h=b2-b1;
				if(graphics2D != null && k1==3)
				graphics2D.drawRect(a1,b1, w,h);
				repaint();
			}
			});
	}
	public void roundRect()
	{
		k1=9;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				ra1=m.getX();
				rb1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				ra2=m.getX();
				rb2=m.getY();
				if (ra1>ra2)
				{
					int z=ra1;
					ra1=ra2;
					ra2=z;
				}
				if (rb1>rb2)
				{
					int z=rb1;
					rb1=rb2;
					rb2=z;
				}
				w=ra2-ra1;
				h=rb2-rb1;
				if(graphics2D != null && k1==9)
				graphics2D.drawRoundRect(ra1,rb1, w,h,(w+h)/6,(w+h)/6);
				repaint();
			}
			});
	}
	public void rect2()
	{
		k1=4;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				aa1=m.getX();
				bb1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				aa2=m.getX();
				bb2=m.getY();
				if (aa1>aa2)
				{
					int z=aa1;
					aa1=aa2;
					aa2=z;
				}
				if (bb1>bb2)
				{
					int z=bb1;
					bb1=bb2;
					bb2=z;
				}
				w=aa2-aa1;
				h=bb2-bb1;
				if(graphics2D != null && k1==4)
			    graphics2D.fillRect(aa1,bb1, w,h);
				repaint();
			}
			});
	}
	public void oval()
	{
		k1=5;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				c1=e.getX();
				d1=e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e)
			{
				c2=e.getX();
				d2=e.getY();
				if (c1>c2)
				{
					int z=c1;
					c1=c2;
					c2=z;
				}
				if (d1>d2)
				{
					int z=d1;
					d1=d2;
					d2=z;
				}
				w=c2-c1;
				h=d2-d1;
				if(graphics2D != null && k1==5)
				graphics2D.drawOval(c1,d1,w,h);
				repaint();
			}
			});
	}
	public void oval2()
	{
		k1=6;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				cc1=m.getX();
				dd1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				cc2=m.getX();
				dd2=m.getY();
				if (cc1>cc2)
				{
					int z=cc1;
					cc1=cc2;
					cc2=z;
				}
				if (dd1>dd2)
				{
					int z=dd1;
					dd1=dd2;
					dd2=z;
				}
				w=cc2-cc1;
				h=dd2-dd1;
				if(graphics2D != null && k1==6)
				graphics2D.fillOval(cc1,dd1, w,h);
				repaint();
				}
				});
	}
	public void polygon()
	{
		k1=10;
		k2=1;
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent m)
			{
				x1=m.getX();
				y1=m.getY();
			}
			final int r1=x1;
			final int s1=y1;
			public void mouseReleased(MouseEvent m)
			{
				x2=m.getX();
				y2=m.getY();
				if (x2==r1 && y2==s1)
				{
					graphics2D.drawLine(m1,n1, r1,s1);
					return;
				}
				else
				{
					if(graphics2D != null && k1==10 && k2==1)
						graphics2D.drawLine(x1,y1, x2,y2);
					if(graphics2D != null && k1==10 && k2!=1)
						graphics2D.drawLine(m1,n1, x2,y2);
					repaint();
					m1=x2;
					n1=y2;
					k2++;
				}
			}
		});
	}
	public void arc()
	{
		k1=11;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				ara1=m.getX();
				arb1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				ara2=m.getX();
				arb2=m.getY();
				if (ara1>ara2)
				{
					int z=ara1;
					ara1=ara2;
					ara2=z;
				}
				if (arb1>arb2)
				{
					int z=arb1;
					arb1=arb2;
					arb2=z;
				}
				w=ara2-ara1;
				h=arb2-arb1;
				if(graphics2D != null && k1==11)
				graphics2D.drawArc(ara1,arb1, w,h,0,180);
				repaint();
			}
			});
	}
	public void fillarc()
	{
		k1=12;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent m)
			{
				fara1=m.getX();
				farb1=m.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent m)
			{
				fara2=m.getX();
				farb2=m.getY();
				if (fara1>fara2)
				{
					int z=fara1;
					fara1=fara2;
					fara2=z;
				}
				if (farb1>farb2)
				{
					int z=farb1;
					farb1=farb2;
					farb2=z;
				}
				w=fara2-fara1;
				h=farb2-farb1;
				if(graphics2D != null && k1==12)
				graphics2D.fillArc(fara1,farb1, w,h,0,180);
				repaint();
			}
			});
	}
	public void paintComponent(Graphics g)
	{
		if(image == null)
		{
			image = createImage(getSize().width, getSize().height);
			graphics2D = (Graphics2D)image.getGraphics();
			graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		g.drawImage(image, 0, 0, null);
	}
	public void clear()
	{
		graphics2D.setPaint(Color.white);
		graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		graphics2D.setPaint(Color.black);
		repaint();
	}
	public void erase()
	{
		k1=7;
		graphics2D.setPaint(Color.white);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				e1 = e.getX();
				f1 = e.getY();
				if(graphics2D != null && k1==7)
				graphics2D.fillRect(e1, f1, 40, 40);
				}
				});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				e2 = e.getX();
				f2 = e.getY();
				if(graphics2D != null && k1==7)
				graphics2D.fillRect(e1, f1, 40, 40);
				repaint();
				e1 = e2;
				f1 = f2;
				}
				});
	}
	public void brush()
	{
		k1=8;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				brs1 = e.getX();
				brs2 = e.getY();
				if(graphics2D != null && k1==8)
				graphics2D.fillOval(brs1, brs2, 25, 25);
				}
				});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				bre1 = e.getX();
				bre2 = e.getY();
				if(graphics2D != null && k1==8)
				graphics2D.fillOval(brs1, brs2, 25, 25);
				repaint();
				brs1 = bre1;
				brs2 = bre2;
				}
				});
	}
		public void thick(){
			graphics2D.setStroke(new BasicStroke (20));
			}
		public void thin(){
			graphics2D.setStroke(new BasicStroke (1));
			}
		public void medium(){
			graphics2D.setStroke(new BasicStroke (7));
			}
		public void red(){
			graphics2D.setPaint(Color.red);
			repaint();
			}
		public void black(){
			graphics2D.setPaint(Color.black);
			repaint();
			}
		public void magenta(){
			graphics2D.setPaint(Color.magenta);
			repaint();
			}
		public void blue(){
			graphics2D.setPaint(Color.blue);
			repaint();
			}
		public void green(){
			graphics2D.setPaint(Color.green);
			repaint();
			}
		public void yellow(){
			graphics2D.setPaint(Color.yellow);
			repaint();
			}
		public void grey(){
			graphics2D.setPaint(Color.gray);
			repaint();
			}
		public void white(){
			graphics2D.setPaint(Color.white);
			repaint();
			}
		public void orange(){
			graphics2D.setPaint(Color.orange);
			repaint();
			}
		public void cyan(){
			graphics2D.setPaint(Color.cyan);
			repaint();
			}
		public void pink(){
			graphics2D.setPaint(Color.pink);
			repaint();
			}
		public void brown(){
			graphics2D.setPaint(new Color(163,101,67));
			repaint();
			}
		public void darkgreen(){
			graphics2D.setPaint(new Color(0,121,0));
			repaint();
			}
		public void purple(){
			graphics2D.setPaint(new Color(197,138,255));
			repaint();
			}
	    public void skyBlue(){
			graphics2D.setPaint(new Color(138,197,255));
			repaint();
			}
		public void orange2(){
			graphics2D.setPaint(new Color(250,101,29));
			repaint();
			}
		public void red2(){
			graphics2D.setPaint(new Color(255,72,72));
			repaint();
			}
	      public void Blue2(){
			graphics2D.setPaint(new Color(0,187,187));
			repaint();
			}
		public void brown2(){
			graphics2D.setPaint(new Color(91,46,0));
			repaint();
			}
		public void green2(){
			graphics2D.setPaint(new Color(128,128,0));
			repaint();
			}
}