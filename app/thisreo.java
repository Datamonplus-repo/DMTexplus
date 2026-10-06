package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thisreo", "/app.thisreo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thisreo extends GXWebObjectStub
{
   public thisreo( )
   {
   }

   public thisreo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thisreo.class ));
   }

   public thisreo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thisreo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thisreo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO REOPERADOS";
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

