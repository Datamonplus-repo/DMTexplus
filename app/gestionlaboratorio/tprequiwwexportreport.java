package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tprequiwwexportreport", "/app.gestionlaboratorio.tprequiwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprequiwwexportreport extends GXWebObjectStub
{
   public tprequiwwexportreport( )
   {
   }

   public tprequiwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprequiwwexportreport.class ));
   }

   public tprequiwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprequiwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprequiwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Preparacion";
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

