package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_alerta", "/app.ingenieria.mrec_alerta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_alerta extends GXWebObjectStub
{
   public mrec_alerta( )
   {
   }

   public mrec_alerta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_alerta.class ));
   }

   public mrec_alerta( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_alerta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_alerta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Alertas";
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

