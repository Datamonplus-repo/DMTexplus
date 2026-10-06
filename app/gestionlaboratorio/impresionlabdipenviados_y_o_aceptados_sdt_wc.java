package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wc", "/app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionlabdipenviados_y_o_aceptados_sdt_wc extends GXWebObjectStub
{
   public impresionlabdipenviados_y_o_aceptados_sdt_wc( )
   {
   }

   public impresionlabdipenviados_y_o_aceptados_sdt_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionlabdipenviados_y_o_aceptados_sdt_wc.class ));
   }

   public impresionlabdipenviados_y_o_aceptados_sdt_wc( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionlabdipenviados_y_o_aceptados_sdt_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionlabdipenviados_y_o_aceptados_sdt_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Lab Dip Enviados_y_o_Aceptados (SDT)";
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

