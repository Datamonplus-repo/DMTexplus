package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubi002", "/app.tubi002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubi002 extends GXWebObjectStub
{
   public tubi002( )
   {
   }

   public tubi002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubi002.class ));
   }

   public tubi002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubi002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubi002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UBICACION HDR FINALIZADA";
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

