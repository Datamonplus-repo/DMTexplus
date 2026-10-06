package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasobs", "/app.tfasobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasobs extends GXWebObjectStub
{
   public tfasobs( )
   {
   }

   public tfasobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasobs.class ));
   }

   public tfasobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES";
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

