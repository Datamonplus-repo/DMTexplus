package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclipla", "/app.tclipla"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclipla extends GXWebObjectStub
{
   public tclipla( )
   {
   }

   public tclipla( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclipla.class ));
   }

   public tclipla( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclipla_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclipla_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PLANIFICACION P/CLIENTE";
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

