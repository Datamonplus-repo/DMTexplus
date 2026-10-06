package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcaswwexportreport", "/app.ficherosbasicos.tmarcaswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcaswwexportreport extends GXWebObjectStub
{
   public tmarcaswwexportreport( )
   {
   }

   public tmarcaswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcaswwexportreport.class ));
   }

   public tmarcaswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcaswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcaswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Marcas";
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

