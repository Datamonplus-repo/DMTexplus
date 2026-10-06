package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetalleproductos_anyadidas", "/app.wcdetalleproductos_anyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetalleproductos_anyadidas extends GXWebObjectStub
{
   public wcdetalleproductos_anyadidas( )
   {
   }

   public wcdetalleproductos_anyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetalleproductos_anyadidas.class ));
   }

   public wcdetalleproductos_anyadidas( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetalleproductos_anyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetalleproductos_anyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " HISTORICO RECETAS (LINEAS)";
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

