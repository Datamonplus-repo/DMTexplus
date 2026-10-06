package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.enviodeensayoacliente__wcexportcsv", "/app.gestionlaboratorio.enviodeensayoacliente__wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodeensayoacliente__wcexportcsv extends GXWebObjectStub
{
   public enviodeensayoacliente__wcexportcsv( )
   {
   }

   public enviodeensayoacliente__wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodeensayoacliente__wcexportcsv.class ));
   }

   public enviodeensayoacliente__wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodeensayoacliente__wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodeensayoacliente__wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Enviode Ensayoa Cliente__WCExport CSV";
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

