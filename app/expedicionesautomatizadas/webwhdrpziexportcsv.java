package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwhdrpziexportcsv", "/app.expedicionesautomatizadas.webwhdrpziexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwhdrpziexportcsv extends GXWebObjectStub
{
   public webwhdrpziexportcsv( )
   {
   }

   public webwhdrpziexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwhdrpziexportcsv.class ));
   }

   public webwhdrpziexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwhdrpziexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwhdrpziexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WHDRPZIExport CSV";
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

