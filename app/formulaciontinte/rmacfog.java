package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rmacfog", "/app.formulaciontinte.rmacfog"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmacfog extends GXWebObjectStub
{
   public rmacfog( )
   {
   }

   public rmacfog( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmacfog.class ));
   }

   public rmacfog( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmacfog_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmacfog_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RELACION ENSAYOS CON MACRO";
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

