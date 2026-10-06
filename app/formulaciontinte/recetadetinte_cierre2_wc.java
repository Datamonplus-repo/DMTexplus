package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte_cierre2_wc", "/app.formulaciontinte.recetadetinte_cierre2_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte_cierre2_wc extends GXWebObjectStub
{
   public recetadetinte_cierre2_wc( )
   {
   }

   public recetadetinte_cierre2_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte_cierre2_wc.class ));
   }

   public recetadetinte_cierre2_wc( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte_cierre2_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte_cierre2_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle de Recetas de Tinte Pendientes de Cerrar";
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

