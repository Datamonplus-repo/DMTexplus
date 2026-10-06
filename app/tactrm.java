package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactrm", "/app.tactrm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactrm extends GXWebObjectStub
{
   public tactrm( )
   {
   }

   public tactrm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactrm.class ));
   }

   public tactrm( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactrm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactrm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO DE LA ACTIVIDAD EN  RA";
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

