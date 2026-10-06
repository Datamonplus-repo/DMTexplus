package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetasdetinte_agrupacion_wp", "/app.formulaciontinte.recetasdetinte_agrupacion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdetinte_agrupacion_wp extends GXWebObjectStub
{
   public recetasdetinte_agrupacion_wp( )
   {
   }

   public recetasdetinte_agrupacion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdetinte_agrupacion_wp.class ));
   }

   public recetasdetinte_agrupacion_wp( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdetinte_agrupacion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdetinte_agrupacion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas de Tinte (Agrupacion)";
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

