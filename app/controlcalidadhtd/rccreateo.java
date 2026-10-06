package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.rccreateo", "/app.controlcalidadhtd.rccreateo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rccreateo extends GXWebObjectStub
{
   public rccreateo( )
   {
   }

   public rccreateo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rccreateo.class ));
   }

   public rccreateo( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rccreateo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rccreateo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Comprobación Real/Teórica";
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

