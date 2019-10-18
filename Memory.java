
public class Memory {
	public class Memory {
		private LinkedList<MemoryBucket> buckets;
		private int bitwidth = 0;
		
		public Memory(int bitwidth, int size) 
		{
			this.bitwidth = bitwidth;
			buckets = new LinkedList<MemoryBucket>();
			for(int i = 0; i < size; i++) {
				MemoryBucket mb = new MemoryBucket(i, bitwidth);
				buckets.add(mb);
			}
		}
}
