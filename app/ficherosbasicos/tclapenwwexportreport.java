package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclapenwwexportreport", "/app.ficherosbasicos.tclapenwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclapenwwexportreport extends GXWebObjectStub
{
   public tclapenwwexportreport( )
   {
   }

   public tclapenwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclapenwwexportreport.class ));
   }

   public tclapenwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclapenwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclapenwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado  Tipos Familia (estructuras)";
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

