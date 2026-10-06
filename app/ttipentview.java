package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipentview", "/app.ttipentview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipentview extends GXWebObjectStub
{
   public ttipentview( )
   {
   }

   public ttipentview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipentview.class ));
   }

   public ttipentview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipentview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipentview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPENTView";
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

