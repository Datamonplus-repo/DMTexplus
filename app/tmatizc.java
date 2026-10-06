package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmatizc", "/app.tmatizc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmatizc extends GXWebObjectStub
{
   public tmatizc( )
   {
   }

   public tmatizc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmatizc.class ));
   }

   public tmatizc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmatizc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmatizc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTADORES DE COLORES";
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

