package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprodview", "/app.tbcprodview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprodview extends GXWebObjectStub
{
   public tbcprodview( )
   {
   }

   public tbcprodview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprodview.class ));
   }

   public tbcprodview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprodview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprodview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TBCPRODView";
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

