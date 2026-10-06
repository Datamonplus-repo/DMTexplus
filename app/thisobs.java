package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thisobs", "/app.thisobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thisobs extends GXWebObjectStub
{
   public thisobs( )
   {
   }

   public thisobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thisobs.class ));
   }

   public thisobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thisobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thisobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO OBSERVACIONES RECETA";
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

