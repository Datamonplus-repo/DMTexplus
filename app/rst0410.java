package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0410", "/app.rst0410"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0410 extends GXWebObjectStub
{
   public rst0410( )
   {
   }

   public rst0410( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0410.class ));
   }

   public rst0410( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0410_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0410_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC PRODUCTOS,DROGAS";
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

