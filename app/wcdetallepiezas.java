package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetallepiezas", "/app.wcdetallepiezas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetallepiezas extends GXWebObjectStub
{
   public wcdetallepiezas( )
   {
   }

   public wcdetallepiezas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetallepiezas.class ));
   }

   public wcdetallepiezas( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetallepiezas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetallepiezas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Almacen Entradas Tela (Detail)";
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

