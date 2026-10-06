package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlreest", "/app.tlreest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlreest extends GXWebObjectStub
{
   public tlreest( )
   {
   }

   public tlreest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlreest.class ));
   }

   public tlreest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlreest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlreest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "receta estampacion";
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

