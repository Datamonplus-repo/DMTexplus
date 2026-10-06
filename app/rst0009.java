package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0009", "/app.rst0009"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0009 extends GXWebObjectStub
{
   public rst0009( )
   {
   }

   public rst0009( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0009.class ));
   }

   public rst0009( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0009_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0009_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC STOCK PRODUCTOS,ALMACEN";
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

