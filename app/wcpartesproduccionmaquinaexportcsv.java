package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcpartesproduccionmaquinaexportcsv", "/app.wcpartesproduccionmaquinaexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcpartesproduccionmaquinaexportcsv extends GXWebObjectStub
{
   public wcpartesproduccionmaquinaexportcsv( )
   {
   }

   public wcpartesproduccionmaquinaexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcpartesproduccionmaquinaexportcsv.class ));
   }

   public wcpartesproduccionmaquinaexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcpartesproduccionmaquinaexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcpartesproduccionmaquinaexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCPartes Produccion Maquina Export CSV";
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

