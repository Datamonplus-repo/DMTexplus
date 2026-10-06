package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarfso", "/app.tbarfso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarfso extends GXWebObjectStub
{
   public tbarfso( )
   {
   }

   public tbarfso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarfso.class ));
   }

   public tbarfso( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarfso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarfso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones";
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

