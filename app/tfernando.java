package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfernando", "/app.tfernando"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfernando extends GXWebObjectStub
{
   public tfernando( )
   {
   }

   public tfernando( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfernando.class ));
   }

   public tfernando( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfernando_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfernando_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test";
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

