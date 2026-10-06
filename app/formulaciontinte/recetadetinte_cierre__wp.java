package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte_cierre__wp", "/app.formulaciontinte.recetadetinte_cierre__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte_cierre__wp extends GXWebObjectStub
{
   public recetadetinte_cierre__wp( )
   {
   }

   public recetadetinte_cierre__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte_cierre__wp.class ));
   }

   public recetadetinte_cierre__wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte_cierre__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte_cierre__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NO se utiliza -Cierre de Recetas de Tinte";
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

