package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmeivaww", "/app.facturacion.tmeivaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmeivaww extends GXWebObjectStub
{
   public tmeivaww( )
   {
   }

   public tmeivaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmeivaww.class ));
   }

   public tmeivaww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmeivaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmeivaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Razões para isenção de IVA";
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

