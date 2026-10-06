package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdalm", "/app.tprdalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdalm extends GXWebObjectStub
{
   public tprdalm( )
   {
   }

   public tprdalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdalm.class ));
   }

   public tprdalm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ASOCIO A PRODUCTOS ALMACENES";
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

