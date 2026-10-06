package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrpsgeneral", "/app.ficherosbasicos.tcodrpsgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrpsgeneral extends GXWebObjectStub
{
   public tcodrpsgeneral( )
   {
   }

   public tcodrpsgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrpsgeneral.class ));
   }

   public tcodrpsgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrpsgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrpsgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODRPSGeneral";
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

