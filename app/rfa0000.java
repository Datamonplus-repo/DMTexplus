package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rfa0000", "/app.rfa0000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0000 extends GXWebObjectStub
{
   public rfa0000( )
   {
   }

   public rfa0000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0000.class ));
   }

   public rfa0000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARANES SIN PRECIO/SIN CONFI";
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

