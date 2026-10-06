package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcdencproductos_anyadidas", "/app.wcwcdencproductos_anyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcdencproductos_anyadidas extends GXWebObjectStub
{
   public wcwcdencproductos_anyadidas( )
   {
   }

   public wcwcdencproductos_anyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcdencproductos_anyadidas.class ));
   }

   public wcwcdencproductos_anyadidas( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcdencproductos_anyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcdencproductos_anyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Productos (Añadidas)";
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

