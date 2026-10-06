package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspview", "/app.ficherosbasicos.ttranspview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspview extends GXWebObjectStub
{
   public ttranspview( )
   {
   }

   public ttranspview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspview.class ));
   }

   public ttranspview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTRANSPView";
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

