
public class CompositeMemoryVertical
{
	public class CompositeMemoryVertical {
		private Memory[] chips;
		private int size;
		private int bitwidth;
		
		public CompositeMemoryVertical(int chip, int size, int bitwidth) {
			chips = new Memory[chip];
			for(int i = 0; i < chip; i++) {
				chips[i] = new Memory(size, bitwidth);
			}
}
