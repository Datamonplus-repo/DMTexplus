package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarfae", "/app.tbarfae"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarfae extends GXWebObjectStub
{
   public tbarfae( )
   {
   }

   public tbarfae( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarfae.class ));
   }

   public tbarfae( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarfae_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarfae_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCESOS / FASES";
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

