package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclipqu", "/app.tclipqu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclipqu extends GXWebObjectStub
{
   public tclipqu( )
   {
   }

   public tclipqu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclipqu.class ));
   }

   public tclipqu( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclipqu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclipqu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Quimicos p/Cliente";
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

