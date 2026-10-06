package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.patws07", "/app.stocksquimicos.patws07"})
@jakarta.servlet.annotation.MultipartConfig
public final  class patws07 extends GXWebObjectStub
{
   public patws07( )
   {
   }

   public patws07( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( patws07.class ));
   }

   public patws07( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new patws07_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new patws07_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Respuesta Documento Transporte Proveedor";
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

