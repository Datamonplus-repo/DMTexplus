package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedidowwexportcsv", "/app.comprasquimicos.tpedidowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedidowwexportcsv extends GXWebObjectStub
{
   public tpedidowwexportcsv( )
   {
   }

   public tpedidowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedidowwexportcsv.class ));
   }

   public tpedidowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedidowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedidowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDIDOWWExport CSV";
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

