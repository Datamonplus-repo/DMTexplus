package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubidep", "/app.tubidep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubidep extends GXWebObjectStub
{
   public tubidep( )
   {
   }

   public tubidep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubidep.class ));
   }

   public tubidep( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubidep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubidep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SALIDAS DE UBICACIONES";
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

