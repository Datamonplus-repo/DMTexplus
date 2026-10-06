package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterpesww", "/app.tterpesww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterpesww extends GXWebObjectStub
{
   public tterpesww( )
   {
   }

   public tterpesww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterpesww.class ));
   }

   public tterpesww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterpesww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterpesww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TERMINALES DE PESAJE";
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

