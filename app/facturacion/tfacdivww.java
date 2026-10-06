package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacdivww", "/app.facturacion.tfacdivww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacdivww extends GXWebObjectStub
{
   public tfacdivww( )
   {
   }

   public tfacdivww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacdivww.class ));
   }

   public tfacdivww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacdivww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacdivww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " DIVISAS/REPRESENTANTES";
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

