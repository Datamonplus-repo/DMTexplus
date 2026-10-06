package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdrinout", "/app.thdrinout"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdrinout extends GXWebObjectStub
{
   public thdrinout( )
   {
   }

   public thdrinout( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdrinout.class ));
   }

   public thdrinout( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdrinout_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdrinout_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MOVIMIENTOS DE UNA HDR";
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

