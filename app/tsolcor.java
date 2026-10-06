package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsolcor", "/app.tsolcor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolcor extends GXWebObjectStub
{
   public tsolcor( )
   {
   }

   public tsolcor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolcor.class ));
   }

   public tsolcor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolcor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolcor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST SOLIDEZ PARA LAVADO";
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

