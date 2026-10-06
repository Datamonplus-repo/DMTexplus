package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcosfij", "/app.tcosfij"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcosfij extends GXWebObjectStub
{
   public tcosfij( )
   {
   }

   public tcosfij( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcosfij.class ));
   }

   public tcosfij( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcosfij_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcosfij_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Fijos";
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

