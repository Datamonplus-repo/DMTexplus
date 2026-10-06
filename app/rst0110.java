package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0110", "/app.rst0110"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0110 extends GXWebObjectStub
{
   public rst0110( )
   {
   }

   public rst0110( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0110.class ));
   }

   public rst0110( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0110_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0110_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC CONSUMOS,PRODUCTOS(1)";
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

