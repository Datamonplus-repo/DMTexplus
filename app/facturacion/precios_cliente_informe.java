package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precios_cliente_informe", "/app.facturacion.precios_cliente_informe"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precios_cliente_informe extends GXWebObjectStub
{
   public precios_cliente_informe( )
   {
   }

   public precios_cliente_informe( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precios_cliente_informe.class ));
   }

   public precios_cliente_informe( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precios_cliente_informe_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precios_cliente_informe_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precios Cliente (informe, mail)";
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

