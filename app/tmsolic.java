package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmsolic", "/app.tmsolic"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolic extends GXWebObjectStub
{
   public tmsolic( )
   {
   }

   public tmsolic( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolic.class ));
   }

   public tmsolic( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolic_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolic_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solicitudes de Mantenimiento";
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

