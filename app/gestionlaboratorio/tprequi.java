package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tprequi", "/app.gestionlaboratorio.tprequi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprequi extends GXWebObjectStub
{
   public tprequi( )
   {
   }

   public tprequi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprequi.class ));
   }

   public tprequi( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprequi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprequi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Preparaciones LAB";
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

