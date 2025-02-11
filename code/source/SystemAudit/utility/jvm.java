package SystemAudit.utility;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2020-09-21 16:02:57 IST
// -----( ON-HOST: IND-L221.brightstarcorp.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class jvm

{
	// ---( internal utility methods )---

	final static jvm _instance = new jvm();

	static jvm _newInstance() { return new jvm(); }

	static jvm _cast(Object o) { return (jvm)o; }

	// ---( server methods )---




	public static final void systemGC (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(systemGC)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		System.gc();
		// --- <<IS-END>> ---

                
	}
}

