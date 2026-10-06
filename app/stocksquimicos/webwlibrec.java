package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwlibrec", "/app.stocksquimicos.webwlibrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlibrec extends GXWebObjectStub
{
   public webwlibrec( )
   {
   }

   public webwlibrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlibrec.class ));
   }

   public webwlibrec( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlibrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlibrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Liberacion Inventario (Recuento)";
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

