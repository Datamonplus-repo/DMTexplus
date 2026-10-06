package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsustitucionprocesosprogramas", "/app.formulaciontinte.wcsustitucionprocesosprogramas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsustitucionprocesosprogramas extends GXWebObjectStub
{
   public wcsustitucionprocesosprogramas( )
   {
   }

   public wcsustitucionprocesosprogramas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsustitucionprocesosprogramas.class ));
   }

   public wcsustitucionprocesosprogramas( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsustitucionprocesosprogramas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsustitucionprocesosprogramas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Estructura Tabla LMACPR";
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

