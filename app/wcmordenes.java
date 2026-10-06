package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcmordenes", "/app.wcmordenes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcmordenes extends GXWebObjectStub
{
   public wcmordenes( )
   {
   }

   public wcmordenes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcmordenes.class ));
   }

   public wcmordenes( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcmordenes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcmordenes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Ordenes de Mantenimiento";
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

