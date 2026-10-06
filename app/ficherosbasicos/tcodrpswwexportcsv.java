package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrpswwexportcsv", "/app.ficherosbasicos.tcodrpswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrpswwexportcsv extends GXWebObjectStub
{
   public tcodrpswwexportcsv( )
   {
   }

   public tcodrpswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrpswwexportcsv.class ));
   }

   public tcodrpswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrpswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrpswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODRPSWWExport CSV";
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

