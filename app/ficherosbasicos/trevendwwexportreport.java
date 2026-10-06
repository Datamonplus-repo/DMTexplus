package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevendwwexportreport", "/app.ficherosbasicos.trevendwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevendwwexportreport extends GXWebObjectStub
{
   public trevendwwexportreport( )
   {
   }

   public trevendwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevendwwexportreport.class ));
   }

   public trevendwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevendwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevendwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Revendedores";
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

