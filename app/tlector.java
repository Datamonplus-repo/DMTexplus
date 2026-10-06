package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlector", "/app.tlector"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlector extends GXWebObjectStub
{
   public tlector( )
   {
   }

   public tlector( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlector.class ));
   }

   public tlector( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlector_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlector_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento tabla LECTOR";
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

