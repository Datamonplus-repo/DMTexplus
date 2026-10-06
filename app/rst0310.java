package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0310", "/app.rst0310"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0310 extends GXWebObjectStub
{
   public rst0310( )
   {
   }

   public rst0310( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0310.class ));
   }

   public rst0310( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0310_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0310_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC PRODUCTOS,AUXILIARES";
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

