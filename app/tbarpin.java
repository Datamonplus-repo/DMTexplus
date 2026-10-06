package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarpin", "/app.tbarpin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarpin extends GXWebObjectStub
{
   public tbarpin( )
   {
   }

   public tbarpin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarpin.class ));
   }

   public tbarpin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarpin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarpin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Kilos, Metros y Piezas";
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

