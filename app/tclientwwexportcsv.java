package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclientwwexportcsv", "/app.tclientwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclientwwexportcsv extends GXWebObjectStub
{
   public tclientwwexportcsv( )
   {
   }

   public tclientwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclientwwexportcsv.class ));
   }

   public tclientwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclientwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclientwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIENTWWExport CSV";
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

