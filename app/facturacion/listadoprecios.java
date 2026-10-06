package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.listadoprecios", "/app.facturacion.listadoprecios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoprecios extends GXWebObjectStub
{
   public listadoprecios( )
   {
   }

   public listadoprecios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoprecios.class ));
   }

   public listadoprecios( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoprecios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoprecios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Precios (Tinte)";
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

