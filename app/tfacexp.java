package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfacexp", "/app.tfacexp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacexp extends GXWebObjectStub
{
   public tfacexp( )
   {
   }

   public tfacexp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacexp.class ));
   }

   public tfacexp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacexp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacexp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DATOS FACTURA EXPORTACION";
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

