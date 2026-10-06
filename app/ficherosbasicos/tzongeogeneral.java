package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeogeneral", "/app.ficherosbasicos.tzongeogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeogeneral extends GXWebObjectStub
{
   public tzongeogeneral( )
   {
   }

   public tzongeogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeogeneral.class ));
   }

   public tzongeogeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TZONGEOGeneral";
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

