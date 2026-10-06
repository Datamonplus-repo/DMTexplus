package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlcocol", "/app.tlcocol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlcocol extends GXWebObjectStub
{
   public tlcocol( )
   {
   }

   public tlcocol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlcocol.class ));
   }

   public tlcocol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlcocol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlcocol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos";
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

