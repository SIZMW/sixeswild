package SixesWild.com.mimas.sixeswild.entities;

/**
 * This class is used as a representation of the Tile entity for Sixes Wild. It
 * represents abstract tile that is used to define the specific types of tiles.
 * 
 * @author Aditya Nivarthi
 */
public abstract class Tile {
	
	TileType type;
	int number;
	int multiplier;

	/**
	 * Constructor for Tile object.
	 */
	public Tile() {
		this.type = TileType.NULL;
		this.number = 0;
		this.multiplier = 0;
	}

	/**
	 * Returns the type from this tile.1
	 * 
	 * @return this.type The type of tile.
	 */
	public TileType getType() {
		return this.type;
	}
	
	/**
	 * Returns the number of the tile.
	 * 
	 * @return this.number The number of the tile.
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * Returns the multiplier of the tile.
	 * 
	 * @return this.multiplier The multiplier of the tile.
	 */
	public int getMultiplier() {
		return this.multiplier;
	}
}
