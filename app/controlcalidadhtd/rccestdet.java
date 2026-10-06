package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.rccestdet", "/app.controlcalidadhtd.rccestdet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rccestdet extends GXWebObjectStub
{
   public rccestdet( )
   {
   }

   public rccestdet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rccestdet.class ));
   }

   public rccestdet( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rccestdet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rccestdet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Est. de Controles de Calidad";
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

