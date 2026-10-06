package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcpartesproduccionexportcsv", "/app.wcpartesproduccionexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcpartesproduccionexportcsv extends GXWebObjectStub
{
   public wcpartesproduccionexportcsv( )
   {
   }

   public wcpartesproduccionexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcpartesproduccionexportcsv.class ));
   }

   public wcpartesproduccionexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcpartesproduccionexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcpartesproduccionexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCPartes Produccion Export CSV";
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

