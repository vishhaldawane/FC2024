package com.fc.finaltest;

public class FinalMethodTest {
	public static void main(String[] args) {
		
		//Chess chess = new Chess(); <-- benefit of math logic
		//chess.moveknight();
		
		//any child object can be referred by its Parent's reference
		//and using that reference to Parent -> you can only invoke parent specific [overridden] methods
		Chess chess = new GraphicalChess(); //benefit of math + graphics
		chess.moveKnight(); //this token [ or method name ] is not found in parent, rather found it child
		//hence it would be an error
		
		
		chess.moveKing();
		chess.moveQueen();
	}
}
/*
 						Player1
 
 		|----|----|----|----|----|----|----|----|
 	1	| R	 | K  | B  | K	| Q	 | B  | K  | R  |
 		|----|----|----|----|----|----|----|----|
 	2	| P	 | P  | P  | P	| P	 | P  | P  | P  |
 		|----|----|----|----|----|----|----|----|
 	3	|	 |	  |	   |	|	 |	  |    |    |
 		|----|----|----|----|----|----|----|----|
 	4	|	 |	  |	   |	|	 |	  |    |    |
 		|----|----|----|----|----|----|----|----|
 	5	|	 |	  |	   |	|	 |	  |    |    |
 		|----|----|----|----|----|----|----|----|
 	6	|	 |	  |	   |	|	 |	  |    |    |
 		|----|----|----|----|----|----|----|----|
 	7	| P	 | P  | P  | P	| P	 | P  | P  | P  |
 		|----|----|----|----|----|----|----|----|
 	8	| R	 | K  | B  | K	| Q	 | B  | K  | R  |
 		|----|----|----|----|----|----|----|----|
 		
 						Player2
 		
 		
 		how do we change an existing code without changing it
 		
*/
final class Chess // Prakash Dure has developed the "math logic" in below functions for 2 months
{
	//Army of 16
	
	void moveBishop() { // Camel -2
		System.out.println("Chess:moveBishop(): Moving bishop 1/N steps diagonally+bidirectional");
	}
	
	void moveRook() { //Elephant - 2
		System.out.println("Chess:moveRook(): Moving rook 1/N steps hori/vert+bidirectional");

	}
	
	//this is the only final version of the method : no further revision of it is possible
	final void moveKnight() { //Horse - 2
		System.out.println("Chess:moveKnight(): Moving Knight L(2.5) Shape + anywhere [ jump over anybodies body]...");

	}
	
	void movePawn() { //1. Soldier - 8 
		System.out.println("Chess:movePawn(): Moving Pawn 1 step ahead/cross step to kill someone");

	}
	
	void moveQueen() { //Vazeer - 1
		System.out.println("Chess:moveQueen(): Moving Queen 1/N steps hori/vert/diagonal/bidirectional...");

	}
	
	final void moveKing() { //King - 1
		System.out.println("Chess:moveKing(): Moving King 1 step hori/vert/diagonal/bidirectional");
	}
}

//to develop the chess in graphics 
class GraphicalChess extends Chess //isA <-- Prajakta Karve
{
	void moveMyKnight() { //Horse - 2 - exclusive [ not inherited ]
		System.out.println("Locating the position on the graphics screen...");
		System.out.println("Arranging movement in graphical manner....");
		//super.moveknight(); //she is reusing the code of the parent class - math logic
		System.out.println("GraphicalChess:moveKnight(): GRAPHICALLY Moving Knight L(2.7) Shape + only at empty places [ cant jump over anybodies body]...");
		System.out.println("Knight is graphically moved at the specified position....");
	}
	
	void moveMyKing() {
		System.out.println("Chess:moveKing(): Moving King N steps in the enemy lines");

	}
	
	void moveQueen() { //Vazeer - 1
		System.out.println("Chess:moveQueen(): Moving Queen L Shape hori/vert/diagonal/bidirectional...");

	}
}




