/**
 *   file: JFrameMain.java
 */
package c14Package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author <your name>
 * 
 *  DESCRIBE YOUR PROGRAM HERE
 *
 */
public class JFrameMain extends JFrame {

	private JPanel contentPane;
	
	// Global variables
	int[] myList;  // this will contain integers to be sorted
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setTitle("<your-name> Chapter 14 Exercises");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1131, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(632, 75, 439, 565);
		contentPane.add(scrollPane);
		
		JTextArea txtAreaSortoutput = new JTextArea();
		scrollPane.setViewportView(txtAreaSortoutput);
		txtAreaSortoutput.setFont(new Font("Monospaced", Font.PLAIN, 24));
		txtAreaSortoutput.setText("SortOutput here...");

		
		
		JButton btnSorting1 = new JButton("Sorting 1");
		btnSorting1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSorting1.setBounds(12, 75, 220, 53);
		contentPane.add(btnSorting1);
		btnSorting1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Simple sorting practice
				// create an array to be processed
				// integers first - call it list
				
				// statically initialize the list
				int[] list = { 16, 30, 24, 7, 62, 45, 5, 55 };
				// send this list to our sorting class
				Sorting.selectionSort(list);
				
				// display the results somewhere
				txtAreaSortoutput.setText(list.toString() + "\n"); // the lazy way to display an array
				for( int i=0; i<list.length; i++)
					txtAreaSortoutput.append(list[i] + ", ");
			}
		});
		

		Label label = new Label("This program demonstrates sorting of arrays and lists.");
		label.setFont(new Font("Dialog", Font.PLAIN, 18));
		label.setBounds(10, 10, 1061, 59);
		contentPane.add(label);
		
		JButton btnExerciseBinary = new JButton("Exercise 14-1 Binary Search test");
		btnExerciseBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// sort myList
				// display the first 50 items in the list
				// search for an item in myList
				// display the result of the search
				
			}
		});
		btnExerciseBinary.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseBinary.setBounds(12, 257, 551, 53);
		contentPane.add(btnExerciseBinary);
		
		JButton btnCreateAList = new JButton("Create an int[] list");
		btnCreateAList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// build an array of random integers between 1 and 1000
				
				// Write the code to generate a list of random numbers
				// allocate 1000 items in myList
				// put the values in myList using the Math.random() method
				// display the first 50 values of myList in the output JTextArea
				
				
			}
		});
		btnCreateAList.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCreateAList.setBounds(12, 141, 248, 53);
		contentPane.add(btnCreateAList);
		
		JButton btnExerciseRemove = new JButton("Exercise 14-2 remove() test");
		btnExerciseRemove.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseRemove.setBounds(12, 323, 551, 53);
		contentPane.add(btnExerciseRemove);
		
		JButton btnExerciseRemoveat = new JButton("Exercise 14-3 removeAt() test");
		btnExerciseRemoveat.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseRemoveat.setBounds(12, 389, 551, 53);
		contentPane.add(btnExerciseRemoveat);
		
		JButton btnExerciseRemoveall = new JButton("Exercise 14-4 removeAll() test");
		btnExerciseRemoveall.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseRemoveall.setBounds(12, 455, 551, 53);
		contentPane.add(btnExerciseRemoveall);
		
		JButton btnExerciseInsertionsort = new JButton("Exercise 14-9 insertionSort() test");
		btnExerciseInsertionsort.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseInsertionsort.setBounds(12, 521, 551, 53);
		contentPane.add(btnExerciseInsertionsort);
		
		JButton btnExerciseInsertionsortvector = new JButton("Exercise 14-10 insertionSortVector() test");
		btnExerciseInsertionsortvector.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExerciseInsertionsortvector.setBounds(12, 587, 551, 53);
		contentPane.add(btnExerciseInsertionsortvector);
		
		JButton btnCreateAVector = new JButton("Create a Vector list");
		btnCreateAVector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// add the code to instantiate and fill myVectorList with Strings
				
			}
		});
		btnCreateAVector.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCreateAVector.setBounds(315, 141, 248, 53);
		contentPane.add(btnCreateAVector);
	}
}
