package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopesfi", "/app.webwopesfi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopesfi extends GXWebObjectStub
{
   public webwopesfi( )
   {
   }

   public webwopesfi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopesfi.class ));
   }

   public webwopesfi( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopesfi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopesfi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAVE ESPECIAL -COMPOSICION-";
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

