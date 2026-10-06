package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_verproductospesadosexportcsv", "/app.cierrerecetastinte_verproductospesadosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_verproductospesadosexportcsv extends GXWebObjectStub
{
   public cierrerecetastinte_verproductospesadosexportcsv( )
   {
   }

   public cierrerecetastinte_verproductospesadosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_verproductospesadosexportcsv.class ));
   }

   public cierrerecetastinte_verproductospesadosexportcsv( int remoteHandle ,
                                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_verproductospesadosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_verproductospesadosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte_Ver Productos Pesados Export CSV";
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

