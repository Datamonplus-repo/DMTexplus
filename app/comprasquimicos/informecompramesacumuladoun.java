package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.informecompramesacumuladoun", "/app.comprasquimicos.informecompramesacumuladoun"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informecompramesacumuladoun extends GXWebObjectStub
{
   public informecompramesacumuladoun( )
   {
   }

   public informecompramesacumuladoun( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informecompramesacumuladoun.class ));
   }

   public informecompramesacumuladoun( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informecompramesacumuladoun_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informecompramesacumuladoun_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LINSES_TRN";
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

