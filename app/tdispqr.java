package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdispqr", "/app.tdispqr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdispqr extends GXWebObjectStub
{
   public tdispqr( )
   {
   }

   public tdispqr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdispqr.class ));
   }

   public tdispqr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdispqr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdispqr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Disolucion Quimicos REPROCESO";
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

