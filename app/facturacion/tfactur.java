package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfactur", "/app.facturacion.tfactur"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfactur extends GXWebObjectStub
{
   public tfactur( )
   {
   }

   public tfactur( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfactur.class ));
   }

   public tfactur( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfactur_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfactur_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO DE FACTURAS";
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

