package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclimarcasgeneral", "/app.ficherosbasicos.tclimarcasgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimarcasgeneral extends GXWebObjectStub
{
   public tclimarcasgeneral( )
   {
   }

   public tclimarcasgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimarcasgeneral.class ));
   }

   public tclimarcasgeneral( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimarcasgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimarcasgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIMARCASGeneral";
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

