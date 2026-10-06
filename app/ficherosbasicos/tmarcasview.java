package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcasview", "/app.ficherosbasicos.tmarcasview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcasview extends GXWebObjectStub
{
   public tmarcasview( )
   {
   }

   public tmarcasview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcasview.class ));
   }

   public tmarcasview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcasview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcasview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMARCASView";
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

