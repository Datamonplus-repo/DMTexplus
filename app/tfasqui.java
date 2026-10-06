package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasqui", "/app.tfasqui"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasqui extends GXWebObjectStub
{
   public tfasqui( )
   {
   }

   public tfasqui( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasqui.class ));
   }

   public tfasqui( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasqui_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasqui_impl(context).cleanup();
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

