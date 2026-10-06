package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacvto", "/app.facturacion.tfacvto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacvto extends GXWebObjectStub
{
   public tfacvto( )
   {
   }

   public tfacvto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacvto.class ));
   }

   public tfacvto( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacvto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacvto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "VENCIMIENTOS";
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

