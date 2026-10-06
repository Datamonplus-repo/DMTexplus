package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trcnc00", "/app.trcnc00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trcnc00 extends GXWebObjectStub
{
   public trcnc00( )
   {
   }

   public trcnc00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trcnc00.class ));
   }

   public trcnc00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trcnc00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trcnc00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS CREDITO - RECLAMACIONES";
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

