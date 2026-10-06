package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobsview", "/app.tpedobsview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobsview extends GXWebObjectStub
{
   public tpedobsview( )
   {
   }

   public tpedobsview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobsview.class ));
   }

   public tpedobsview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobsview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobsview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDOBSView";
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

