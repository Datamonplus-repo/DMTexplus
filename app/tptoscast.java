package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tptoscast", "/app.tptoscast"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tptoscast extends GXWebObjectStub
{
   public tptoscast( )
   {
   }

   public tptoscast( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tptoscast.class ));
   }

   public tptoscast( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tptoscast_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tptoscast_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Puntos Castigo";
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

