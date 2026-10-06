package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trefhdr", "/app.trefhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trefhdr extends GXWebObjectStub
{
   public trefhdr( )
   {
   }

   public trefhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trefhdr.class ));
   }

   public trefhdr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trefhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trefhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "REFERENCIAS HOJAS DE RUTA";
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

