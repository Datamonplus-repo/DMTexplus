package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodparview", "/app.tcodparview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodparview extends GXWebObjectStub
{
   public tcodparview( )
   {
   }

   public tcodparview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodparview.class ));
   }

   public tcodparview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodparview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodparview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODPARView";
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

