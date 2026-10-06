package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttph", "/app.ttph"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttph extends GXWebObjectStub
{
   public ttph( )
   {
   }

   public ttph( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttph.class ));
   }

   public ttph( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttph_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttph_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST PH";
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

