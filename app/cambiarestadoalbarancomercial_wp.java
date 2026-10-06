package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cambiarestadoalbarancomercial_wp", "/app.cambiarestadoalbarancomercial_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiarestadoalbarancomercial_wp extends GXWebObjectStub
{
   public cambiarestadoalbarancomercial_wp( )
   {
   }

   public cambiarestadoalbarancomercial_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiarestadoalbarancomercial_wp.class ));
   }

   public cambiarestadoalbarancomercial_wp( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiarestadoalbarancomercial_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiarestadoalbarancomercial_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambiar Estado Albaran Comercial";
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

