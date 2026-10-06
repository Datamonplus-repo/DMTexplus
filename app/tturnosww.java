package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnosww", "/app.tturnosww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnosww extends GXWebObjectStub
{
   public tturnosww( )
   {
   }

   public tturnosww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnosww.class ));
   }

   public tturnosww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnosww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnosww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TURNOS";
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

