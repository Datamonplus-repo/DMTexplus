package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdetinte_agrupacion_ww", "/app.recetasdetinte_agrupacion_ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdetinte_agrupacion_ww extends GXWebObjectStub
{
   public recetasdetinte_agrupacion_ww( )
   {
   }

   public recetasdetinte_agrupacion_ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdetinte_agrupacion_ww.class ));
   }

   public recetasdetinte_agrupacion_ww( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdetinte_agrupacion_ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdetinte_agrupacion_ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Recetas de Tinte (Agrupacion_Registro)";
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

