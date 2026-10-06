package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccaud_wc", "/app.controlcalidadhtd.wccaud_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccaud_wc extends GXWebObjectStub
{
   public wccaud_wc( )
   {
   }

   public wccaud_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccaud_wc.class ));
   }

   public wccaud_wc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccaud_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccaud_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Auditoria de los CC";
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

