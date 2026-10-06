package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipvalwwexportcsv", "/app.stocksquimicos.ttipvalwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipvalwwexportcsv extends GXWebObjectStub
{
   public ttipvalwwexportcsv( )
   {
   }

   public ttipvalwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipvalwwexportcsv.class ));
   }

   public ttipvalwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipvalwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipvalwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPVALWWExport CSV";
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

