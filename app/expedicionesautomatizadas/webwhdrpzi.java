package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwhdrpzi", "/app.expedicionesautomatizadas.webwhdrpzi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwhdrpzi extends GXWebObjectStub
{
   public webwhdrpzi( )
   {
   }

   public webwhdrpzi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwhdrpzi.class ));
   }

   public webwhdrpzi( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwhdrpzi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwhdrpzi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla BARPIE";
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

