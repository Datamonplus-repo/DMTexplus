package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0a15", "/app.rst0a15"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0a15 extends GXWebObjectStub
{
   public rst0a15( )
   {
   }

   public rst0a15( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0a15.class ));
   }

   public rst0a15( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0a15_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0a15_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Est. formulas, pastas, colores";
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

