package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tiempomedioentrega_lab_wp", "/app.gestionlaboratorio.tiempomedioentrega_lab_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tiempomedioentrega_lab_wp extends GXWebObjectStub
{
   public tiempomedioentrega_lab_wp( )
   {
   }

   public tiempomedioentrega_lab_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tiempomedioentrega_lab_wp.class ));
   }

   public tiempomedioentrega_lab_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tiempomedioentrega_lab_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tiempomedioentrega_lab_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tiempo Medio Entrega (LAB)";
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

