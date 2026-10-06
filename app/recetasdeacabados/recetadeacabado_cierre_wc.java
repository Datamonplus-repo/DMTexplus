package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabados.recetadeacabado_cierre_wc", "/app.recetasdeacabados.recetadeacabado_cierre_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadeacabado_cierre_wc extends GXWebObjectStub
{
   public recetadeacabado_cierre_wc( )
   {
   }

   public recetadeacabado_cierre_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadeacabado_cierre_wc.class ));
   }

   public recetadeacabado_cierre_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadeacabado_cierre_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadeacabado_cierre_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle de Recetas de Acabado Pendientes de Cerrar";
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

