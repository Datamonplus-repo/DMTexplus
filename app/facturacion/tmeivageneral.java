package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmeivageneral", "/app.facturacion.tmeivageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmeivageneral extends GXWebObjectStub
{
   public tmeivageneral( )
   {
   }

   public tmeivageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmeivageneral.class ));
   }

   public tmeivageneral( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmeivageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmeivageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMEIVAGeneral";
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

