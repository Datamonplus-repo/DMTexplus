package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsecciww", "/app.ttsecciww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsecciww extends GXWebObjectStub
{
   public ttsecciww( )
   {
   }

   public ttsecciww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsecciww.class ));
   }

   public ttsecciww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsecciww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsecciww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MANTENIMIENTO SECCIONES, FASES";
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

