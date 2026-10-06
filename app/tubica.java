package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubica", "/app.tubica"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubica extends GXWebObjectStub
{
   public tubica( )
   {
   }

   public tubica( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubica.class ));
   }

   public tubica( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubica_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubica_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA UBICACIONES";
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

