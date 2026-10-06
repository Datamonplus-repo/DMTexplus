package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_lavadosmaquina", "/app.wcwcwuti118_lavadosmaquina"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_lavadosmaquina extends GXWebObjectStub
{
   public wcwcwuti118_lavadosmaquina( )
   {
   }

   public wcwcwuti118_lavadosmaquina( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_lavadosmaquina.class ));
   }

   public wcwcwuti118_lavadosmaquina( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_lavadosmaquina_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_lavadosmaquina_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla CCSTKS";
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

