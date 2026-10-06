package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparenl", "/app.tparenl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparenl extends GXWebObjectStub
{
   public tparenl( )
   {
   }

   public tparenl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparenl.class ));
   }

   public tparenl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparenl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparenl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAMPO ENLACE ORGATEX";
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

