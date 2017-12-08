package ArrayFun;

import javax.swing.JOptionPane;

public class Matrix {
	

	private int[][] ticTacToe = {
			{0,1,2},
			{10,11,12},
			{20,21,22}
		};
		private int[][] gamee = {
			{0,0,0},
			{0,0,0},
			{0,0,0},
		};
		
		private char[][] realGame = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'}
		};
		
		String[][] checkers = new String[8][8];
		public Matrix () {
			
		}
		
		public void test2D () {
			checkers[0][0] = "red";
			checkers[0][7] = "red king";
			checkers[3][4] = " ";
			checkers[7][0] = "black";
			checkers[7][7] = "black king";
			
			for (int r = 0; r < ticTacToe.length; r++) {
				
				for (int c = 0; c < ticTacToe[r].length; c++) {
				//	System.out.print(ticTacToe[r][c] + " ");
				}
				System.out.print("\n");
			}
		}// end of 2D
		
		public void gameBoard() {
			gamee[0][0] = 1;
			System.out.println("\nPrint initial game board, player starts in middle\n");
			for (int r = 0; r < gamee.length; r++) {
				
				for (int c = 0; c < gamee[r].length; c++) {
					System.out.print(gamee[r][c] + " ");
				}
				System.out.print("\n");
			}
			
			gamee[1][1] = 1;
			System.out.println("\nPrint initial game board, player starts in middle\n");
			for (int r = 0; r < gamee.length; r++) {
		
				for (int c = 0; c < gamee[r].length; c++) {
					System.out.print(gamee[r][c] + " ");
				}
				System.out.print("\n");
			}
			
			
			game[2][2] = 1;
			System.out.println("\nPrint initial game board, player starts in middle\n");
			for (int r = 0; r < gamee.length; r++) {
				
				for (int c = 0; c < gamee[r].length; c++) {
					System.out.print(gamee[r][c] + " ");
				}
				System.out.print("\n");
			}
		
			System.out.println("\nNow work with real game X and O's");
			
			realGame[0][0]= 'X';
			realGame[1][1]= 'X';
			realGame[2][2]= 'X';
		
for (int r = 0; r < realGame.length; r++) {
				
				for (int c = 0; c < realGame[r].length; c++) {
					System.out.print(realGame[r][c] + " ");
				}
				System.out.print("\n");
			}
}
	
			//////////////////// END OF TESTING //////////////////////
			/////                                                ///// 
			/////                                                /////
			//////////////////// START OF GAME  //////////////////////
	
		

		private char[][] game = {
				{'-','-','-'},
				{'-','-','-'},
				{'-','-','-'}
			};
	
		public void Game() {
			
			
			Boolean Tie = false;
			String msg = "";
			Boolean run = false;	
			String[] opt = new String[] {"Yes", "No"};
			Boolean Win = false;
			int Turn = 1;
			
			msg = "Do you want to play Tic Tac Toe?";
			
			 int confirms = JOptionPane.showOptionDialog(null, msg, "Message",
				      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				       null, opt, opt[0]);
			 
					if (confirms == JOptionPane.YES_OPTION) {
					
						run = true;
					}
					
					else { 
						JOptionPane.showMessageDialog(null, "Good Bye!");
					}
			
				char Player = 'X';
				
					
			while (run) {
				
			int r =0;
			int c=0;
			
			String namePlayer = Player + "";
				msg = "Player " + namePlayer + " turn. Where would you like to go?";
				JOptionPane.showMessageDialog(null, msg);
				 	msg = "Which row?";
				 	r = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
				 	
				 	msg="which column";
				 	
	
					c = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
				
					
					
					if (Player == 'X') {
					if (game[r][c] != 'O') {
						game[r][c]= (char) Player;
					printBoard();
					}
					else {
						msg = "There is already a player on that position";
						JOptionPane.showMessageDialog(null, msg);
						Player = 'O';
					}
					}
					else if (Player == 'O'){
						if (game[r][c] != 'X') {
							game[r][c]= (char) Player;
							printBoard();
							}
							else {
								msg = "There is already a player on that position";
								JOptionPane.showMessageDialog(null, msg);
								Player = 'X';
							}
					}
					else {
						run = false;
					}
					
		
						System.out.print("\n");
					
					
					
		if (game[1][0] == 'X' && game[1][1] == 'X' && game [1][2] == 'X'){
					Win = true;
					run = false;
				}
				
				else if (game[2][0] == 'X' && game[2][1] == 'X' && game [2][2] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[0][0] == 'X' && game[1][0] == 'X' && game [2][0] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[0][1] == 'X' && game[1][1] == 'X' && game [2][1] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[0][2] == 'X' && game[1][2] == 'X' && game [2][2] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[0][0] == 'X' && game[1][1] == 'X' && game [2][2] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[0][2] == 'X' && game[1][1] == 'X' && game [2][0] == 'X'){
					Win = true;
					run = false;
				}
				else if (game[1][0] == 'O' && game[1][1] == 'O' && game [1][2] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[2][0] == 'O' && game[2][1] == 'O' && game [2][2] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[0][0] == 'O' && game[1][0] == 'O' && game [2][0] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[0][1] == 'O' && game[1][1] == 'O' && game [2][1] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[0][2] == 'O' && game[1][2] == 'O' && game [2][2] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[0][0] == 'O' && game[1][1] == 'O' && game [2][2] == 'O'){
					Win = true;
					run = false;
				}
				else if (game[0][2] == 'O' && game[1][1] == 'O' && game [2][0] == 'O'){
					Win = true;
					run = false;
				}
				else if(Turn == 9) {
					run = false;
					Tie = true;
				}
				
					else {
						run = true;
						if ((char) Player == 'X') {
							Player = 'O';
							Turn = Turn + 1;
						}
						else {
							Player = 'X';
							Turn = Turn + 1;
						}
					
					}
		
		
		
			
			}
			
			while (Win) {
				String namePlayer = Player + "";
				JOptionPane.showMessageDialog(null,"Player " + namePlayer + " has won the game!");
				Win = false;
				
			}
			
			while (Tie) {
				JOptionPane.showMessageDialog(null,"It's a Tie!");
				Tie = false;

			}
			
			
			
			
			
		}
		
		private void printBoard () {
			System.out.printf(" %C | %C | %C \n", game[0][0],game[0][1],game[0][2]);
			System.out.println("-----------");
			System.out.printf(" %C | %C | %C \n", game[1][0],game[1][1],game[1][2]);
			System.out.println("-----------");
			System.out.printf(" %C | %C | %C \n", game[2][0],game[2][1],game[2][2]);
			System.out.print("\n");
		}
		
		
		
		
	}// end of class

	

