package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlcoobs", "/app.tlcoobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlcoobs extends GXWebObjectStub
{
   public tlcoobs( )
   {
   }

   public tlcoobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlcoobs.class ));
   }

   public tlcoobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlcoobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlcoobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lineas Observaciones";
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

