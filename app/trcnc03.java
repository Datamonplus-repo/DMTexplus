package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trcnc03", "/app.trcnc03"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trcnc03 extends GXWebObjectStub
{
   public trcnc03( )
   {
   }

   public trcnc03( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trcnc03.class ));
   }

   public trcnc03( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trcnc03_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trcnc03_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA LINEA NO RECLAMACION";
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

