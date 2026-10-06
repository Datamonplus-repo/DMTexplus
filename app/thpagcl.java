package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thpagcl", "/app.thpagcl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thpagcl extends GXWebObjectStub
{
   public thpagcl( )
   {
   }

   public thpagcl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thpagcl.class ));
   }

   public thpagcl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thpagcl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thpagcl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO PAGOS";
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

