package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspwwexportreport", "/app.ficherosbasicos.ttranspwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspwwexportreport extends GXWebObjectStub
{
   public ttranspwwexportreport( )
   {
   }

   public ttranspwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspwwexportreport.class ));
   }

   public ttranspwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Transportistas";
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

