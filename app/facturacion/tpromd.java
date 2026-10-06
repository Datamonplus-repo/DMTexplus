package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpromd", "/app.facturacion.tpromd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpromd extends GXWebObjectStub
{
   public tpromd( )
   {
   }

   public tpromd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpromd.class ));
   }

   public tpromd( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpromd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpromd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programas de Tint. Moda 21";
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

