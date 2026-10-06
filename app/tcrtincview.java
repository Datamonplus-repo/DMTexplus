package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcrtincview", "/app.tcrtincview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcrtincview extends GXWebObjectStub
{
   public tcrtincview( )
   {
   }

   public tcrtincview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcrtincview.class ));
   }

   public tcrtincview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcrtincview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcrtincview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCRTINCView";
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

