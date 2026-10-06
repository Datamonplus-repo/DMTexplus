package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoderecetas_agrupacionacabados_wp", "/app.historicoderecetas_agrupacionacabados_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoderecetas_agrupacionacabados_wp extends GXWebObjectStub
{
   public historicoderecetas_agrupacionacabados_wp( )
   {
   }

   public historicoderecetas_agrupacionacabados_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoderecetas_agrupacionacabados_wp.class ));
   }

   public historicoderecetas_agrupacionacabados_wp( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoderecetas_agrupacionacabados_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoderecetas_agrupacionacabados_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla HISHRA";
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

