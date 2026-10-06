package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisobs", "/app.tdisobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisobs extends GXWebObjectStub
{
   public tdisobs( )
   {
   }

   public tdisobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisobs.class ));
   }

   public tdisobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisobs_impl(context).cleanup();
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

