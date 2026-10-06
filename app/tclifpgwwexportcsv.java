package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclifpgwwexportcsv", "/app.tclifpgwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclifpgwwexportcsv extends GXWebObjectStub
{
   public tclifpgwwexportcsv( )
   {
   }

   public tclifpgwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclifpgwwexportcsv.class ));
   }

   public tclifpgwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclifpgwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclifpgwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIFPGWWExport CSV";
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

