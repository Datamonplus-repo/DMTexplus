package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.producto", "/app.stocksquimicos.producto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class producto extends GXWebObjectStub
{
   public producto( )
   {
   }

   public producto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( producto.class ));
   }

   public producto( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new producto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new producto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto";
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

