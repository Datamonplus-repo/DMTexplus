package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccn", "/app.controlcalidadhtd.tccn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccn extends GXWebObjectStub
{
   public tccn( )
   {
   }

   public tccn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccn.class ));
   }

   public tccn( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "N Controles Calidad";
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

