package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbrl1", "/app.talbrl1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbrl1 extends GXWebObjectStub
{
   public talbrl1( )
   {
   }

   public talbrl1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbrl1.class ));
   }

   public talbrl1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbrl1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbrl1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mant de Albaranes de Recepción";
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

