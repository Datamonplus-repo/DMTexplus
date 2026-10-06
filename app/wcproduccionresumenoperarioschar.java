package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionresumenoperarioschar", "/app.wcproduccionresumenoperarioschar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionresumenoperarioschar extends GXWebObjectStub
{
   public wcproduccionresumenoperarioschar( )
   {
   }

   public wcproduccionresumenoperarioschar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionresumenoperarioschar.class ));
   }

   public wcproduccionresumenoperarioschar( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionresumenoperarioschar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionresumenoperarioschar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Resumen Operarios Char";
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

