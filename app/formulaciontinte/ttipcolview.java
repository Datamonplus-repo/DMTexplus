package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ttipcolview", "/app.formulaciontinte.ttipcolview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcolview extends GXWebObjectStub
{
   public ttipcolview( )
   {
   }

   public ttipcolview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcolview.class ));
   }

   public ttipcolview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcolview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcolview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPCOLView";
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

