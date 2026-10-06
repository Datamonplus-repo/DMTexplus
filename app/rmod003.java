package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rmod003", "/app.rmod003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod003 extends GXWebObjectStub
{
   public rmod003( )
   {
   }

   public rmod003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod003.class ));
   }

   public rmod003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SAIDAS DE PRODUCTOS";
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

