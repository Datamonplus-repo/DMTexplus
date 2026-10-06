package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.recargosporarticuloww", "/app.facturacion.recargosporarticuloww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recargosporarticuloww extends GXWebObjectStub
{
   public recargosporarticuloww( )
   {
   }

   public recargosporarticuloww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recargosporarticuloww.class ));
   }

   public recargosporarticuloww( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recargosporarticuloww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recargosporarticuloww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Recargos por Articulo";
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

