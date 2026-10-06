package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfrtohd", "/app.tfrtohd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrtohd extends GXWebObjectStub
{
   public tfrtohd( )
   {
   }

   public tfrtohd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrtohd.class ));
   }

   public tfrtohd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrtohd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrtohd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Intercambio HDR";
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

