package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tptph", "/app.tptph"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tptph extends GXWebObjectStub
{
   public tptph( )
   {
   }

   public tptph( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tptph.class ));
   }

   public tptph( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tptph_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tptph_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LLamada con parametro";
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

