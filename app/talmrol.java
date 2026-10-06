package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmrol", "/app.talmrol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmrol extends GXWebObjectStub
{
   public talmrol( )
   {
   }

   public talmrol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmrol.class ));
   }

   public talmrol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmrol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmrol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA PIEZAS";
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

