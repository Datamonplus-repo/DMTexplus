package app.calidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidadhtd.calidadhtd_headerww", "/app.calidadhtd.calidadhtd_headerww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calidadhtd_headerww extends GXWebObjectStub
{
   public calidadhtd_headerww( )
   {
   }

   public calidadhtd_headerww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calidadhtd_headerww.class ));
   }

   public calidadhtd_headerww( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calidadhtd_headerww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calidadhtd_headerww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Calidad HTD (header)";
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

