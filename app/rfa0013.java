package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rfa0013", "/app.rfa0013"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0013 extends GXWebObjectStub
{
   public rfa0013( )
   {
   }

   public rfa0013( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0013.class ));
   }

   public rfa0013( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0013_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0013_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARANES SIN CONFIRMAR";
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

