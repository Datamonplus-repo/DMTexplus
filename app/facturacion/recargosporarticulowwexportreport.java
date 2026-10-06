package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.recargosporarticulowwexportreport", "/app.facturacion.recargosporarticulowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recargosporarticulowwexportreport extends GXWebObjectStub
{
   public recargosporarticulowwexportreport( )
   {
   }

   public recargosporarticulowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recargosporarticulowwexportreport.class ));
   }

   public recargosporarticulowwexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recargosporarticulowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recargosporarticulowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recargospor Articulo WWExport Report";
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

