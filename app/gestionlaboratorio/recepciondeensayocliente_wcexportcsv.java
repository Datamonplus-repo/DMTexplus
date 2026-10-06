package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.recepciondeensayocliente_wcexportcsv", "/app.gestionlaboratorio.recepciondeensayocliente_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recepciondeensayocliente_wcexportcsv extends GXWebObjectStub
{
   public recepciondeensayocliente_wcexportcsv( )
   {
   }

   public recepciondeensayocliente_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recepciondeensayocliente_wcexportcsv.class ));
   }

   public recepciondeensayocliente_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recepciondeensayocliente_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recepciondeensayocliente_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recepcionde Ensayo Cliente_WCExport CSV";
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

