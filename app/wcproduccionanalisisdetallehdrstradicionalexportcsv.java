package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionanalisisdetallehdrstradicionalexportcsv", "/app.wcproduccionanalisisdetallehdrstradicionalexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionanalisisdetallehdrstradicionalexportcsv extends GXWebObjectStub
{
   public wcproduccionanalisisdetallehdrstradicionalexportcsv( )
   {
   }

   public wcproduccionanalisisdetallehdrstradicionalexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionanalisisdetallehdrstradicionalexportcsv.class ));
   }

   public wcproduccionanalisisdetallehdrstradicionalexportcsv( int remoteHandle ,
                                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionanalisisdetallehdrstradicionalexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionanalisisdetallehdrstradicionalexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Analisis Detalle Hdrs Tradicional Export CSV";
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

