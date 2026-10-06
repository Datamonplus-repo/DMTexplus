package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsubcla", "/app.tsubcla"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsubcla extends GXWebObjectStub
{
   public tsubcla( )
   {
   }

   public tsubcla( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsubcla.class ));
   }

   public tsubcla( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsubcla_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsubcla_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de SUBCLASIFICACIONES";
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

