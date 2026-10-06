package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticl", "/app.tarticl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticl extends GXWebObjectStub
{
   public tarticl( )
   {
   }

   public tarticl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticl.class ));
   }

   public tarticl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA TECNICA ARTICULO";
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

