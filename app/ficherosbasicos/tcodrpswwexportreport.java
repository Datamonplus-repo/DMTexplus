package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrpswwexportreport", "/app.ficherosbasicos.tcodrpswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrpswwexportreport extends GXWebObjectStub
{
   public tcodrpswwexportreport( )
   {
   }

   public tcodrpswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrpswwexportreport.class ));
   }

   public tcodrpswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrpswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrpswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Responsabilidades";
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

