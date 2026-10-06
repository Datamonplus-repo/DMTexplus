package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tunmefowwexportcsv", "/app.formulaciontinte.tunmefowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tunmefowwexportcsv extends GXWebObjectStub
{
   public tunmefowwexportcsv( )
   {
   }

   public tunmefowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tunmefowwexportcsv.class ));
   }

   public tunmefowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tunmefowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tunmefowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TUNMEFOWWExport CSV";
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

