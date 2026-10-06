package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspwwexportcsv", "/app.ficherosbasicos.ttranspwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspwwexportcsv extends GXWebObjectStub
{
   public ttranspwwexportcsv( )
   {
   }

   public ttranspwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspwwexportcsv.class ));
   }

   public ttranspwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTRANSPWWExport CSV";
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

