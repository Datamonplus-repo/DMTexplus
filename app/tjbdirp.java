package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tjbdirp", "/app.tjbdirp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tjbdirp extends GXWebObjectStub
{
   public tjbdirp( )
   {
   }

   public tjbdirp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tjbdirp.class ));
   }

   public tjbdirp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tjbdirp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tjbdirp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Direcciones Pedidos de JBP";
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

