package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trcnc01", "/app.trcnc01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trcnc01 extends GXWebObjectStub
{
   public trcnc01( )
   {
   }

   public trcnc01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trcnc01.class ));
   }

   public trcnc01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trcnc01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trcnc01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MODIFICO VALORES";
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

