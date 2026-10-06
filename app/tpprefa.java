package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpprefa", "/app.tpprefa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpprefa extends GXWebObjectStub
{
   public tpprefa( )
   {
   }

   public tpprefa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpprefa.class ));
   }

   public tpprefa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpprefa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpprefa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LLAMADA DESDE WKP";
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

