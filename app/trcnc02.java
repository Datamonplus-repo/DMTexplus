package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trcnc02", "/app.trcnc02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trcnc02 extends GXWebObjectStub
{
   public trcnc02( )
   {
   }

   public trcnc02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trcnc02.class ));
   }

   public trcnc02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trcnc02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trcnc02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS CREDITO-RECLAMACIONES (GUIAS)";
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

