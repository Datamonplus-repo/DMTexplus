package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdispqu", "/app.tdispqu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdispqu extends GXWebObjectStub
{
   public tdispqu( )
   {
   }

   public tdispqu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdispqu.class ));
   }

   public tdispqu( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdispqu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdispqu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Disolucion Quimicos";
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

