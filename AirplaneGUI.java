import javax.swing.*;      //Needed for Swing classes
import java.awt.*;         //Needed for AWT classes
import java.awt.event.*;   //Needed for event listener interface
/**
 * This is a GUI class for Airplane object.
 * 
 * @author Rushan Shakya 
 * @version 5/3/2017
 */
public class AirplaneGUI extends JFrame
{
    // instance variables 
    //Frame dimensions
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 300;
    
    //Panels
    private JPanel logoPanel; //this panel will contain the logo
    private JPanel informationPanel; //This panel contains the text area
    private JPanel mainInformationPanel; //This panel contains Lables, Radio box, check box, and text field for Airplane information
    private JPanel textAreaPanel; //This panel contains the text area component
    private JPanel buttonPanel; //Sub-panel
            
    //Labels
    private JLabel jlblTailNumber;
    private JLabel jlblManufacturer;
    private JLabel jlblModel;
    private JLabel jlblFuelCapacity;
    private JLabel jlblAmphibian;
    private JLabel jlblNoOfEngines;
    
    //Text Fields
    private JTextField jtfTailNumber;
    private JTextField jtfManufacturer;
    private JTextField jtfModel;
    private JTextField jtfFuelCapacity;
    
    //Checkbox
    private JCheckBox jcbAmphibian;
    
    //Radio Buttons
    private JRadioButton jrbOneEngine;
    private JRadioButton jrbTwoEngine;
    private JRadioButton jrbThreeEngine;
    private JRadioButton jrbFourEngine;
    private ButtonGroup radioButtonGroup; // To group radio buttons
    
    //Text Area
    private JTextArea jtaTextArea;
    
    //Buttons
    private JButton jbtnDisplay;
    private JButton jbtnClear;

    /**
     * Constructor for objects of class AirplaneGUI
     */
    public AirplaneGUI()
    {
       //Call the JFrame constructor
       super("Blue Skies Aviation- Airplane Information");
       
       //set the size of the window
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       
       //specify what happens when the close button is clicked
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       
       //Build the panel and add it to the frame
       buildLogoPanel();
       buildInformationPanel();
       buildTextAreaPanel();
       buildButtonPanel();
       
       //Add BorderLayout manager to content pane
       setLayout( new BorderLayout( 4, 5 ) );
       
       //Add panel to the frame's content pane
       add( logoPanel, BorderLayout.NORTH );
       add( informationPanel, BorderLayout.CENTER );
       //add( logoPanel, BorderLayout.NORTH );
       //add( informationPanel);
       add (textAreaPanel, BorderLayout.EAST);
       add(buttonPanel, BorderLayout.SOUTH);

       pack(); // this method causes the frame to be sized to fit its subcomponents
       //Display the window
       setVisible( true );
    }
    
     /**
     * The build Logo panel method adds Logo at the top of the page
     */
    public void buildLogoPanel()
    {
        //Create a logo panel
        logoPanel = new JPanel();
                
        //Create an Icon
        ImageIcon logo = new ImageIcon("logo.png");
        //add logo to logoPanel
        logoPanel.add( new JLabel (logo) );
  
        pack(); //this method causes the frame to be sized to fit its subcomponents
    }
    
