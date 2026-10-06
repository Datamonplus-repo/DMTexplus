package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcpartesproduccionmaquina", "/app.wcpartesproduccionmaquina"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcpartesproduccionmaquina extends GXWebObjectStub
{
   public wcpartesproduccionmaquina( )
   {
   }

   public wcpartesproduccionmaquina( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcpartesproduccionmaquina.class ));
   }

   public wcpartesproduccionmaquina( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcpartesproduccionmaquina_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcpartesproduccionmaquina_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Partes Produccion Maquina";
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

