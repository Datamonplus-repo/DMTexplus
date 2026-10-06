package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados", "/app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionlabdipenviados_y_o_aceptados extends GXWebObjectStub
{
   public impresionlabdipenviados_y_o_aceptados( )
   {
   }

   public impresionlabdipenviados_y_o_aceptados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionlabdipenviados_y_o_aceptados.class ));
   }

   public impresionlabdipenviados_y_o_aceptados( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionlabdipenviados_y_o_aceptados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionlabdipenviados_y_o_aceptados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Lab Dip Enviados y/o Aceptados";
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

