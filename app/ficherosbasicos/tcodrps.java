package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrps", "/app.ficherosbasicos.tcodrps"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrps extends GXWebObjectStub
{
   public tcodrps( )
   {
   }

   public tcodrps( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrps.class ));
   }

   public tcodrps( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrps_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrps_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Responsabilidades";
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

