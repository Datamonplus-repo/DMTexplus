package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetintecierre_informacion", "/app.formulaciontinte.recetadetintecierre_informacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetintecierre_informacion extends GXWebObjectStub
{
   public recetadetintecierre_informacion( )
   {
   }

   public recetadetintecierre_informacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetintecierre_informacion.class ));
   }

   public recetadetintecierre_informacion( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetintecierre_informacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetintecierre_informacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetade Tinte Cierre Informacion";
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

