package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacdiv", "/app.facturacion.tfacdiv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacdiv extends GXWebObjectStub
{
   public tfacdiv( )
   {
   }

   public tfacdiv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacdiv.class ));
   }

   public tfacdiv( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacdiv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacdiv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIVISAS/REPRESENTANTES";
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

