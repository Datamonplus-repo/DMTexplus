package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_verproductospesados", "/app.cierrerecetastinte_verproductospesados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_verproductospesados extends GXWebObjectStub
{
   public cierrerecetastinte_verproductospesados( )
   {
   }

   public cierrerecetastinte_verproductospesados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_verproductospesados.class ));
   }

   public cierrerecetastinte_verproductospesados( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_verproductospesados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_verproductospesados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Pesados";
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

