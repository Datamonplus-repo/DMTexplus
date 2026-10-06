package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisawwexportreport", "/app.ficherosbasicos.tdivisawwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisawwexportreport extends GXWebObjectStub
{
   public tdivisawwexportreport( )
   {
   }

   public tdivisawwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisawwexportreport.class ));
   }

   public tdivisawwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisawwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisawwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Divisas";
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

