package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.wcwcwuti118_lavadosmaquinaexportcsv", "/app.core.wcwcwuti118_lavadosmaquinaexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_lavadosmaquinaexportcsv extends GXWebObjectStub
{
   public wcwcwuti118_lavadosmaquinaexportcsv( )
   {
   }

   public wcwcwuti118_lavadosmaquinaexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_lavadosmaquinaexportcsv.class ));
   }

   public wcwcwuti118_lavadosmaquinaexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_lavadosmaquinaexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_lavadosmaquinaexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWCWUti118_Lavados Maquina Export CSV";
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

