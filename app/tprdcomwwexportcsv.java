package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdcomwwexportcsv", "/app.tprdcomwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdcomwwexportcsv extends GXWebObjectStub
{
   public tprdcomwwexportcsv( )
   {
   }

   public tprdcomwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdcomwwexportcsv.class ));
   }

   public tprdcomwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdcomwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdcomwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRDCOMWWExport CSV";
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

