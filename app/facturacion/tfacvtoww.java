package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacvtoww", "/app.facturacion.tfacvtoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacvtoww extends GXWebObjectStub
{
   public tfacvtoww( )
   {
   }

   public tfacvtoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacvtoww.class ));
   }

   public tfacvtoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacvtoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacvtoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " VENCIMIENTOS";
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

