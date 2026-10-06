package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionmaquinasfases", "/app.wcproduccionmaquinasfases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionmaquinasfases extends GXWebObjectStub
{
   public wcproduccionmaquinasfases( )
   {
   }

   public wcproduccionmaquinasfases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionmaquinasfases.class ));
   }

   public wcproduccionmaquinasfases( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionmaquinasfases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionmaquinasfases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Maquinas Fases";
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

