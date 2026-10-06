package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisqui", "/app.tdisqui"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisqui extends GXWebObjectStub
{
   public tdisqui( )
   {
   }

   public tdisqui( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisqui.class ));
   }

   public tdisqui( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisqui_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisqui_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCESOS QUIMICOS P/FASE";
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

