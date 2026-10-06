package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioninternaensayo_wp", "/app.gestionlaboratorio.aprobacioninternaensayo_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioninternaensayo_wp extends GXWebObjectStub
{
   public aprobacioninternaensayo_wp( )
   {
   }

   public aprobacioninternaensayo_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioninternaensayo_wp.class ));
   }

   public aprobacioninternaensayo_wp( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioninternaensayo_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioninternaensayo_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Interna Ensayo";
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

