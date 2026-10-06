package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlincidencias_wc", "/app.controlincidencias_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlincidencias_wc extends GXWebObjectStub
{
   public controlincidencias_wc( )
   {
   }

   public controlincidencias_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlincidencias_wc.class ));
   }

   public controlincidencias_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlincidencias_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlincidencias_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla CRTIN1";
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

