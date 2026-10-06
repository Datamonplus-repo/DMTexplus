package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.arcctcli2", "/app.controlcalidadhtd.arcctcli2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arcctcli2 extends GXWebObjectStub
{
   public arcctcli2( )
   {
   }

   public arcctcli2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arcctcli2.class ));
   }

   public arcctcli2( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arcctcli2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arcctcli2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCTCli2";
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

