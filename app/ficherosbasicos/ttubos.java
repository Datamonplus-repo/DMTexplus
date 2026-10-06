package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttubos", "/app.ficherosbasicos.ttubos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttubos extends GXWebObjectStub
{
   public ttubos( )
   {
   }

   public ttubos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttubos.class ));
   }

   public ttubos( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttubos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttubos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tubos";
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

