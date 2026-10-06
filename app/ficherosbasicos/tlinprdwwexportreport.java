package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tlinprdwwexportreport", "/app.ficherosbasicos.tlinprdwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinprdwwexportreport extends GXWebObjectStub
{
   public tlinprdwwexportreport( )
   {
   }

   public tlinprdwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinprdwwexportreport.class ));
   }

   public tlinprdwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinprdwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinprdwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Lineas de Produccion";
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

