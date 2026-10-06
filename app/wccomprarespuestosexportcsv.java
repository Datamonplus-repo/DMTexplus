package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccomprarespuestosexportcsv", "/app.wccomprarespuestosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccomprarespuestosexportcsv extends GXWebObjectStub
{
   public wccomprarespuestosexportcsv( )
   {
   }

   public wccomprarespuestosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccomprarespuestosexportcsv.class ));
   }

   public wccomprarespuestosexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccomprarespuestosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccomprarespuestosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCCompra Respuestos Export CSV";
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

