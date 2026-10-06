package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.infil", "/app.ingenieria.infil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class infil extends GXWebObjectStub
{
   public infil( )
   {
   }

   public infil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( infil.class ));
   }

   public infil( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new infil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new infil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "In Fil";
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

