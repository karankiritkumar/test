import java.util.Map;

public class map
{
	public class VariableList {
		private Map<String, joint> list;
		
		public joint GetVarMemoryAddress(String key) {
			if (list.containsKey(key)) {
				return this.list.get(key);
	}
