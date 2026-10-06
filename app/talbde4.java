package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbde4", "/app.talbde4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbde4 extends GXWebObjectStub
{
   public talbde4( )
   {
   }

   public talbde4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbde4.class ));
   }

   public talbde4( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbde4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbde4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALTA ALBARANES PZA-Dispos-KMA";
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

