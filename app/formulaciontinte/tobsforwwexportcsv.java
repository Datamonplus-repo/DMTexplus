package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tobsforwwexportcsv", "/app.formulaciontinte.tobsforwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsforwwexportcsv extends GXWebObjectStub
{
   public tobsforwwexportcsv( )
   {
   }

   public tobsforwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsforwwexportcsv.class ));
   }

   public tobsforwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsforwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsforwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOBSFORWWExport CSV";
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

