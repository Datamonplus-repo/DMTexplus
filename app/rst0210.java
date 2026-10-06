package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0210", "/app.rst0210"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0210 extends GXWebObjectStub
{
   public rst0210( )
   {
   }

   public rst0210( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0210.class ));
   }

   public rst0210( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0210_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0210_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC PRODUCTOS,COLORANTES";
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