    /**
     * The build panel method adds a label, text field, and a button to a panel
     */
    public void buildInformationPanel()
    {
       //*Panels*
       //Create variable to reference JPanel objects
       informationPanel = new JPanel();
       mainInformationPanel = new JPanel();
       mainInformationPanel.setLayout( new GridLayout( 6, 2 ) );
       informationPanel.add(mainInformationPanel);
       
       //Create sub-panes for radio button
       JPanel radioPanel = new JPanel();
       radioPanel.setLayout( new FlowLayout( FlowLayout.LEFT ) );
       
       //Set border
       mainInformationPanel.setBorder( BorderFactory.createTitledBorder( "Airplane Information" ));
                                
       //*Labels and Text Fields*
       //Create a label for Tail Number
       jlblTailNumber = new JLabel("Tail Number");
       //Create a text field for Tail Number
       jtfTailNumber = new JTextField( 10 );
       
       //Create a label for Manufacturer
       jlblManufacturer = new JLabel("Manufacturer");
       //Create a text field for Manufacturer
       jtfManufacturer = new JTextField( 20 );
       
       //Create a label for Model
       jlblModel = new JLabel("Model");
       //Create a text field for Model
       jtfModel = new JTextField( 20 );
       
       //Create a label for Fuel Capacity
       jlblFuelCapacity = new JLabel("Fuel Capacity");
       //Create a text field for Fuel Capacity
       jtfFuelCapacity = new JTextField( 5 );
       
       //*Check Box*
       //Create a lable for the check box
       jlblAmphibian = new JLabel("Is Amphibian");
       //create a check box
       jcbAmphibian = new JCheckBox("Yes");
       
       //*Radio Buttons*
       //create a label for radio button
       jlblNoOfEngines =  new JLabel("No. of engines");
       //Create a radio button for single engine
       jrbOneEngine = new JRadioButton("1");
       //Create a radio button for double engines
       jrbTwoEngine = new JRadioButton("2");
       //Create a radio button for triple engines
       jrbThreeEngine = new JRadioButton("3");
       //Create a radio button for quadruple engines
       jrbFourEngine = new JRadioButton("4");
       
       //Group the radio buttons
       radioButtonGroup = new ButtonGroup( );
       radioButtonGroup.add( jrbOneEngine );
       radioButtonGroup.add( jrbTwoEngine );
       radioButtonGroup.add( jrbThreeEngine );
       radioButtonGroup.add( jrbFourEngine );
             
       //Add the label, text field, check box, and radio buttons components to the panel
       mainInformationPanel.add( jlblTailNumber );
       mainInformationPanel.add( jtfTailNumber );
       
       mainInformationPanel.add( jlblManufacturer );
       mainInformationPanel.add( jtfManufacturer );
       
       mainInformationPanel.add( jlblModel );
       mainInformationPanel.add( jtfModel );
       
       mainInformationPanel.add( jlblFuelCapacity );
       mainInformationPanel.add( jtfFuelCapacity );
       
       mainInformationPanel.add (jlblAmphibian );
       mainInformationPanel.add( jcbAmphibian );
       
       mainInformationPanel.add( jlblNoOfEngines );
       radioPanel.add( jrbOneEngine );
       radioPanel.add( jrbTwoEngine );
       radioPanel.add( jrbThreeEngine );
       radioPanel.add( jrbFourEngine );
       mainInformationPanel.add( radioPanel );
    }
    
    /**
     * The build text area panel method adds text area panel
     */
    public void buildTextAreaPanel()
    {
      //Create a text area panel
      textAreaPanel = new JPanel();
      
      //Set Border
      textAreaPanel.setBorder( BorderFactory.createTitledBorder( "Output" ));
      
      //Add textAreaPanel to informationPanel
      add( textAreaPanel );
      
      //*Text Area
      jtaTextArea = new JTextArea( 10, 30 );
      jtaTextArea.setLineWrap( true );
      jtaTextArea.setWrapStyleWord( true );
      jtaTextArea.setEditable( false );
       
      //*Buttons*
      //Create a button with the caption "Display"
      jbtnDisplay = new JButton("Display");
      //Create a button with the caption "Clear"
      jbtnClear = new JButton("Clear");
        
      //Add Text area to the panel
      textAreaPanel.add( jtaTextArea );

      pack(); //this method causes the frame to be sized to fit its subcomponents
    }
    
     private void buildButtonPanel() {
     //create button and button panel
     buttonPanel = new JPanel();
     jbtnDisplay = new JButton( "Display" );
     jbtnClear = new JButton( "Clear" );
      
     //add action listeners
     jbtnDisplay.addActionListener( new DisplayButtonListener() );
     jbtnClear.addActionListener( new ClearButtonListener() );
      
     //Add button to the panel
     buttonPanel.add( jbtnDisplay );
     buttonPanel.add( jbtnClear );
      
     pack(); // this method causes the frame to be sized to fit its subcomponents
    }
    
    /**
     * main method
     */
    public static void main( String[] args )
    {
        new AirplaneGUI();
    }
        
    /**
     * displayButtonListner is an action listener class for the Display button
     */
    private class DisplayButtonListener implements ActionListener
    {
        /**
         * The actionPerformed method executes when the user clicks on the Display button.
         * The ActionEvent parameter is required
         */
        public void actionPerformed( ActionEvent e )
        {
        }
    }
    
    /**
     * clearButtonListner is an action listener class for the Clear button
     */
    private class ClearButtonListener implements ActionListener
    {
        /**
         * The actionPerformed method executes when the user clicks on the clear button.
         * The ActionEvent parameter is required
         */
        public void actionPerformed( ActionEvent e )
        {
        }
    }
}