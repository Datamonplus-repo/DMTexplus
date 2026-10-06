package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.enviodeensayoacliente_wcexportcsv", "/app.gestionlaboratorio.enviodeensayoacliente_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodeensayoacliente_wcexportcsv extends GXWebObjectStub
{
   public enviodeensayoacliente_wcexportcsv( )
   {
   }

   public enviodeensayoacliente_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodeensayoacliente_wcexportcsv.class ));
   }

   public enviodeensayoacliente_wcexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodeensayoacliente_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodeensayoacliente_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Enviode Ensayoa Cliente_WCExport CSV";
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

