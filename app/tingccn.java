package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tingccn", "/app.tingccn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tingccn extends GXWebObjectStub
{
   public tingccn( )
   {
   }

   public tingccn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tingccn.class ));
   }

   public tingccn( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tingccn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tingccn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO n CONTROLES CALIDAD";
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

