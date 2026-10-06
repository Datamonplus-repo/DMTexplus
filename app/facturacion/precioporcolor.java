package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporcolor", "/app.facturacion.precioporcolor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporcolor extends GXWebObjectStub
{
   public precioporcolor( )
   {
   }

   public precioporcolor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporcolor.class ));
   }

   public precioporcolor( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporcolor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporcolor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Color";
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

