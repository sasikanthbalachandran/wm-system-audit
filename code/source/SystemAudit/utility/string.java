package SystemAudit.utility;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2020-09-22 11:46:20 IST
// -----( ON-HOST: IND-L221.brightstarcorp.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void tokenize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(tokenize)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inString
		// [i] field:0:required delim
		// [o] field:1:required stringList
		IDataCursor pc = pipeline.getCursor();
		String string = IDataUtil.getString(pc, "inString");
		String pattern = IDataUtil.getString(pc, "delim");
		String[] sList = string.split(pattern);
		List<String> sl = new ArrayList<String>(Arrays.asList(sList));
		for (String item : sList)
		{
			sl.add(item);
		}
		
		IDataUtil.put(pc, "stringList", sl);
		pc.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

