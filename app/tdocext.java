package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdocext", "/app.tdocext"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdocext extends GXWebObjectStub
{
   public tdocext( )
   {
   }

   public tdocext( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdocext.class ));
   }

   public tdocext( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdocext_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdocext_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentos Externos";
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

