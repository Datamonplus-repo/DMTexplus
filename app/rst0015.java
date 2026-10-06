package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0015", "/app.rst0015"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0015 extends GXWebObjectStub
{
   public rst0015( )
   {
   }

   public rst0015( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0015.class ));
   }

   public rst0015( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0015_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0015_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORMACION PRODUCTO";
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

