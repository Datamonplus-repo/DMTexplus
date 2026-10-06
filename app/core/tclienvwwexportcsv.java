package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.tclienvwwexportcsv", "/app.core.tclienvwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclienvwwexportcsv extends GXWebObjectStub
{
   public tclienvwwexportcsv( )
   {
   }

   public tclienvwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclienvwwexportcsv.class ));
   }

   public tclienvwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclienvwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclienvwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIENVWWExport CSV";
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

