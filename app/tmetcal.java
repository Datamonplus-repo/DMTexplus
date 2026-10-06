package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmetcal", "/app.tmetcal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetcal extends GXWebObjectStub
{
   public tmetcal( )
   {
   }

   public tmetcal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetcal.class ));
   }

   public tmetcal( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetcal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetcal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DETALLE METRAJES CALVET";
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

