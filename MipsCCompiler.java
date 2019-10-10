
public class MipsCCompiler 
{
	private DataMemory theDataMemory;
	private RegisterCollection theRegisterCollection;
	private SrcReader theSrc;
	private String filename;
	
	public MipsCCompiler(String filename)
	{
		this.filename = filename;
		this.theSrc = new SrcReader(filename);
		this.theDataMemory = new DataMemory(200000);
		this.theRegisterCollection = new RegisterCollection(16);
		VariableList vars = new VariableList();
		String currLine = this.theSrc.getNextLine();
		while (!currLine.contentEquals("EOF"))
		{			
			String[] words = currLine.replaceAll(";", "").split(" ");
			if (words[0].contentEquals("int")) {
				vars.Assign(words[1], this.theRegisterCollection, this.theDataMemory);
			
				System.out.println("Addi " + p.getValue0() + ", $zero, " + p.getValue1());
			} else {
				String[] arr = currLine.replaceAll("[; ]", "").split("=");
				String left = arr[0];
				String right = arr[1];
			
			}
			currLine = this.theSrc.getNextLine();=
		}
	}

		String instruction;
		String output;
		while(true)
		{
			instruction = this.theSrc.getNextLine();
			if(instruction.equals("EOF"))
			{
				break;
			}
			else
			{
				//process this instruction
				output = "";
				String[] parts = instruction.split(" ");
				if(parts[0].trim().equals("int"))
				{
					output += "addi ";
					String varName = parts[1].trim();
					varName = varName.substring(0, varName.length()-1);
					output += this.theRegisterCollection.getNextAvailableRegisterName(varName);
					output += ",  $zero, ";
					output += this.theDataMemory.getAddressForNewMemory();
				}
				else
				{
					parts = instruction.split("=");
					output += "addi ";
					String tempRegName = this.theRegisterCollection.getNextAvailableRegisterName("1337__lol");
					output += tempRegName;
					output += ", $zero, ";
					String varValue = parts[1].trim();
					varValue = varValue.substring(0, varValue.length()-1);
					output += varValue;
					output += "\n";
					output += "sw ";
					output += tempRegName;
					output += ", 0(";
					String oldRegName = this.theRegisterCollection.getRegisterNameByVarName(parts[0].trim());
					output += oldRegName;
					output += ")";
				}
				System.out.println(output);
			}
		}

	}
}
