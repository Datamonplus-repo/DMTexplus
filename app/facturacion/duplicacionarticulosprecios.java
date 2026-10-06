package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.duplicacionarticulosprecios", "/app.facturacion.duplicacionarticulosprecios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicacionarticulosprecios extends GXWebObjectStub
{
   public duplicacionarticulosprecios( )
   {
   }

   public duplicacionarticulosprecios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicacionarticulosprecios.class ));
   }

   public duplicacionarticulosprecios( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicacionarticulosprecios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicacionarticulosprecios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion Articulos/Precios";
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

