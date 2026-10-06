package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpartesproduccionexportcsv", "/app.webpartesproduccionexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpartesproduccionexportcsv extends GXWebObjectStub
{
   public webpartesproduccionexportcsv( )
   {
   }

   public webpartesproduccionexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpartesproduccionexportcsv.class ));
   }

   public webpartesproduccionexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpartesproduccionexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpartesproduccionexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Partes Produccion Export CSV";
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

