package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionoperarios", "/app.wcproduccionoperarios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionoperarios extends GXWebObjectStub
{
   public wcproduccionoperarios( )
   {
   }

   public wcproduccionoperarios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionoperarios.class ));
   }

   public wcproduccionoperarios( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionoperarios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionoperarios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Operarios";
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

