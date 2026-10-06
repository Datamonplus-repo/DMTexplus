package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.tiposdepresentacion_wp", "/app.pedidos.tiposdepresentacion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tiposdepresentacion_wp extends GXWebObjectStub
{
   public tiposdepresentacion_wp( )
   {
   }

   public tiposdepresentacion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tiposdepresentacion_wp.class ));
   }

   public tiposdepresentacion_wp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tiposdepresentacion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tiposdepresentacion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Presentacion";
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

