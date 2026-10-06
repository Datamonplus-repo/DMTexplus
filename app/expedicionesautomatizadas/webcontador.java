package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador", "/app.expedicionesautomatizadas.webcontador"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador extends GXWebObjectStub
{
   public webcontador( )
   {
   }

   public webcontador( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador.class ));
   }

   public webcontador( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Contador";
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

