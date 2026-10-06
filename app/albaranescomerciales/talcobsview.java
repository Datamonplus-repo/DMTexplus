package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobsview", "/app.albaranescomerciales.talcobsview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobsview extends GXWebObjectStub
{
   public talcobsview( )
   {
   }

   public talcobsview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobsview.class ));
   }

   public talcobsview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobsview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobsview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALCOBSView";
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

