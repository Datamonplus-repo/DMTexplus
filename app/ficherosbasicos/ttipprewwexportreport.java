package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipprewwexportreport", "/app.ficherosbasicos.ttipprewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprewwexportreport extends GXWebObjectStub
{
   public ttipprewwexportreport( )
   {
   }

   public ttipprewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprewwexportreport.class ));
   }

   public ttipprewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipos de Presentacion";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

