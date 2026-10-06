package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefwwexportcsv", "/app.tcatdefwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefwwexportcsv extends GXWebObjectStub
{
   public tcatdefwwexportcsv( )
   {
   }

   public tcatdefwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefwwexportcsv.class ));
   }

   public tcatdefwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCat Def WWExport CSV";
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

