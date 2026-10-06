package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprovinwwexportreport", "/app.ficherosbasicos.tprovinwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprovinwwexportreport extends GXWebObjectStub
{
   public tprovinwwexportreport( )
   {
   }

   public tprovinwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprovinwwexportreport.class ));
   }

   public tprovinwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprovinwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprovinwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Provincias";
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

