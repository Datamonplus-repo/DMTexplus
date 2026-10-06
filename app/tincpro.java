package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tincpro", "/app.tincpro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tincpro extends GXWebObjectStub
{
   public tincpro( )
   {
   }

   public tincpro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tincpro.class ));
   }

   public tincpro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tincpro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tincpro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Incidencias de Producción";
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

