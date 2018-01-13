import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;

public class SearchPage extends JFrame {
	
	public static int WIDTH = 1100;
	public static int HEIGHT = 600;	
	
	static Point compCoords;
	
	public SearchPage(String username) {
		Font myFont = new Font("Calibri", Font.BOLD, 18);
		
		Color grayColor = new Color(31, 33, 35);		
		Color dashboardColor = new Color(32, 33, 38);
		Color dashboardOptionColor = new Color(45, 45, 45);
		Color dashboardFontColor = new Color(188, 188, 188);
		Color searchAreaColor = new Color(45, 49, 58);	//(45, 51, 66)
		
		setUndecorated(true);
		setSize(WIDTH, HEIGHT);
			
		setLayout(new BorderLayout());
		
		JPanel dashboard = new JPanel();
		dashboard.setLayout(new BorderLayout());
		dashboard.setBackground(dashboardColor);
		//dashboard.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));			// T L B R
		
		JLabel dashboardtitle = new JLabel("    Dashboard                             ");
		dashboardtitle.setForeground(new Color(52, 73, 99));
		dashboardtitle.setFont(myFont);
		
		dashboard.add(dashboardtitle, BorderLayout.NORTH);
		
		JPanel websiteContainer = new JPanel();
		websiteContainer.setLayout(new BoxLayout(websiteContainer, BoxLayout.PAGE_AXIS));
		websiteContainer.setBackground(dashboardColor);		
		
		JButton googleBtn = new JButton("Google");
		googleBtn.setMaximumSize(new Dimension(1000, 25));
		googleBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		googleBtn.setBackground(dashboardOptionColor);
		googleBtn.setForeground(dashboardFontColor);
		googleBtn.setFocusPainted(false);
		
		JButton youtubeBtn = new JButton("Youtube");
		youtubeBtn.setMaximumSize(new Dimension(1000, 25));
		youtubeBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		youtubeBtn.setBackground(dashboardOptionColor);
		youtubeBtn.setForeground(dashboardFontColor);
		youtubeBtn.setFocusPainted(false);
		
		JButton steamBtn = new JButton("Steam");
		steamBtn.setMaximumSize(new Dimension(1000, 25));
		steamBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		steamBtn.setBackground(dashboardOptionColor);
		steamBtn.setForeground(dashboardFontColor);
		steamBtn.setFocusPainted(false);
		
		JButton amazonBtn = new JButton("Amazon");
		amazonBtn.setMaximumSize(new Dimension(1000, 25));
		amazonBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		amazonBtn.setBackground(dashboardOptionColor);
		amazonBtn.setForeground(dashboardFontColor);
		amazonBtn.setFocusPainted(false);
		
		JButton redditBtn = new JButton("Reddit");
		redditBtn.setMaximumSize(new Dimension(1000, 25));
		redditBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		redditBtn.setBackground(dashboardOptionColor);
		redditBtn.setForeground(dashboardFontColor);
		redditBtn.setFocusPainted(false);
		
		JButton wikiBtn = new JButton("Wikipedia");
		wikiBtn.setMaximumSize(new Dimension(1000, 25));
		wikiBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		wikiBtn.setBackground(dashboardOptionColor);
		wikiBtn.setForeground(dashboardFontColor);
		wikiBtn.setFocusPainted(false);
		
		JButton kijijiBtn = new JButton("Kijiji");
		kijijiBtn.setMaximumSize(new Dimension(1000, 25));
		kijijiBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		kijijiBtn.setBackground(dashboardOptionColor);
		kijijiBtn.setForeground(dashboardFontColor);
		kijijiBtn.setFocusPainted(false);
		
		JButton bingBtn = new JButton("Bing");
		bingBtn.setMaximumSize(new Dimension(1000, 25));
		bingBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		bingBtn.setBackground(dashboardOptionColor);
		bingBtn.setForeground(dashboardFontColor);
		bingBtn.setFocusPainted(false);
		
		JButton yahooBtn = new JButton("Yahoo");
		yahooBtn.setMaximumSize(new Dimension(1000, 25));
		yahooBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		yahooBtn.setBackground(dashboardOptionColor);
		yahooBtn.setForeground(dashboardFontColor);
		yahooBtn.setFocusPainted(false);
		
		JButton neweggBtn = new JButton("Newegg");
		neweggBtn.setMaximumSize(new Dimension(1000, 25));
		neweggBtn.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(89, 89, 89)));
		neweggBtn.setBackground(dashboardOptionColor);
		neweggBtn.setForeground(dashboardFontColor);
		neweggBtn.setFocusPainted(false);
		
		websiteContainer.add(googleBtn);
		websiteContainer.add(youtubeBtn);
		websiteContainer.add(steamBtn);
		websiteContainer.add(amazonBtn);
		websiteContainer.add(redditBtn);
		websiteContainer.add(wikiBtn);
		websiteContainer.add(kijijiBtn);
		websiteContainer.add(bingBtn);
		websiteContainer.add(yahooBtn);
		websiteContainer.add(neweggBtn);
		
		dashboard.add(websiteContainer, BorderLayout.CENTER);
		
		JPanel nameContainer = new JPanel();
		nameContainer.setLayout(new BoxLayout(nameContainer, BoxLayout.X_AXIS));
		nameContainer.setBackground(new Color(56, 56, 56));		
		
		JLabel nameLbl = new JLabel(username);
		nameLbl.setForeground(new Color(186, 186, 186));
		nameLbl.setFont(new Font("Calibri", Font.BOLD, 18));
		
		nameContainer.add(Box.createHorizontalGlue());
		nameContainer.add(nameLbl);
		nameContainer.add(Box.createHorizontalGlue());	
	
		
		dashboard.add(nameContainer, BorderLayout.SOUTH);
				
		add(dashboard, BorderLayout.WEST);
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(grayColor);
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
		
		JLabel usLabel = new JLabel("   " + "Ultimate Search");
		usLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		usLabel.setForeground(new Color(183, 94, 0));
		northPanel.add(usLabel);
		
		northPanel.add(Box.createHorizontalStrut(80));
		
		JLabel websiteTitle = new JLabel("Google");
		websiteTitle.setForeground(new Color(79, 79, 79));
		northPanel.add(websiteTitle);		
		
		//Close and Minimize button Panel
		JPanel windowButtons = new JPanel();
		windowButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		windowButtons.setBackground(grayColor);	
		
		compCoords = null;
		northPanel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				
			}

			public void mousePressed(MouseEvent e) {
				compCoords = e.getPoint();
			}

			public void mouseReleased(MouseEvent e) {
				compCoords = null;
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
		});
		northPanel.addMouseMotionListener(new MouseMotionListener() {

			public void mouseDragged(MouseEvent e) {
				Point currCoords = e.getLocationOnScreen();
				setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
			}

			public void mouseMoved(MouseEvent e) {

			}
		});
		
		
		//Close Button
		JButton close = new JButton("X");
		close.setBackground(new Color(65, 65, 65));
		close.setForeground(Color.WHITE);
		close.setOpaque(true);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		//close.setContentAreaFilled(false);

		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//Minimize Button
		JButton minimize = new JButton("—");
		minimize.setBackground(new Color(65, 65, 65));
		minimize.setForeground(Color.WHITE);
		minimize.setOpaque(true);
		minimize.setBorderPainted(false);
		minimize.setFocusPainted(false);
		//minimize.setContentAreaFilled(false);
		minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		
		windowButtons.add(minimize);
		windowButtons.add(close);
		northPanel.add(windowButtons);
		
		add(northPanel, BorderLayout.NORTH);
		
		JPanel searchArea = new JPanel();
		searchArea.setLayout(new BoxLayout(searchArea, BoxLayout.Y_AXIS));
		searchArea.setBackground(searchAreaColor);	//new Color(84, 84, 84)
		
		//searchArea.add(Box.createVerticalStrut(0));
		
		JPanel websiteBanner = new JPanel();
		websiteBanner.setLayout(new BoxLayout(websiteBanner, BoxLayout.X_AXIS));
		websiteBanner.setBackground(searchAreaColor);		//new Color(84, 84, 84)
		
		websiteBanner.add(Box.createHorizontalStrut(40));		// gap between dashboard and logo
		
		URL url = Main.class.getResource("/google.png");
		ImageIcon image = new ImageIcon(url);
		JLabel imgContainer = new JLabel("", image, JLabel.CENTER);		
		//JPanel imgPanel = new JPanel(new BorderLayout());
		//imgPanel.add(imgContainer, BorderLayout.CENTER);
		
		websiteBanner.add(imgContainer);		
		websiteBanner.add(Box.createHorizontalStrut(40));	//gap between logo and info			
		
		String text = "<html>Google is an American multinational technology company specializing in Internet-related services and products. These include online advertising technologies, search, cloud computing, software, and hardware. Google was founded in 1998 by Larry Page and Sergey Brin while they were Ph.D. students at Stanford University, in California.</html>";
		
		JLabel textLbl = new JLabel(text);		
		textLbl.setForeground(dashboardFontColor);
		websiteBanner.add(textLbl);
		websiteBanner.add(Box.createHorizontalStrut(30));
		
		searchArea.add(websiteBanner);		
		
		JTextField searchBar = new JTextField();
		searchBar.setMaximumSize(new Dimension(700, 30));
		searchBar.setForeground(Color.WHITE);
		searchBar.setBackground(grayColor); 	// grayColor
		searchBar.setFont(myFont);
		searchBar.setCaretColor(Color.WHITE);
		//searchBar.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		
		searchArea.add(searchBar);
		searchArea.add(Box.createRigidArea(new Dimension(0,10)));

		JPanel searchBtnPanel = new JPanel();
		searchBtnPanel.setBackground(searchAreaColor);	//new Color(30, 30, 30)
		searchBtnPanel.setLayout(new BoxLayout(searchBtnPanel, BoxLayout.X_AXIS));
		
		JButton searchBtn = new JButton("Search");
		searchBtn.setMaximumSize(new Dimension(10000, 40));
		searchBtn.setBackground(new Color(229, 118, 0));
		searchBtn.setFocusPainted(false);
		searchBtn.setBorderPainted(false);

		searchBtnPanel.add(Box.createHorizontalGlue());
		searchBtnPanel.add(searchBtn);
		searchBtnPanel.add(Box.createHorizontalGlue());		
		
		searchArea.add(searchBtnPanel);
		
		searchArea.add(Box.createVerticalGlue());
		searchArea.add(Box.createHorizontalStrut(600));			
		
		add(searchArea, BorderLayout.CENTER);
		
		
		// Button functionality
		googleBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Google");
				URL url = Main.class.getResource("/google.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Google is an American multinational technology company specializing in Internet-related services and products. These include online advertising technologies, search, cloud computing, software, and hardware. Google was founded in 1998 by Larry Page and Sergey Brin while they were Ph.D. students at Stanford University, in California.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		youtubeBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Youtube");
				URL url = Main.class.getResource("/youtube.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>YouTube is an American video-sharing website headquartered in San Bruno, California. The service was created by three former PayPal employees – Chad Hurley, Steve Chen, and Jawed Karim – in February 2005. Google bought the site in November 2006 for US$1.65 billion; YouTube now operates as one of Google's subsidiaries.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		steamBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Steam");
				URL url = Main.class.getResource("/steam.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Steam is a digital distribution platform developed by Valve Corporation, which offers digital rights management (DRM), multiplayer gaming, video streaming and social networking services. Steam provides the user with installation and automatic updating of games, and community features such as friends lists and groups, cloud saving, and in-game voice and chat functionality.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		amazonBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Amazon");
				URL url = Main.class.getResource("/amazon.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Amazon.com, commonly known as Amazon, is an American electronic commerce and cloud computing company that was founded on July 5, 1994, by Jeff Bezos and is based in Seattle, Washington. It is the largest Internet-based retailer in the world by total sales and market capitalization. Amazon.com started as an online bookstore, later diversifying to sell DVDs, Blu-rays, CDs, video downloads/streaming, MP3 downloads/streaming, audiobook downloads/streaming, software, video games, electronics, apparel, furniture, food, toys, and jewelry.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		redditBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Reddit");
				URL url = Main.class.getResource("/reddit.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Reddit is an American social news aggregation, web content rating, and discussion website. Reddit's registered community members can submit content such as text posts or direct links. Registered users can then vote submissions up or down that determines their position on the page. Submissions with the most up-votes appear on the front page or the top of a category. </html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		wikiBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Wikipedia");
				URL url = Main.class.getResource("/wiki.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Wikipedia is a free online encyclopedia with the aim to allow anyone to edit articles. Wikipedia is the largest and most popular general reference work on the Internet and is ranked among the ten most popular websites. Wikipedia is owned by the nonprofit Wikimedia Foundation. </html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		kijijiBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Kijiji");
				URL url = Main.class.getResource("/kijiji.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Kijiji is an online classified advertising service that operates as a centralized network of online communities, organized by city and urban region, for posting local ads. It is a fully owned subsidiary of eBay launched in March 2005. Kijiji websites are available for more than 300 cities in Canada (Alexa website rank of 12 for Canada), Italy (Alexa website rank of 82 for Italy), Hong Kong, and Taiwan.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		bingBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Bing");
				URL url = Main.class.getResource("/bing.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Bing is a web search engine owned and operated by Microsoft. The service has its origins in Microsoft's previous search engines: MSN Search, Windows Live Search and later Live Search. Bing provides a variety of search services, including web, video, image and map search products. It is developed using ASP.NET.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		yahooBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Yahoo");
				URL url = Main.class.getResource("/yahoo.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Yahoo! is a web services provider, wholly owned by Verizon Communications through Oath Inc. and headquartered in Sunnyvale, California. The original Yahoo! company was founded by Jerry Yang and David Filo in January 1994 and was incorporated on March 2, 1995. Yahoo was one of the pioneers of the early Internet era in the 1990s. Marissa Mayer, a former Google executive, served as CEO and President of Yahoo until June 2017.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		neweggBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				websiteTitle.setText("Newegg");
				URL url = Main.class.getResource("/newegg.png");
				ImageIcon image = new ImageIcon(url);
				imgContainer.setIcon(image);
				
				String text = "<html>Newegg Inc. is an online retailer of items including computer hardware and consumer electronics. It is based in City of Industry, California, in the United States.It is owned by Hangzhou Liaison Interactive Information Technology Co. Ltd. based in Beijing. It is one of the world's best reviewed websites in consumer electronics and computer hardware, with different language websites for different countries.</html>";
				
				textLbl.setText(text);
				
			}	
			
		});
		
		searchBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String searchWebsite = websiteTitle.getText();
				String searchTerm = searchBar.getText();
				
				WebSearcher ws = new WebSearcher(searchWebsite, searchTerm);
			}	
			
		});
		
		//Centers window in the screen
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
	    
	    setVisible(true);
		
	}
	

}
