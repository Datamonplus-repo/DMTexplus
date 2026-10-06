package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentosproductos", "/app.entradarecuentosproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentosproductos extends GXWebObjectStub
{
   public entradarecuentosproductos( )
   {
   }

   public entradarecuentosproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentosproductos.class ));
   }

   public entradarecuentosproductos( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentosproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentosproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " RECUENTOS";
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

