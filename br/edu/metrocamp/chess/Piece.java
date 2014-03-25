package br.edu.metrocamp.chess;

public abstract class Piece
{
	protected String name; //piece name.
	protected Side side; //piece side (white or black).
	protected Symbols symbol; //piece symbol.
	private Coordinate coord; //current piece coordinate.
	private Boolean isvalid; //flag to mark operation as valid/not valid. Default should be false.
	private Boolean moved; //if the piece never moved before, this will be false.
	
	public Side getSide()
	{
		return side;
	}
	
	public Symbols getSymbol()
	{
		return symbol;
	}
	
	public String getPieceName()
	{
		return name;
	}
	
	public Coordinate getCoord()
	{
		return coord;
	}
	
	public void setCoord(Coordinate coord)
	{
		this.coord = coord;
	}
	
	public Boolean getIsvalid()
	{
		return isvalid;
	}
	
	public void setIsvalid(Boolean bool)
	{
		this.isvalid = bool;
	}
	
	public Boolean getMoved()
	{
		return moved;
	}
	
	public void setMoved(Boolean bool)
	{
		this.moved = bool;
	}
	
	public abstract Boolean movementValidator(Coordinate dest);
}
