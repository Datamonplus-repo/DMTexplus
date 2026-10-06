package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttrmww", "/app.ficherosbasicos.ttrmww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrmww extends GXWebObjectStub
{
   public ttrmww( )
   {
   }

   public ttrmww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrmww.class ));
   }

   public ttrmww( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrmww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrmww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TRM";
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

