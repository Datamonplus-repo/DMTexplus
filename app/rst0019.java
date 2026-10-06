package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0019", "/app.rst0019"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0019 extends GXWebObjectStub
{
   public rst0019( )
   {
   }

   public rst0019( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0019.class ));
   }

   public rst0019( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0019_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0019_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO PRODUCTOS A RECONTAR";
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

