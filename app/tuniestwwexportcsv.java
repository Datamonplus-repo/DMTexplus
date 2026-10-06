package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tuniestwwexportcsv", "/app.tuniestwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tuniestwwexportcsv extends GXWebObjectStub
{
   public tuniestwwexportcsv( )
   {
   }

   public tuniestwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tuniestwwexportcsv.class ));
   }

   public tuniestwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tuniestwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tuniestwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TUNIESTWWExport CSV";
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

