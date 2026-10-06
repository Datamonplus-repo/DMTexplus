package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttabla4", "/app.ttabla4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttabla4 extends GXWebObjectStub
{
   public ttabla4( )
   {
   }

   public ttabla4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttabla4.class ));
   }

   public ttabla4( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttabla4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttabla4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CUADERNO ENCARGOS POR CLIENTE";
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

