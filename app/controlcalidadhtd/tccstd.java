package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccstd", "/app.controlcalidadhtd.tccstd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccstd extends GXWebObjectStub
{
   public tccstd( )
   {
   }

   public tccstd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccstd.class ));
   }

   public tccstd( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccstd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccstd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Calidad Standard";
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

