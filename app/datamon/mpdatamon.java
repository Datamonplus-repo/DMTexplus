package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.datamon.mpdatamon", "/app.datamon.mpdatamon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mpdatamon extends GXWebObjectStub
{
   public mpdatamon( )
   {
   }

   public mpdatamon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mpdatamon.class ));
   }

   public mpdatamon( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mpdatamon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mpdatamon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Datamon";
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

