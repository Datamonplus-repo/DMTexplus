package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefwwexportreport", "/app.ficherosbasicos.ttipdefwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefwwexportreport extends GXWebObjectStub
{
   public ttipdefwwexportreport( )
   {
   }

   public ttipdefwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefwwexportreport.class ));
   }

   public ttipdefwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipo de Defectos";
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

