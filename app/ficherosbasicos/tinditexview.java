package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexview", "/app.ficherosbasicos.tinditexview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexview extends GXWebObjectStub
{
   public tinditexview( )
   {
   }

   public tinditexview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexview.class ));
   }

   public tinditexview( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINDITEXView";
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

