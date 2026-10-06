package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.arcctcli", "/app.controlcalidadhtd.arcctcli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arcctcli extends GXWebObjectStub
{
   public arcctcli( )
   {
   }

   public arcctcli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arcctcli.class ));
   }

   public arcctcli( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arcctcli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arcctcli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "C.C. por Cli./Serie/Color";
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

