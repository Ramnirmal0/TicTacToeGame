import java.io.*;
import java.util.*;

public class TicTacToeGame {
	
	public static char playerSymbol;
	public static char cpuSymbol;
	static char[] board = new char[10];
	public static int playerPos;
	public static int cpuPos;
	
	
	public static char[] createBoard() {

		for(int i=0;i<9;i++) {
			board[i]= '-';
		}
		return board;	
	}
	
	public static void showBoard() {
		System.out.println("**Play Board Display**\n");
		System.out.println(" | "+board[0]+" "+board[1]+" "+board[2]+" |\n");
		System.out.println(" | "+board[3]+" "+board[4]+" "+board[5]+" |\n");
		System.out.println(" | "+board[6]+" "+board[7]+" "+board[8]+" |\n");

	}
	
	public static void main(String[] args) {
		char[] board = createBoard();
		System.out.println("Select the Letter you wanted \n  press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
		Scanner scan =new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1 : {
				playerSymbol='X';
				cpuSymbol='O';
				System.out.println("\n\nPlayerOne Choose : X\nCPU Choose : O\n\n");
				break;
			}
			case 2 :{
				playerSymbol='O';
				cpuSymbol='X';
				System.out.println("\n\nPlayerOne Choose : O\nCPU Choose : X\n\n");
				break;
			}
			default: {
				System.out.println("Invalid Choice . Retry Again!");
				return;
			}
		}
		
		TicTacToeGame.showBoard();
		
		System.out.println("\nSelect the position to in board from range [ 0 - 8 ] :");
		playerPos= scan.nextInt();
		
		switch(playerPos) {
		case 0 : {if(board[0]=='-') { board[0]=playerSymbol;} break;}
		case 1 : {if(board[1]=='-') { board[1]=playerSymbol;} break;}
		case 2 : {if(board[2]=='-') { board[2]=playerSymbol;} break;}
		case 3 : {if(board[3]=='-') { board[3]=playerSymbol;} break;}
		case 4 : {if(board[4]=='-') { board[4]=playerSymbol;} break;}
		case 5 : {if(board[5]=='-') { board[5]=playerSymbol;} break;}
		case 6 : {if(board[6]=='-') { board[6]=playerSymbol;} break;}
		case 7 : {if(board[7]=='-') { board[7]=playerSymbol;} break;}
		case 8 : {if(board[8]=='-') { board[8]=playerSymbol;} break;}
		default : System.out.println("Invalid Position ! Restart game"); return;
		}
		
		TicTacToeGame.showBoard();
		
	}
}
