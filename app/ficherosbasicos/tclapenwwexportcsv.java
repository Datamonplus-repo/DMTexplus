package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclapenwwexportcsv", "/app.ficherosbasicos.tclapenwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclapenwwexportcsv extends GXWebObjectStub
{
   public tclapenwwexportcsv( )
   {
   }

   public tclapenwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclapenwwexportcsv.class ));
   }

   public tclapenwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclapenwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclapenwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLAPENWWExport CSV";
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

