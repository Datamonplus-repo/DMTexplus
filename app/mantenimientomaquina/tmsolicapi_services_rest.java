package app.mantenimientomaquina ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{mantenimientomaquina :(?i)mantenimientomaquina}/{tmsolicapi :(?i)tmsolicapi}")
public final  class tmsolicapi_services_rest extends GxRestService
{
   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

