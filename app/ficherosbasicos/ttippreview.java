package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttippreview", "/app.ficherosbasicos.ttippreview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttippreview extends GXWebObjectStub
{
   public ttippreview( )
   {
   }

   public ttippreview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttippreview.class ));
   }

   public ttippreview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttippreview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttippreview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPREView";
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

