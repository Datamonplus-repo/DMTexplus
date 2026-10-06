package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.programatinte_wp", "/app.pedidosclientesindetalle.programatinte_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programatinte_wp extends GXWebObjectStub
{
   public programatinte_wp( )
   {
   }

   public programatinte_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programatinte_wp.class ));
   }

   public programatinte_wp( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programatinte_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programatinte_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Programas Tinte";
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

