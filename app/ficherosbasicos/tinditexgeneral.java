package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexgeneral", "/app.ficherosbasicos.tinditexgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexgeneral extends GXWebObjectStub
{
   public tinditexgeneral( )
   {
   }

   public tinditexgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexgeneral.class ));
   }

   public tinditexgeneral( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINDITEXGeneral";
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

