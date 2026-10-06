package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpeq000", "/app.tpeq000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpeq000 extends GXWebObjectStub
{
   public tpeq000( )
   {
   }

   public tpeq000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpeq000.class ));
   }

   public tpeq000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpeq000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpeq000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden Grabacion PEQUES";
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

