package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpncyrcexportcsv", "/app.wpncyrcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpncyrcexportcsv extends GXWebObjectStub
{
   public wpncyrcexportcsv( )
   {
   }

   public wpncyrcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpncyrcexportcsv.class ));
   }

   public wpncyrcexportcsv( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpncyrcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpncyrcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WPNcy Rc Export CSV";
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

