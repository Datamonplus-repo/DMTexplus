package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcauwwexportreport", "/app.ficherosbasicos.ttipcauwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcauwwexportreport extends GXWebObjectStub
{
   public ttipcauwwexportreport( )
   {
   }

   public ttipcauwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcauwwexportreport.class ));
   }

   public ttipcauwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcauwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcauwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipos de Causa";
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

