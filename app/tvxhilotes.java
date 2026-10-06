package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxhilotes", "/app.tvxhilotes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxhilotes extends GXWebObjectStub
{
   public tvxhilotes( )
   {
   }

   public tvxhilotes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxhilotes.class ));
   }

   public tvxhilotes( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxhilotes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxhilotes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura HILOTES en VERTEX";
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

