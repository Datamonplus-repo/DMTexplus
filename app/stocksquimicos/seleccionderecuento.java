package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.seleccionderecuento", "/app.stocksquimicos.seleccionderecuento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionderecuento extends GXWebObjectStub
{
   public seleccionderecuento( )
   {
   }

   public seleccionderecuento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionderecuento.class ));
   }

   public seleccionderecuento( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionderecuento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionderecuento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona ";
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

