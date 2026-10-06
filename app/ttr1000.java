package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr1000", "/app.ttr1000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr1000 extends GXWebObjectStub
{
   public ttr1000( )
   {
   }

   public ttr1000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr1000.class ));
   }

   public ttr1000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr1000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr1000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA COSTES";
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

