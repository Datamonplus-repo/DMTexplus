package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwinglote", "/app.webwinglote"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwinglote extends GXWebObjectStub
{
   public webwinglote( )
   {
   }

   public webwinglote( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwinglote.class ));
   }

   public webwinglote( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwinglote_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwinglote_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lote";
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

