package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmsolicwwexportreport", "/app.tmsolicwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicwwexportreport extends GXWebObjectStub
{
   public tmsolicwwexportreport( )
   {
   }

   public tmsolicwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicwwexportreport.class ));
   }

   public tmsolicwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Solicitudes de Mantenimiento";
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

