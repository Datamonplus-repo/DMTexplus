package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevalm", "/app.rdevalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevalm extends GXWebObjectStub
{
   public rdevalm( )
   {
   }

   public rdevalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevalm.class ));
   }

   public rdevalm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTA DE DEVOLUCION PRODUCTO";
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

