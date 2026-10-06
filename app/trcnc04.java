package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trcnc04", "/app.trcnc04"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trcnc04 extends GXWebObjectStub
{
   public trcnc04( )
   {
   }

   public trcnc04( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trcnc04.class ));
   }

   public trcnc04( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trcnc04_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trcnc04_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS CREDITO-RC (FACTURAS)";
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

