package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwstppreh", "/app.webwstppreh"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstppreh extends GXWebObjectStub
{
   public webwstppreh( )
   {
   }

   public webwstppreh( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstppreh.class ));
   }

   public webwstppreh( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstppreh_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstppreh_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipos de Presentacion";
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

