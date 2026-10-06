package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevend", "/app.ficherosbasicos.trevend"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevend extends GXWebObjectStub
{
   public trevend( )
   {
   }

   public trevend( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevend.class ));
   }

   public trevend( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevend_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevend_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Revendores";
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

