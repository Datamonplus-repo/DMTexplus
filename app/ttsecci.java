package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsecci", "/app.ttsecci"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsecci extends GXWebObjectStub
{
   public ttsecci( )
   {
   }

   public ttsecci( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsecci.class ));
   }

   public ttsecci( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsecci_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsecci_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO SECCIONES, FASES";
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

