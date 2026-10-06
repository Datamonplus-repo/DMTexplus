package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmeivaview", "/app.facturacion.tmeivaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmeivaview extends GXWebObjectStub
{
   public tmeivaview( )
   {
   }

   public tmeivaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmeivaview.class ));
   }

   public tmeivaview( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmeivaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmeivaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMEIVAView";
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

