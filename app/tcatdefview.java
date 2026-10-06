package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefview", "/app.tcatdefview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefview extends GXWebObjectStub
{
   public tcatdefview( )
   {
   }

   public tcatdefview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefview.class ));
   }

   public tcatdefview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCat Def View";
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

