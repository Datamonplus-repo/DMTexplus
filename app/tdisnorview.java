package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnorview", "/app.tdisnorview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnorview extends GXWebObjectStub
{
   public tdisnorview( )
   {
   }

   public tdisnorview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnorview.class ));
   }

   public tdisnorview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnorview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnorview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDISNORView";
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

