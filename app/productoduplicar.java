package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productoduplicar", "/app.productoduplicar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productoduplicar extends GXWebObjectStub
{
   public productoduplicar( )
   {
   }

   public productoduplicar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productoduplicar.class ));
   }

   public productoduplicar( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productoduplicar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productoduplicar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto Duplicar";
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

