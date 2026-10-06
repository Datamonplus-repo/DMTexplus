package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisfso", "/app.tdisfso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisfso extends GXWebObjectStub
{
   public tdisfso( )
   {
   }

   public tdisfso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisfso.class ));
   }

   public tdisfso( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisfso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisfso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES FASE";
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

