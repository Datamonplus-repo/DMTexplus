package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_verproductospesadosexportreport", "/app.cierrerecetastinte_verproductospesadosexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_verproductospesadosexportreport extends GXWebObjectStub
{
   public cierrerecetastinte_verproductospesadosexportreport( )
   {
   }

   public cierrerecetastinte_verproductospesadosexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_verproductospesadosexportreport.class ));
   }

   public cierrerecetastinte_verproductospesadosexportreport( int remoteHandle ,
                                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_verproductospesadosexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_verproductospesadosexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte_Ver Productos Pesados Export Report";
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

